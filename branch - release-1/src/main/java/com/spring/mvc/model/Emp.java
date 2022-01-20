package com.spring.mvc.model;

import org.springframework.stereotype.Component;

@Component
public class Emp {

	private int id;
	private String name;
	private String designation;
	private float salary;

	public Emp() {	}

	public Emp(int id, String name, String designation, float salary) {		
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + id + ", Name=" + name + ", Designation=" + designation + ", Salary=" + salary + "]";
	}
}