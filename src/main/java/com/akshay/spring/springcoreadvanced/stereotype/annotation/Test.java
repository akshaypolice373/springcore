package com.akshay.spring.springcoreadvanced.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/akshay/spring/springcoreadvanced/stereotype/annotation/config.xml");
		Instructor instructor = (Instructor) ctx.getBean("inst");
		System.out.println(instructor);
	}

}
