package com.bikkadIt.req_POC.Service;

import com.bikkadIt.req_POC.dtos.BranchDto;
import com.bikkadIt.req_POC.entities.Branch;

public interface BranchService {
    BranchDto createBranch(BranchDto branchDto);
}
