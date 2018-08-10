package com;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		/*ApplicationContext ac   = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee)ac.getBean("obj1");
		System.out.println(emp.getId()+"---"+emp.getName());
		Address add1 = emp.getAdd();
		System.out.println("Address information through emp");
		System.out.println(add1.getCity()+"---"+add1.getState());
		Set<String> ss	= emp.getSs();
		System.out.println("Number of value in set "+ss.size());
		System.out.println(ss);
		List<Integer> ll = emp.getLl();
		System.out.println("Number of value in list "+ll.size());
		System.out.println(ll);
		
		
		Address add = (Address)ac.getBean("add1");
		System.out.println("Address informration directly through Address");
		System.out.println(add.getCity()+"---"+add.getState());*/
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Manager mgr = (Manager)ac.getBean("mgr");
		mgr.display();
	}

}
