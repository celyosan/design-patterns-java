package com.lcide.course.patterns.structural.decorator;

public class SecureCreditDecorator extends CreditDecorator{

	public SecureCreditDecorator(CreditComponent decoratedCredit) {
		super(decoratedCredit);
	}
	
	@Override
	public void config() {
		decoratedCredit.config();
		configSecure();
	}

	private void configSecure() {
		System.out.println("La tarjeta ha sido configurada con Seguridad máxima");		
	}

}
