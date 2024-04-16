package com.lcide.course.patterns.structural.adapter;

public class CreditCard implements Payment {
	
	private Adapter adapter;

	@Override
	public boolean pay(LevelType type) {
		if (LevelType.CLASSIC.equals(type)) {
			System.out.println("Tarjeta Classic: Pagando sin ningun tipo de Seguridad");
			return true;
		} else if (LevelType.GOLD.equals(type)) {
			adapter = new Adapter(LevelType.GOLD);
			return adapter.pay(LevelType.GOLD);
		} else if (LevelType.BLACK.equals(type)) {
			adapter = new Adapter(LevelType.BLACK);
			return adapter.pay(LevelType.BLACK);
		} else {
			System.out.println("No se puede hacer el pago - No se reconoce esa tarjeta.");
			return false;
		}

	}

}
