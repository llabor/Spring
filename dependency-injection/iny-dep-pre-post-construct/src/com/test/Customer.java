package com.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private Logger log;
	
	public Customer() {}

	@Autowired
	public Customer(Logger log) {
		this.log = log;
	}

	public void setLog(Logger log) {
		this.log = log;
	}
	
	public Logger getLog() {
		return this.log;
	}
	
	@PostConstruct
    public void saludar(){
        System.out.println("Customer bean creado!");
    }

    @PreDestroy
    public void despedirse(){
        System.out.println("Customer bean eliminado...Adiós!");
    }
}
