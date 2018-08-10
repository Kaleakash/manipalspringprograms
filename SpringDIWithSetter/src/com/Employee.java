package com;


import java.util.List;
import java.util.Set;

public class Employee {
private int id;
private String name;
private Address add;
private Set<String> ss;
private List<Integer> ll;

public Set<String> getSs() {
	return ss;
}
public void setSs(Set<String> ss) {
	this.ss = ss;
}
public List<Integer> getLl() {
	return ll;
}
public void setLl(List<Integer> ll) {
	this.ll = ll;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
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

}
