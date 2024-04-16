package com.lcide.course.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CuentaComposite implements CuentaComponent {
	
	private List<CuentaComponent> childCuentas;
	private String titular;
	
	public CuentaComposite(String titular) {
		super();
		this.childCuentas = new ArrayList<>();
		this.titular = titular;
	}

	@Override
	public void showAccountName() {
		System.out.println("Cuentas de " + this.titular);
		childCuentas.forEach(CuentaComponent::showAccountName);		
	}

	@Override
	public Double getAmount() {		
		Double totalAmount = childCuentas.stream().mapToDouble(CuentaComponent::getAmount).sum();
		System.out.println("El total de " + titular + " es: " + totalAmount);
		return totalAmount;
	}
	
	public void addCuenta(CuentaComponent cuenta) {
		childCuentas.add(cuenta);
	}
	
	public void removeCuenta(CuentaComponent cuenta) {
		childCuentas.remove(cuenta);
	}
	
}
