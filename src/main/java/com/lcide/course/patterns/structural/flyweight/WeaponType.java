package com.lcide.course.patterns.structural.flyweight;

public enum WeaponType {
	SWORD(0, 15), GUN(1, 20), BAZOOKA(2, 200), AXE(3, 12), ARROW(4, 5);

	private int value;
	private int damage;
	
	private WeaponType(int value, int damage) {
		this.value = value;
		this.damage = damage;
	}

	public int getValue() {
		return value;
	}	
		
	public int getDamage() {
		return damage;
	}

	public static WeaponType valueOfByValue(int value) {
		for(WeaponType weapon:values()) {
			if (weapon.value == value) {
				return weapon;
			}
		}
		throw new UnsupportedOperationException("No existe ese arma");
	}
}
