package com.akshay.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/akshay/spring/springcore/innerbeans/config.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee.hashCode());
		
		Employee employee1 = (Employee) ctx.getBean("employee");
		System.out.println(employee1.hashCode());
	}

}
