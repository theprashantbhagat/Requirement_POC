package com.bikkadIt.req_POC.Service;

import com.bikkadIt.req_POC.dtos.BranchDto;

public interface BranchService {
    BranchDto createBranch(BranchDto branchDto);

    BranchDto createBranchWithDepartments(BranchDto branchDto);
}
