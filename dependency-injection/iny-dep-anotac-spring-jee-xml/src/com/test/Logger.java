package com.test;

import javax.inject.Named;
import org.springframework.beans.factory.annotation.Value;

@Named
public class Logger {
	
	@Value("7")
	private int idLogger;

}
