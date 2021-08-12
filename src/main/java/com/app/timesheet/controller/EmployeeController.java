package com.app.timesheet.controller;

import com.app.timesheet.response.EmployeeResponse;
import com.app.timesheet.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<?> createEmployee(){
        EmployeeResponse employeeResponse = new EmployeeResponse(employeeService.createEmployee());
        return ResponseEntity.status(HttpStatus.OK)
                .body(employeeResponse);
    }


}
