package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Logger {
	
	private int idLogger;
	
	public int getIdLogger() {
		return this.idLogger;
	}
}
