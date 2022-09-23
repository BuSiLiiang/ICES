package com.mapper;

import com.pojo.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface EmpMapper {
    List<Emp> selectEmp(Emp emp);
    int insertEmp(Emp emp);
    int updateEmp(Emp emp);
    int deleteEmp(Emp emp);
}
