package com.lcide.course.patterns.behavioral.templatemethod;

public class Visa extends Payment{

	@Override
	boolean initialize() {
		System.out.println("Inicializando el pago con Visa...");
		return true;
	}

	@Override
	boolean startPayment() {
		System.out.println("Realizando el pago con Visa...");
		return true;
	}

	@Override
	boolean endPayment() {
		System.out.println("Finalizando el pago con Visa...");
		return true;
	}

}
