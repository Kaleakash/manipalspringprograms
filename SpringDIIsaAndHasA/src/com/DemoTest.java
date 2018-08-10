package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Manager mgr = (Manager)ac.getBean("mgr1");
		System.out.println("Id is "+mgr.getId()+" Name is"+mgr.getName()+" Number of emp"+mgr.getNumberOfEmp());
		Address add = mgr.getAdd();
		System.out.println("City is "+add.getCity()+" State is "+add.getState());
	}

}
