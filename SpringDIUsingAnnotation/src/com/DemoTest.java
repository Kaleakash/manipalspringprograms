package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	Employee emp = (Employee)ac.getBean("emp");
	emp.setId(100);
	emp.setName("Ajay");
	Address add = emp.getAdd();
	add.setCity("Bangalore");
	add.setState("Kar");
	System.out.println("Id "+emp.getId());
	System.out.println("Name "+emp.getName());
	System.out.println("City "+add.getCity());
	System.out.println("State "+add.getState());
	}

}
