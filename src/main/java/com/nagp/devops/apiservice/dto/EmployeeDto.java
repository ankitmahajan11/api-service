package com.nagp.devops.apiservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class EmployeeDto {
    private final String id;
    private final String name;
    private final String designation;
    private final String contactNumber;
}
