package com.bikkadIt.req_POC.dtos;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BranchDto {

    private String branchId;

    private String branchName;

    private List<DepartmentDto> departments = new ArrayList<>();
}
