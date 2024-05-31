package com.nagp.devops.apiservice.controller;

import com.nagp.devops.apiservice.dto.EmployeeDto;
import com.nagp.devops.apiservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping(produces = "application/json")
    public List<EmployeeDto> get(){
        return service.get();
    }
}
