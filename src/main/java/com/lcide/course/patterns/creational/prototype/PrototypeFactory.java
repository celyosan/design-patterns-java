package com.lcide.course.patterns.creational.prototype;

import java.util.Map;
import java.util.HashMap;

public class PrototypeFactory {
	
	private PrototypeFactory() {}
	
	private static Map<CardType, CardPrototype> prototypes = new HashMap<>();
	
	public static CardPrototype getInstance(CardType type) {
		return prototypes.get(type).copy();
	}
	
	public static void loadCards() {
		Visa visa = new Visa();
		visa.setName("Esta tarjeta es Visa con numero 0000");
		prototypes.put(CardType.VISA, visa);
		
		Amex amex = new Amex();
		amex.setName("Esta tarjeta es Amex con numero 1111");
		prototypes.put(CardType.AMEX, amex);
		
	}
}
