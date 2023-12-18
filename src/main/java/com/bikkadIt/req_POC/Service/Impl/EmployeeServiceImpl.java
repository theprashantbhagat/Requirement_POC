package com.bikkadIt.req_POC.Service.Impl;

import com.bikkadIt.req_POC.Service.EmployeeService;
import com.bikkadIt.req_POC.dtos.EmployeeDto;
import com.bikkadIt.req_POC.entities.Employee;
import com.bikkadIt.req_POC.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        String empId = UUID.randomUUID().toString();
        employeeDto.setEmployeeId(empId);
        Employee employee = this.modelMapper.map(employeeDto, Employee.class);
        Employee save = this.employeeRepository.save(employee);

        return this.modelMapper.map(save,EmployeeDto.class);
    }
}
