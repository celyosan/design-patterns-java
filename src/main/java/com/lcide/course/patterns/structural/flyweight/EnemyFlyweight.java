package com.lcide.course.patterns.structural.flyweight;

public interface EnemyFlyweight {

	void setWeapon(WeaponType weapon);
	int lifePoints();
	int attack();
}
