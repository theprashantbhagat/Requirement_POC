package com.bikkadIt.req_POC.Service.Impl;

import com.bikkadIt.req_POC.Service.EmployeeService;
import com.bikkadIt.req_POC.dtos.EmployeeDto;
import com.bikkadIt.req_POC.entities.Department;
import com.bikkadIt.req_POC.entities.Employee;
import com.bikkadIt.req_POC.repositories.DepartmentRepository;
import com.bikkadIt.req_POC.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = this.modelMapper.map(employeeDto, Employee.class);
        Employee save = this.employeeRepository.save(employee);
        return this.modelMapper.map(save,EmployeeDto.class);
    }

    @Override
    public EmployeeDto getEmployeesByMgrId(Integer mgrId) {

        Employee employees = this.employeeRepository.findByMgrId(mgrId);

        return this.modelMapper.map(employees,EmployeeDto.class);
    }

    @Override
    public EmployeeDto createEmployeeWithDepartment(EmployeeDto employeeDto, Integer departmentId) {

        Department department = departmentRepository.findById(departmentId).get();
        Employee employee = this.modelMapper.map(employeeDto, Employee.class);
        employee.setDepartment(department);
        Employee save = this.employeeRepository.save(employee);
        return this.modelMapper.map(save,EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> getEmployeeByDepartmentId(Integer departmentId) {

        List<Employee> employee = this.employeeRepository.findByDepartmentDepartmentId(departmentId);
        return employee.stream().map(e->this.modelMapper.map(e,EmployeeDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDto> getEmployeesWithHighestSalaryInEachDepartment() {

        List<Employee> emps = employeeRepository.findEmployeesWithHighestSalaryInEachDepartment();
        return emps.stream().map(e->this.modelMapper.map(e,EmployeeDto.class)).collect(Collectors.toList());
    }


}
