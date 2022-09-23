package com.service;

import com.mapper.EmpMapper;
import com.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service的功能等同于代理对象在Spring的xml文件中动态添加bean节点，
//如果不指定名称，则底层代理在构建bean节点的时候id是类的第一个首字母小写
//@Service等同于<bean id="empServiceImpl" class="com.Service.EmpServiceImpl"/>
//@Service(value="ems") 等同于代理对象在spring.xml文件中动态添加一个id为ems的bean节点<bean id="ems" class="com.Service.EmpServiceImpl"/>
@Service
public class EmpServiceImpl implements EmpService {
    //  @Autowired是Spring的资源包下注解，按照对象的类型进行自动注入，和对象名称无关，只要类型是匹配的，代理就会在你需要的时候给你注入对象值
    //  @Resourse是javax包下的注解，按照对象属性名进行注入，和对象名称关系密切，如果对象名称不匹配，则不能完成注入，会报错
    //  总结：相比而言，使用@Resourse出错的几率大，因此我们常规选择使用@Autowired
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> show(Emp emp) {
        return empMapper.selectEmp(emp);
    }

    @Override
    public int add(Emp emp) {
        return empMapper.insertEmp(emp);
    }

    @Override
    public int edit(Emp emp) {
        return empMapper.updateEmp(emp);
    }

    @Override
    public int del(Emp emp) {
        return empMapper.deleteEmp(emp);
    }
}
