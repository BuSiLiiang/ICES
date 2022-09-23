package com.service;

import com.pojo.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpService {
    List<Emp> show(Emp emp);
    int add(Emp emp);
    int edit(Emp emp);
    int del(Emp emp);
}
