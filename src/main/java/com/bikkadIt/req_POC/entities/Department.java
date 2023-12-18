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
@Table(name = "department")
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;

    private String departmentName;

    @ManyToOne
    @JoinColumn(name = "branch_id")
   private Branch branch;

    @OneToMany
    private List<Employee> employees=new ArrayList<>();


}
