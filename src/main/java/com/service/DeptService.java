package com.service;

import com.pojo.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DeptService {
    List<Dept> downOption();
}
