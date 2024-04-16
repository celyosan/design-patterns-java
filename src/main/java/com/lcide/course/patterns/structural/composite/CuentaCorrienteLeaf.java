package com.lcide.course.patterns.structural.composite;

/**
 * Hijo
 * @author lcide
 *
 */
public class CuentaCorrienteLeaf implements CuentaComponent {
	
	private Double amount;
	private String name;	

	public CuentaCorrienteLeaf(Double amount, String name) {
		super();
		this.amount = amount;
		this.name = name;
	}

	@Override
	public void showAccountName() {
		System.out.println("Cuenta corriente: " + this.name);		
	}

	@Override
	public Double getAmount() {
		return this.amount;
	}

}
