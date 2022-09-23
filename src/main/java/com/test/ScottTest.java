package com.test;
import com.mapper.DeptMapper;
import com.mapper.EmpMapper;
import com.pojo.Dept;
import com.pojo.Emp;
import com.service.DeptService;
import com.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
public class ScottTest {
    ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    DeptService deptService= (DeptService)ac.getBean("deptService");
    EmpService empService= (EmpService)ac.getBean("empService");

    @Test
   public void selectDept(){

      List<Dept> deptList=deptService.downOption();
       for (Dept d:deptList) {
           System.out.println(d);
       }
   }

   @Test
   public void selectEmp(){
       Emp emp=new Emp();
//       emp.setEmpno(7788);
//      emp.setEname("SCOTT");
    //  emp.setJob("SALESMAN");
      emp.setDept(new Dept(20,null,null));
       List<Emp> emplist=empService.show(emp);
       for (Emp e:emplist ) {
           System.out.println(e);
       }
   }

   @Test
   public void insertEmp(){
       Dept dept= new Dept(10,null,null);
       Emp emp=new Emp(1,"holly","teacher",7788,
               "2015-05-05",1200.00,15.00,dept);
       System.out.println(empService.add(emp)>0?"add success":"add fail");
   }
   @Test
   public void updateEmp(){
       Dept dept= new Dept(20,null,null);
       Emp emp=new Emp(1,"holly","teacher",7788,
               "2015-05-05",1200.00,15.00,dept);
       System.out.println(empService.edit(emp)>0?"update success":"update fail");
   }
   @Test
   public void deleteEmp(){
       Emp emp=new Emp();
       emp.setEmpno(1);
       System.out.println(empService.del(emp)>0?"delete success":"delete fail");
   }
}
