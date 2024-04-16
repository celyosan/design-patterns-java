package com.lcide.course.patterns.creational.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BuilderTest {

	@Test
	void test_Builder () {
		CardProduct card = new CardProduct.CardBuilder ("VISA", "0000 00 00 00000000")
				.name("Alberto")
				.expires(2030)
				.credit(true)
				.build();
		
		assertEquals("VISA", card.getCardType());
		assertEquals("0000 00 00 00000000", card.getNumber());
		assertEquals("Alberto", card.getName());
		assertEquals(2030, card.getExpires());
		assertTrue(card.isCredit());		
		
		CardProduct card2 = new CardProduct.CardBuilder ("MASTER_CARD", "1111 00 00 00000000")
				.name("Luis")
				.expires(2026)
				.credit(false)
				.build();
		
		assertEquals("MASTER_CARD", card2.getCardType());
		assertEquals("1111 00 00 00000000", card2.getNumber());
		assertEquals("Luis", card2.getName());
		assertEquals(2026, card2.getExpires());
		assertFalse(card2.isCredit());
	}
}
