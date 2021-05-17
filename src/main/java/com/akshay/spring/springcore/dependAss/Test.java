package com.akshay.spring.springcore.dependAss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/akshay/spring/springcore/dependAss/config.xml");
		University university = (University) ctx.getBean("university");
		System.out.println(university);

	}

}
