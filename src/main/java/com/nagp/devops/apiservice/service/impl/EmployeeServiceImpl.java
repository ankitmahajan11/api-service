package com.nagp.devops.apiservice.service.impl;

import com.nagp.devops.apiservice.dto.EmployeeDto;
import com.nagp.devops.apiservice.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<EmployeeDto> get() {
        return List.of(EmployeeDto.builder()
                .id("3197763")
                .name("Ankita Gupta")
                .contactNumber("989377093")
                .designation("Staff Engineer")
                .build());
    }
}
