package com.bikkadIt.req_POC.Service;

import com.bikkadIt.req_POC.dtos.EmployeeDto;
import com.bikkadIt.req_POC.entities.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeesByMgrId(Integer mgrId);

    EmployeeDto createEmployeeWithDepartment(EmployeeDto employeeDto,Integer departmentId);

    List<EmployeeDto> getEmployeeByDepartmentId(Integer departmentId);

    List<EmployeeDto> getEmployeesWithHighestSalaryInEachDepartment();
}
