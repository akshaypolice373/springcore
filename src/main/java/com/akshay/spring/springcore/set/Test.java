package com.akshay.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/akshay/spring/springcore/set/setconfig.xml");
		CarDealer cd1 = (CarDealer) ctx.getBean("cardealer");		
		System.out.println(cd1.getName()+" CarDealer");
		System.out.println("Car Models: "+ cd1.getModels());
	}

}
