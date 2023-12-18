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

import java.util.Optional;
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

    @Override
    public DepartmentDto createBranchWithDepartments(DepartmentDto departmentDto, Integer branchId) {

        Branch branch = branchRepository.findById(branchId).get();
        Department department = this.modelMapper.map(departmentDto, Department.class);
        department.setBranch(branch);
        Department save = this.departmentRepository.save(department);

        return this.modelMapper.map(save, DepartmentDto.class);
    }


}
