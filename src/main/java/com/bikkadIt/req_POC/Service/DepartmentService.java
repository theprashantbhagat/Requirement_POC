package com.bikkadIt.req_POC.Service;

import com.bikkadIt.req_POC.dtos.DepartmentDto;
import com.bikkadIt.req_POC.entities.Department;

public interface DepartmentService {
    DepartmentDto createDepartment(DepartmentDto departmentDto);
}
