package com.bikkadIt.req_POC.Service;

import com.bikkadIt.req_POC.dtos.EmployeeDto;
import com.bikkadIt.req_POC.entities.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

//    List<EmployeeDto> getEmployeesByManagerId(String mgrId);
}
