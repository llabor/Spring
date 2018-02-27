package com.test;

import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

@Named
public class Customer {
	
	//@Autowired
	private Logger log;
	
	public Customer() {}
	
	//@Inject
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
