package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

public static void main(String[] args) {
	Resource res = new ClassPathResource("beans.xml");
	BeanFactory fac = new XmlBeanFactory(res);
	Employee emp = (Employee)fac.getBean("obj1");
	emp.display();

	Employee emp1 = (Employee)fac.getBean("obj1");
	emp1.display();

	Employee emp2 = (Employee)fac.getBean("obj2");
	emp2.display();
	
	Employee emp3 = (Employee)fac.getBean("obj2");
	emp3.display();
	
	System.out.println(emp1);
	System.out.println(emp2);
	System.out.println(emp3);
	
	Employee emp4= (Employee)fac.getBean("obj3");
	System.out.println(emp4);
	
	
	Resource res1 = new ClassPathResource("beans.xml");
	BeanFactory fac1 = new XmlBeanFactory(res);
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	
	Employee emp5 = (Employee)ac.getBean("obj3");
	
	
}

}
