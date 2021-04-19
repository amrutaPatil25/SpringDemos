package com.spring.model;

import java.util.HashSet;
import java.util.Set;

public class Employee
{
	int empId;
	String name;
	double salary;
	MyDate doj;
	Set<String> skills = new HashSet<>();
	public Employee()
	{
		empId = 100 ;
		name = "Abc" ;
		salary = 15000;
		doj = new MyDate();
		skills.add("c");
	}
	public Employee(int empId, String name, double salary,MyDate doj,Set<String> skills) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.doj = doj ;
		this.skills = skills;
	}
	public MyDate getDoj() {
		return doj;
	}
	public void setDoj(MyDate doj) {
		this.doj = doj;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "Date of joining :"+doj+"Skills : "+skills+"]";
	}
	
	

}
