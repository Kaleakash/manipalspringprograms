package com;

public class Manager extends Employee{
private int numberOfEmp;
private Address add;
public Manager() {
	
}
public Manager(Address add) {
	this.add = add;
}

public int getNumberOfEmp() {
	return numberOfEmp;
}
public void setNumberOfEmp(int numberOfEmp) {
	this.numberOfEmp = numberOfEmp;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}

}
