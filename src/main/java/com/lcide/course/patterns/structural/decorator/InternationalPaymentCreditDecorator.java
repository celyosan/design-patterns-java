package com.lcide.course.patterns.structural.decorator;

public class InternationalPaymentCreditDecorator extends CreditDecorator{

	public InternationalPaymentCreditDecorator(CreditComponent decoratedCredit) {
		super(decoratedCredit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void config() {
		decoratedCredit.config();
		configInternationalPayment();
	}

	private void configInternationalPayment() {
		System.out.println("La tarjeta ha sido configurada para pagos internacionales.");		
	}
}
