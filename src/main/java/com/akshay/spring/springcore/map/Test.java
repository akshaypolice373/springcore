package com.akshay.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/akshay/spring/springcore/map/mapconfig.xml");
		Customer c1 = (Customer) ctx.getBean("customer");
		System.out.println(c1);
//		System.out.println("Products: " + c1.getProducts());

	}

}
