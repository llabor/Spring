package com.banco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cliente {

	private String nombre;
	
	
	@Qualifier("cuentaCteImpl")
	@Autowired
	private Cuenta ctaCte;
	
	@Autowired
	@Qualifier("cuentaCredImpl")
	private Cuenta ctaCred;
	
	
}
