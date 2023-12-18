package com.bikkadIt.req_POC.Service;

import com.bikkadIt.req_POC.dtos.EmployeeDto;
import com.bikkadIt.req_POC.entities.Employee;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}
