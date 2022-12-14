package com.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 多方引用一方对象
 */
@Component
public class Emp implements Serializable {
  private Integer empno             ;
  private String  ename           ;
  private String  job         ;
  private Integer mgr           ;
  private String  hiredate           ;
  private Double  sal         ;
  private Double  comm               ;
  private Dept dept;

  public Emp() {
  }

  public Emp(Integer empno, String ename, String job, Integer mgr, String hiredate, Double sal, Double comm, Dept dept) {
    this.empno = empno;
    this.ename = ename;
    this.job = job;
    this.mgr = mgr;
    this.hiredate = hiredate;
    this.sal = sal;
    this.comm = comm;
    this.dept = dept;
  }

  public Integer getEmpno() {
    return empno;
  }

  public void setEmpno(Integer empno) {
    this.empno = empno;
  }


  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }


  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }


  public Integer getMgr() {
    return mgr;
  }

  public void setMgr(Integer mgr) {
    this.mgr = mgr;
  }


  public String getHiredate() {
    return hiredate;
  }

  public void setHiredate(String hiredate) {
    this.hiredate = hiredate;
  }


  public Double getSal() {
    return sal;
  }

  public void setSal(Double sal) {
    this.sal = sal;
  }


  public Double getComm() {
    return comm;
  }

  public void setComm(Double comm) {
    this.comm = comm;
  }

  public Dept getDept() {
    return dept;
  }

  public void setDept(Dept dept) {
    this.dept = dept;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "empno=" + empno +
            ", ename='" + ename + '\'' +
            ", job='" + job + '\'' +
            ", mgr=" + mgr +
            ", hiredate='" + hiredate + '\'' +
            ", sal=" + sal +
            ", comm=" + comm +
            ", dept=" + dept +
            '}';
  }
}
