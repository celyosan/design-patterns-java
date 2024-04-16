package com.lcide.course.patterns.structural.adapter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AdapterTest {
	
	@Test
	void test_Adapter() {
		Payment creditCard = new CreditCard();
		
		assertTrue(creditCard.pay(LevelType.CLASSIC));
		assertTrue(creditCard.pay(LevelType.GOLD));
		assertTrue(creditCard.pay(LevelType.BLACK));
		assertFalse(creditCard.pay(LevelType.SILVER));
	}

}
