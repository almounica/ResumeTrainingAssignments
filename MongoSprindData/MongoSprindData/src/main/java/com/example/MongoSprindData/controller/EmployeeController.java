package com.example.MongoSprindData.controller;

import com.example.MongoSprindData.Repository.EmployeeRepository;
import com.example.MongoSprindData.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Added employee with id: "+ employee.getEid();
    }

    @GetMapping("/findAllEmployees")
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/findAllEmployee/{eid}")
    public Optional<Employee> getEmployee(@PathVariable int eid){
        return employeeRepository.findById(eid);
    }

    @DeleteMapping("/delete/{eid}")
    public String deleteEmployee(@PathVariable int eid){
        employeeRepository.deleteById(eid);
        return "employee deleted with id :"+ eid;
    }

}
