package com.bikkadIt.req_POC.controller;

import com.bikkadIt.req_POC.Service.BranchService;
import com.bikkadIt.req_POC.dtos.BranchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @PostMapping("/branches")
    public ResponseEntity<BranchDto> createBranch(@RequestBody BranchDto branchDto) {
        BranchDto savedBranch = branchService.createBranch(branchDto);
        return new ResponseEntity<>(savedBranch, HttpStatus.CREATED);
    }
}
