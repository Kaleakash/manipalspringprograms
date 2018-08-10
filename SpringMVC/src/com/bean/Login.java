package com.bean;

import org.springframework.stereotype.Component;

@Component
public class Login {
private String name;
private String pass;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

}
