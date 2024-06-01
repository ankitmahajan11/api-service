package com.nagp.devops.apiservice.service.impl;

import com.nagp.devops.apiservice.dto.EmployeeDto;
import com.nagp.devops.apiservice.entity.Employee;
import com.nagp.devops.apiservice.repository.EmployeeRepository;
import com.nagp.devops.apiservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDto> get() {
        System.out.println("at service layer to get employee details");
        List<EmployeeDto> result = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> result.add(EmployeeDto.builder()
                .id(employee.getId())
                .name(employee.getName())
                .contactNumber(employee.getContactNumber())
                .designation(employee.getDesignation())
                .build()));
        return result;
    }
}
