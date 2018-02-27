package com.banco;

import org.springframework.stereotype.Component;

@Component("cuentaCteImpl")
public class CuentaCorriente implements Cuenta {

	private String numCuenta;
	
	@Override
	public double saldo() {
		return 0;
	}

}
