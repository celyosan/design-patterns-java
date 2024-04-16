package com.lcide.course.patterns.behavioral.templatemethod;

public class Paypal extends Payment{

	@Override
	boolean initialize() {
		System.out.println("Inicializando el pago con Paypal...");		
		return true;
	}

	@Override
	boolean startPayment() {
		System.out.println("Realizando el pago con Paypal...");	
		return true;
	}

	@Override
	boolean endPayment() {
		System.out.println("Finalizando el pago con Paypal...");
		return true;
	}

}
