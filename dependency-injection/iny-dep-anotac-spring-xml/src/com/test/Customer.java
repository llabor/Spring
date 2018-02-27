package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	//@Autowired
	private Logger log;
	
	public Customer() {}
	
	//@Autowired
	public Customer(Logger log) {
		this.log = log;
	}

	@Autowired
	public void setLog(Logger log) {
		this.log = log;
	}
	
	@Override
	public String toString() {
		return "Customer [log = " + log + "]";
	}

}
