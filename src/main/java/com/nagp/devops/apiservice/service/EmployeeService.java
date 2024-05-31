package com.nagp.devops.apiservice.service;

import com.nagp.devops.apiservice.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> get();
}
