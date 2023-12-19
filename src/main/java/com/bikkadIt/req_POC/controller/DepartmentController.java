package com.bikkadIt.req_POC.controller;

import com.bikkadIt.req_POC.Service.DepartmentService;
import com.bikkadIt.req_POC.Service.EmployeeService;
import com.bikkadIt.req_POC.dtos.DepartmentDto;
import com.bikkadIt.req_POC.dtos.EmployeeDto;
import com.bikkadIt.req_POC.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto savedDepartment = departmentService.createDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @PostMapping("/departments/{departmentId}/employees")
    public ResponseEntity<EmployeeDto> createEmployeeWithDepartment(@RequestBody EmployeeDto employeeDto,@PathVariable Integer departmentId)
    {
        EmployeeDto employeeWithDepartment = this.employeeService.createEmployeeWithDepartment(employeeDto, departmentId);
        return new ResponseEntity<>(employeeWithDepartment,HttpStatus.CREATED);
    }
}
