package com.employeeAap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class EmployeeAapApplication implements CommandLineRunner{

	@Autowired
	private EmployeeRepository er;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeAapApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee("101","Kanak","Developer","python developer","27000");
		Employee e2 = new Employee("101","Ankit","Developer","java developer","29000");
	    Employee e3 = new Employee("101","Tanvi","Developer","php developer","26000");
	    
	    er.save(e1);
	    er.save(e2);
	    er.save(e3);
	    
	    System.out.println("_____________________________________________________________");
	    
	    List<Employee> emp =  er.findAll();
	    for (Employee employee : emp) {
			System.out.println(employee);
		}
		
	}

}
