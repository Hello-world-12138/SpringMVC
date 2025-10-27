package com.amk.mapper;

import com.amk.pojo.Employee;

import java.util.List;

/**
 * @author 阿明楷
 * @Date 2025/10/27:17:06
 * @See:
 */
public interface EmployeeMapper {
    //查询全部员工信息
   List<Employee> querylist();
}
