package com.lcide.course.patterns.structural.adapter;

public class BlackCreditCard implements Secure {

	@Override
	public boolean payWithSecureLevelA() {
		System.out.println("Tarjeta Gold: Pagando con Seguridad Alta Nivel A");
		return true;
	}

	@Override
	public boolean payWithSecureLevelZ() {
		return false;		
	}

}
