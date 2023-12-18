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
@Table(name = "branch")
public class Branch {


    @Id
    private String branchId;

    private String branchName;

    @OneToMany
    private List<Department> departments=new ArrayList<>();
}
