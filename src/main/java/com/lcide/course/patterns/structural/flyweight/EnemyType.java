package com.lcide.course.patterns.structural.flyweight;

public enum EnemyType {
	SOLDIER(0), COMMANDER(1);
	
	private int value;
	
	private EnemyType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}	
	
	public static EnemyType valueOfByValue(int value) {
		for(EnemyType enemy:values()) {
			if (enemy.value == value) {
				return enemy;
			}
		}
		throw new UnsupportedOperationException("No existe ese enemigo");
	}
}
