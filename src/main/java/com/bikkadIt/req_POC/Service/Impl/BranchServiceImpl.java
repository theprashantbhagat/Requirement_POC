package com.bikkadIt.req_POC.Service.Impl;

import com.bikkadIt.req_POC.Service.BranchService;
import com.bikkadIt.req_POC.dtos.BranchDto;
import com.bikkadIt.req_POC.dtos.DepartmentDto;
import com.bikkadIt.req_POC.entities.Branch;
import com.bikkadIt.req_POC.entities.Department;
import com.bikkadIt.req_POC.repositories.BranchRepository;
import com.bikkadIt.req_POC.repositories.DepartmentRepository;
import jakarta.transaction.Transactional;
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
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public BranchDto createBranch(BranchDto branchDto) {


        Branch branch = this.modelMapper.map(branchDto, Branch.class);
        Branch save = this.branchRepository.save(branch);
        return this.modelMapper.map(save,BranchDto.class);
    }

    @Transactional
    public BranchDto createBranchWithDepartments(BranchDto branchDTO) {
        Branch branch = new Branch();
        branch.setBranchName(branchDTO.getBranchName());

        for (DepartmentDto departmentDTO : branchDTO.getDepartments()) {
            Department department = new Department();
            department.setDepartmentName(departmentDTO.getDepartmentName());
            department.setBranch(branch);
            branch.getDepartments().add(department);
        }

        Branch save = branchRepository.save(branch);
        return this.modelMapper.map(save,BranchDto.class);
    }
}
