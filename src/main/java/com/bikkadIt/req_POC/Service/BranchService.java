package com.bikkadIt.req_POC.Service;

import com.bikkadIt.req_POC.dtos.BranchDto;
import com.bikkadIt.req_POC.dtos.DepartmentDto;

public interface BranchService {
    BranchDto createBranch(BranchDto branchDto);

//    BranchDto createBranchWithDepartments(BranchDto branchDto);

    DepartmentDto createBranchWithDepartments(DepartmentDto departmentDto, Integer branchId);
}
