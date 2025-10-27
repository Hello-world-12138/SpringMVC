package com.amk.service.impl;

import com.amk.mapper.EmployeeMapper;
import com.amk.pojo.Employee;
import com.amk.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/10/27:17:21
 * @See:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAll() {
        List<Employee> employees=employeeMapper.querylist();
        return employees;
    }
}
