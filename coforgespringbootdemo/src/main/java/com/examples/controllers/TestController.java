package com.examples.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

class Employee{
	int id;
	String name;
	String dept;
	public Employee() {
		
	}
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}

@RestController
public class TestController {
	

	@GetMapping("/get1")
	public String getMapping1() {
		return "Hello, get1 method is called";
	}
	
	@GetMapping("/get2")
	public String getMapping2() {
		return "Hello, get2 method is called";
	}
	
	@GetMapping("/employee")
	public Employee getEmployee() {
		return new Employee(1,"praveen","finance");
	}
	
	@PostMapping("/employee")
	public Employee postEmployee(@RequestBody Employee emp, @RequestParam("org")String office, 
			@RequestParam("pin")String pin) {
		emp.setDept("Operations in --->"+office);
		return emp;
	}
	
	@PostMapping("/post/{name}/{city}")
	public String postMapping(@PathVariable("name") String city, @PathVariable("city") String name) {
		
		
		return "Hello  >>"+name+">> Welcome to "+city;
	}
	
	
	@PutMapping("/put")
	public String putMapping() {
		return "Put method is called";
	}

	@DeleteMapping("/delete")
	public String deleteMapping() {
		return "delete method is called";
	}

}
