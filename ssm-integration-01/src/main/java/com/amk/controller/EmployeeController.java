package com.amk.controller;

import com.amk.pojo.Employee;
import com.amk.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/10/27:17:24
 * @See:
 */
@RestController
@RequestMapping("emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("find")
    public List<Employee> find(){
        List<Employee> all = employeeService.findAll();
        return all;
    }
}
