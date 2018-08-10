package com;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao ed = (EmployeeDao)ac.getBean("employeeDao");
		//Normal Jdbc code 
		//int res = ed.insertEmp(101, "Ravi", 18000);
		
		//jdbcTemplate insert the Records 
		//int res = ed.insertJdbcTemplate(103,"Rahul", 45000);
		//System.out.println(res);
		//jdbcTempalte delte the Recods 
		
		/*int res = ed.deleteJdbcTemplate(1);
		if(res>0) {
			System.out.println("Record deleted successfully...");
		}else {
			System.out.println("Record not present");
		}*/
		
		List<Employee> listOfRec =  ed.getEmployeeInfo();
		System.out.println("Number of rec "+listOfRec.size());
		Iterator<Employee> li = listOfRec.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
		}
		
	}

}
