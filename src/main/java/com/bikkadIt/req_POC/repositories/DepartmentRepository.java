package com.bikkadIt.req_POC.repositories;

import com.bikkadIt.req_POC.entities.Department;
import com.bikkadIt.req_POC.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {



   // Department findByDepartmentId(Integer departmentId);


}
