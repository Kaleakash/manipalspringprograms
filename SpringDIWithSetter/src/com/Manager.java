package com;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Manager implements InitializingBean,DisposableBean{

	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("pre-defined init method");
	}
	public Manager() {
		// TODO Auto-generated constructor stub
		System.out.println("Object created....");
	}
	public void init() {
		System.out.println("Object initialization");
	}
	public void display() {
		System.out.println("Manger display method");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("pre-defined destory method");
	}
	public void destroy1() {
		System.out.println("Object destroy");
	}
}
