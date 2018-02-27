package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		Customer customer = (Customer) ctx.getBean("customerBean");
		
		System.out.println(customer);
		
		ctx.close();
	}
}
