package com.javarticles.classloader;

import java.util.HashSet;
import java.util.Set;

public class Company {
    private Set<Employee> employees;
    
    public void addEmployee(Employee employee) {
        if (employees == null) {
            employees = new HashSet<>();
        }
        employees.add(employee);
    }
    
    public void removeAllEmployees() {
        employees.clear();
    }
}
