package com.test;

import org.springframework.stereotype.Component;

@Component
public class Logger {
	
	private int idLogger;
	
	public void setIdLogger(int idLogger) {
		this.idLogger = idLogger;
	}

}
