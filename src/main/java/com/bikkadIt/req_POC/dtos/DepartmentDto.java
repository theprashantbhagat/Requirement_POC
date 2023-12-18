package com.bikkadIt.req_POC.dtos;

import com.bikkadIt.req_POC.entities.Branch;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentDto {

    private String departmentId;

    private String departmentName;


}
