package com.example.RestUsingSpring.restusingspring.RestController;

import com.example.RestUsingSpring.restusingspring.Entity.Employee;
import com.example.RestUsingSpring.restusingspring.dao.EmployeeDAO;
import com.example.RestUsingSpring.restusingspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5000")
public class EmployeeRestController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee = employeeService.findById(employeeId);
        if(theEmployee==null){
            throw new RuntimeException("Employee ID not found - " + employeeId);
        }
        return theEmployee;
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee theEmployee){
        //also in case they pass in an ID in JSON ,set the ID to 0 as so to create new employee instead of updating

        theEmployee.setId(0);

        Employee dbEmployee  = employeeService.save(theEmployee);

        return dbEmployee;
    }
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    @DeleteMapping("/employee/{empID}")
    public String deleteEmployee(@PathVariable int empID){
        Employee tempEmployee = employeeService.findById(empID);
        if(tempEmployee== null){
            throw new RuntimeException("Employee ID not found: " +empID);
        }
        employeeService.deleteById(empID);
        System.out.println("Employee no. " + empID + "Deleted Successfully");
        return "Employee ID: " +empID+ " Deleted";
    }
}
