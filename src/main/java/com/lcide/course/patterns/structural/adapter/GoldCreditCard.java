package com.lcide.course.patterns.structural.adapter;

public class GoldCreditCard implements Secure {

	@Override
	public boolean payWithSecureLevelA() {
		return false;
	}

	@Override
	public boolean payWithSecureLevelZ() {
		System.out.println("Tarjeta Gold: Pagando con Seguridad Baja Nivel Z");
		return true;
	}

}
