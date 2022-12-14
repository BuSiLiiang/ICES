package com.pojo;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
/**
 * 一方引用多方list集合
 */
@Component
//实现序列化接口
public class Dept implements Serializable {
  private Integer deptno   ;
  private String  dname    ;
  private String  loc          ;

  public Dept() {
  }

  public Dept(Integer deptno, String dname, String loc) {
    this.deptno = deptno;
    this.dname = dname;
    this.loc = loc;
  }

  public Integer getDeptno() {
    return deptno;
  }

  public void setDeptno(Integer deptno) {
    this.deptno = deptno;
  }


  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }


  public String getLoc() {
    return loc;
  }

  public void setLoc(String loc) {
    this.loc = loc;
  }

  @Override
  public String toString() {
    return "Dept{" +
            "deptno=" + deptno +
            ", dname='" + dname + '\'' +
            ", loc='" + loc + '\'' +
            '}';
  }
}
