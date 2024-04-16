package com.lcide.course.patterns.behavioral.chainofresponsability;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChainOfResponsabilityTest {

	@Test
	void test_ChainOfResponsability () {
		ApproveLoanChain card = new Card();
		
		CardType resultCard = card.creditCardRequest(1000);
		
		assertEquals(CardType.GOLD, resultCard);
		
		resultCard = card.creditCardRequest(15000);
		
		assertEquals(CardType.PLATINIUM, resultCard);
		
		resultCard = card.creditCardRequest(150000);
		
		assertEquals(CardType.BLACK, resultCard);
	}
}
