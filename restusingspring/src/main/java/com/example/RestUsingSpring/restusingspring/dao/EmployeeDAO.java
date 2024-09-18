package com.example.RestUsingSpring.restusingspring.dao;

import com.example.RestUsingSpring.restusingspring.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
