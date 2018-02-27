package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Logger {
	
	@Value("7")
	private int idLogger;

}
