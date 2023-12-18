package com.bikkadIt.req_POC.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employee")
public class Employee {


    @Id
    private String employeeId;

    private String employeeName;

    private Double employeeSalary;

    private String mgrId;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
