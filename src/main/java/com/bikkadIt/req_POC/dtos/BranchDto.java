package com.bikkadIt.req_POC.dtos;

import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BranchDto {

    private String branchId;

    private String branchName;
}
