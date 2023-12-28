package com.uexcel.controller;

import com.uexcel.exception.handler.EmployeeNotFoundException;
import com.uexcel.model.Employee;
import com.uexcel.repository.EmployeeRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@EnableAutoConfiguration
@RestController
public class EmployeeController {
    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employee")
    List<Employee> getEmployee(){
      return repository.findAll();
    }

    @GetMapping("/employee/{id}")
    Employee getEmployeeById(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(() -> (new EmployeeNotFoundException("No employee with id " + id + " found.")));
    }

    @PostMapping("/employee")
    Employee seveEmployee( @RequestBody Employee newEmployee){
        return repository.save(newEmployee);
    }
    String Aooplpdlpelp;
    @DeleteMapping("/employee/{id}")
    String deleteEmployee(@PathVariable Long id){
        repository.deleteById(id);
        return "Employee deleted...";
    }

    @PutMapping("/employee/{id}")
     Employee updateEmployee(@PathVariable Long id, @RequestBody Employee newEmployee){
        return repository.findById(id).map(employee -> {
            employee.setFirstName(newEmployee.getFirstName());
            employee.setLastName(newEmployee.getLastName());
            employee.setTitle(newEmployee.getTitle());
            employee.setPhone(newEmployee.getPhone());
            return repository.save(employee);
        }).orElseThrow(() ->  new EmployeeNotFoundException("No employee with id " + id + " found."));

    }


}

