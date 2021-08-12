package com.app.timesheet.service;

import com.app.timesheet.entity.Employee;
import com.app.timesheet.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public int createEmployee() {
        return employeeRepository.save(new Employee()).getId();
    }
}
