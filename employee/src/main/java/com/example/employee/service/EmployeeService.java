package com.example.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.employeerepository.EmployeeRepository;
import com.example.employee.model.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployee(String employeeId) {
        return employeeRepository.findById(employeeId);
    }

    // Additional methods for tax calculation
}
