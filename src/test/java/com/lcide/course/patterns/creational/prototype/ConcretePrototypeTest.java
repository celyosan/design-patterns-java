package com.lcide.course.patterns.creational.prototype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcretePrototypeTest {

	@Test
	void test_Prototype() {
		PrototypeFactory.loadCards();
		
		CardPrototype visa = PrototypeFactory.getInstance(CardType.VISA);
		visa.getCard();
		assertTrue(visa instanceof Visa);
		
		CardPrototype amex = PrototypeFactory.getInstance(CardType.AMEX);
		amex.getCard();
		assertTrue(amex instanceof Amex);
		
	}

}
