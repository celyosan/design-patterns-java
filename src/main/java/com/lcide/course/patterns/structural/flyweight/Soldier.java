package com.lcide.course.patterns.structural.flyweight;

public class Soldier implements EnemyFlyweight {
	
	private WeaponType weapon;
	private static final int LIFE = 1000;
	
	public Soldier() {
		super();
	}

	@Override
	public void setWeapon(WeaponType weapon) {
		this.weapon = weapon;
	}

	@Override
	public int lifePoints() {
		System.out.println("La vida de un soldado son: " + LIFE);
		return LIFE;
	}

	@Override
	public int attack() {
		System.out.println("El soldado ataca con " + this.weapon);	
		return weapon.getDamage();
	}
	
	

}
