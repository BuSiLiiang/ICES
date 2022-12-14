package com.service;

import com.mapper.DeptMapper;
import com.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> downOption() {
        return deptMapper.selectAllDept();
    }
}
