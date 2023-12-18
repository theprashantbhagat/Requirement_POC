package com.bikkadIt.req_POC.controller;

import com.bikkadIt.req_POC.Service.EmployeeService;
import com.bikkadIt.req_POC.dtos.EmployeeDto;
import com.bikkadIt.req_POC.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employees")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

//    @GetMapping("/employees/{mgrId}")
//    public ResponseEntity<List<EmployeeDto>> getEmployeesByManagerId(@PathVariable String mgrId) {
//        List<EmployeeDto> employeesDto = employeeService.getEmployeesByManagerId(mgrId);
//        return new ResponseEntity<>(employeesDto, HttpStatus.OK);
//    }
}
