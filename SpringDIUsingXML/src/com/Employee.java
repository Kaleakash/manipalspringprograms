package com;

public class Employee {
private int id;
private String name;
private float salary;

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

public Employee() {
	// TODO Auto-generated constructor stub
	System.out.println("Object created...");
	this.id = 100;
	this.name ="Raj";
	this.salary = 12000;
}
	public void display() {
		System.out.println("display method");
	}
}
