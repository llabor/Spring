package com.banco;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		Cliente cliente = ctx.getBean(Cliente.class);
		
		Cuenta c = (Cuenta) ctx.getBean("cuentaCredImpl");
		System.out.println(c);
		
		System.out.println(cliente);

	}

}
