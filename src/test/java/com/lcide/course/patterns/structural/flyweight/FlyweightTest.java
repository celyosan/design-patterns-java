package com.lcide.course.patterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

class FlyweightTest {
	
	@Test
	void test_Flyweight () {
		Random r = new Random();
		
		List<EnemyFlyweight> enemies = new ArrayList<>();
		for(int i=0;i<15;i++) {
			int randInt = r.nextInt(EnemyType.values().length);
			EnemyFlyweight enemy = EnemyFactoryFlyweight.getEnemy(EnemyType.valueOfByValue(randInt));
			
			randInt = r.nextInt(WeaponType.values().length);
			
			enemy.setWeapon(WeaponType.valueOfByValue(randInt));
			enemy.attack();
			
			enemies.add(enemy);		
		}
		
		assertEquals(15, enemies.size());
		assertTrue(enemies.stream().allMatch(enemy -> enemy.attack() > 0 && enemy.lifePoints() > 0));
		
	}

}
