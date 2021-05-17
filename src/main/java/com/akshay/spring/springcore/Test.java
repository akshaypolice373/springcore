package com.akshay.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		try {
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee Id: "+ emp.getId());
		System.out.println("Employee Name: "+ emp.getName());
		} finally {
			ctx.close();
		}
		
	}

	

}
