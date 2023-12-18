package com.bikkadIt.req_POC.Service.Impl;

import com.bikkadIt.req_POC.Service.DepartmentService;
import com.bikkadIt.req_POC.dtos.DepartmentDto;
import com.bikkadIt.req_POC.entities.Department;
import com.bikkadIt.req_POC.repositories.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {

        String deptId = UUID.randomUUID().toString();
        departmentDto.setDepartmentId(deptId);
        Department department = this.modelMapper.map(departmentDto, Department.class);
        Department save = this.departmentRepository.save(department);

        return this.modelMapper.map(save, DepartmentDto.class);
    }
}
