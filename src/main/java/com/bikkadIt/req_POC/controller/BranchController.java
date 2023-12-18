package com.bikkadIt.req_POC.controller;

import com.bikkadIt.req_POC.Service.BranchService;
import com.bikkadIt.req_POC.Service.DepartmentService;
import com.bikkadIt.req_POC.dtos.BranchDto;
import com.bikkadIt.req_POC.dtos.DepartmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/branches")
    public ResponseEntity<BranchDto> createBranch(@RequestBody BranchDto branchDto) {
        BranchDto savedBranch = branchService.createBranch(branchDto);
        return new ResponseEntity<>(savedBranch, HttpStatus.CREATED);
    }

    @PostMapping("/branches/{branchId}/departments")
    public ResponseEntity<DepartmentDto> createBranchWithDepartments(@RequestBody DepartmentDto departmentDto, @PathVariable Integer branchId){

        DepartmentDto branchWithDepartments = this.branchService.createBranchWithDepartments(departmentDto, branchId);
        return new ResponseEntity<>(branchWithDepartments,HttpStatus.CREATED);

    }

}
