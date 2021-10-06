package com.employee.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;



@RestController
public class EmployeeController {
    @Autowired
	private EmployeeRepository repo;
    
    @GetMapping("/")
    public String show() {
    	return "Success";
    }
    
    @PostMapping(value="/add")
    public Employee saveEmployee(@RequestBody Employee employee) {
    	repo.save(employee);
    	System.out.println("add");
//    	return "Successfully added";
    	return employee;
    }
    
    @GetMapping("/employeelist")
    public List<Employee> getEmployee(){
    	List<Employee> lst = repo.findAll();
    	return lst;
    }
    @PostMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){ // new value 
    	Employee emp = repo.findById(employee.getEmployeeId()).get(); // old emplye
    	emp.setEmployeeDesignatiion(employee.getEmployeeDesignatiion());
    	repo.save(emp);
    	return employee;
    }
    @PostMapping("/del")
    public String deleteEmployee(@RequestBody Employee employee) {
    	Employee demp = repo.findById(employee.getEmployeeId()).get();
    	repo.delete(demp);
    	//repo.deleteById(employee.getEmployeeId());
    	return "successfully deleted";
    }
}