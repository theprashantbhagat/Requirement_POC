package com.bikkadIt.req_POC.repositories;
import com.bikkadIt.req_POC.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findByMgrId(Integer mgrId);
    List<Employee> findByDepartment_DepartmentId(Integer departmentId);
}
