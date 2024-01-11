package com.task.java;

public class Employee {
	private String name;
	private int empid;
	private double salary;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	public Employee() {
		
	}
	public Employee(String name) {
		this.name=name;
	
	}
	public Employee(String name,int empid,double salary) {
		this.name=name;
		this.empid=empid;
		this.salary=salary;
	}
	public Employee(String name,int empid) {
		this.name=name;
		this.empid=empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}




