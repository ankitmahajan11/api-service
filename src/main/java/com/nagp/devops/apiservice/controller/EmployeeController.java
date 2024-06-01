package com.nagp.devops.apiservice.controller;

import com.nagp.devops.apiservice.dto.EmployeeDto;
import com.nagp.devops.apiservice.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping(produces = "application/json")
    public List<EmployeeDto> get(){
        System.out.println("getting employee details");
        return service.get();
    }
}
