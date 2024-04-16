package com.lcide.course.patterns.creational.prototype;

public class Visa implements CardPrototype {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// creates a warning though CloneableClass is actually implementing Cloneable
	@Override
	public void getCard() {
		System.out.println("Esto es una tarjeta visa");
	}

	@Override
	public CardPrototype copy() {
		System.out.println("Clonando una tarjeta visa...");
		
		Visa copy = new Visa();
		copy.setName(this.name);
		
		return copy;
	}
	

}
