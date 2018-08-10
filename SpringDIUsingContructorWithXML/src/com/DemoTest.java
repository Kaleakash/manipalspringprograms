package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
	//Employee emp = //new Employee();
	//emp.display();
	//Resource res = new ClassPathResource("beans.xml");
	//BeanFactory factory = new XmlBeanFactory(res);
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		
			Employee emp1 = (Employee)factory.getBean("obj1");
			emp1.display();
			
			Employee emp2 = (Employee)factory.getBean("obj1");
			emp2.display();
	}

}
