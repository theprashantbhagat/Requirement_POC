package com.bikkadIt.req_POC.repositories;
import com.bikkadIt.req_POC.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findByMgrId(Integer mgrId);

    List<Employee> findByDepartmentDepartmentId(Integer departmentId);

    @Query("SELECT e FROM Employee e WHERE e.salary = (SELECT MAX(e2.salary) FROM Employee e2 WHERE e2.department = e.department)")
    List<Employee> findEmployeesWithHighestSalaryInEachDepartment();

}
