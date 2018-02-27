package com.test;

import javax.inject.Inject;
import javax.inject.Named;

//import org.springframework.context.annotation.Scope;

@Named
//@Scope("prototype")
public class Customer {
	
	//@Inject
	private Logger log;
	
	public Customer() {}
	
	//@Inject
	public Customer(Logger log) {
		this.log = log;
	}

	@Inject
	public void setLog(Logger log) {
		this.log = log;
	}
	
	@Override
	public String toString() {
		return "Customer [log = " + log + "]";
	}

}
