package com.lcide.course.patterns.structural.composite;

/**
 * Hijo
 * @author lcide
 *
 */

public class CuentaAhorroLeaf implements CuentaComponent{
	
	private Double amount;
	private String name;
	
	public CuentaAhorroLeaf(Double amount, String name) {
		super();
		this.amount = amount;
		this.name = name;
	}

	@Override
	public void showAccountName() {
		System.out.println("Cuenta ahorro: " + this.name);		
	}

	@Override
	public Double getAmount() {
		return this.amount;
	}

}
