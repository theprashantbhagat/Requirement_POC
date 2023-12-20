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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    private String name;

    private Double salary;

    private Integer mgrId;

    @ManyToOne()
    @JoinColumn(name = "department_id")
    private Department department;
}
