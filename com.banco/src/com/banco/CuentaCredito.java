package com.banco;

import org.springframework.stereotype.Component;

@Component("cuentaCredImpl")
public class CuentaCredito implements Cuenta {

	private String numCuenta;
	
	@Override
	public double saldo() {
		return 0;
	}

}
