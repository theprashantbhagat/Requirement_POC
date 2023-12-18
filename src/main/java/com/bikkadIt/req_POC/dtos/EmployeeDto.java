package com.bikkadIt.req_POC.dtos;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {

    private String employeeId;

    private String employeeName;

    private Double employeeSalary;

    private String mgrId;
}
