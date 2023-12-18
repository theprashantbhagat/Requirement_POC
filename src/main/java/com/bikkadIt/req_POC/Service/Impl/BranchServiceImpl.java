package com.bikkadIt.req_POC.Service.Impl;

import com.bikkadIt.req_POC.Service.BranchService;
import com.bikkadIt.req_POC.dtos.BranchDto;
import com.bikkadIt.req_POC.entities.Branch;
import com.bikkadIt.req_POC.repositories.BranchRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BranchServiceImpl implements BranchService {
    @Autowired
    private BranchRepository branchRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public BranchDto createBranch(BranchDto branchDto) {

        String branchId = UUID.randomUUID().toString();
        branchDto.setBranchId(branchId);
        Branch branch = this.modelMapper.map(branchDto, Branch.class);
        Branch save = this.branchRepository.save(branch);
        return this.modelMapper.map(save,BranchDto.class);
    }
}
