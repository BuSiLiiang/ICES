package com.controller;

import com.pojo.Dept;
import com.pojo.Emp;
import com.service.DeptService;
import com.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
public class CenterController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private EmpService  empService;

    @RequestMapping("/show.do")
    public String showData(HttpSession session, Model model){
        List<Dept> deptList =deptService.downOption();
        session.setAttribute("deptList",deptList);

        List<Emp> empList=empService.show(new Emp());
        model.addAttribute("empList",empList);

        return "main.jsp";
    }
    @RequestMapping("/option.do")
    public String showOption(Emp emp,Model model){
        List<Emp> empList=empService.show(emp);
        model.addAttribute("empList",empList);
        model.addAttribute("deptno",emp.getDept().getDeptno());

        return "main.jsp";
    }
    @RequestMapping("/Info.do")
    public String showInfo(Emp emp,Model model){
       Emp emp1= empService.show(emp).get(0);
       model.addAttribute("emp1",emp1);
       return "edit.jsp";
    }
    @RequestMapping("/edit.do")
    public String edit(Emp emp){
        empService.edit(emp);
        return "redirect:/show.do";
    }
    @RequestMapping("/add.do")
    public String add(Emp emp){
        empService.add(emp);
        return "redirect:/show.do";
    }
    @RequestMapping("/del.do")
    public String del(Emp emp){
        empService.del(emp);
        return "redirect:/show.do";
    }
}
