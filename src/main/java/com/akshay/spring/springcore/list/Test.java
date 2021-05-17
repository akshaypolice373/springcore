package com.akshay.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/akshay/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");		
		System.out.println("Hospital Name: "+ hospital.getName());
		System.out.println("Hospital Departments: "+ hospital.getDepartments());
	}

}
