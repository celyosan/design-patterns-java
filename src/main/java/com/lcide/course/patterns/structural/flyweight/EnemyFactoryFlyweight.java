package com.lcide.course.patterns.structural.flyweight;

import java.util.Map;
import java.util.HashMap;

public class EnemyFactoryFlyweight {
	
	private static Map<EnemyType, EnemyFlyweight> enemies = new HashMap<>();
	
	private EnemyFactoryFlyweight() {}

	public static EnemyFlyweight getEnemy (EnemyType type) {
		EnemyFlyweight enemy;
		
		if (enemies.containsKey(type)) {
			enemy = enemies.get(type);
		} else {
			switch (type) {
				case SOLDIER : 
					System.out.println("Soldado creado.");
					enemy = new Soldier();
					break;
				case COMMANDER :
					System.out.println("Comandante creado");
					enemy = new Commander();
					break;
				default:
					throw new UnsupportedOperationException("No existe ese enemigo");
			}
			enemies.put(type, enemy);
		}
		return enemy;
		
	}
	

}
