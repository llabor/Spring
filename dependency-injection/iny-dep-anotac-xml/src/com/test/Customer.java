package com.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	@Autowired
	private Logger log;
	
	public Customer() {}
	
	public Customer(Logger log) {
		this.log = log;
	}

	public void setLog(Logger log) {
		this.log = log;
	}
	
	@Override
	public String toString() {
		return "Customer [log = " + log + "]";
	}

}
