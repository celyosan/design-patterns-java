package com.lcide.course.patterns.behavioral.iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class IteratorTest {
	@Test
	void test_Iterator () {
		Card[] cards = new Card[5];
		cards[0] = new Card("VISA");
		cards[1] = new Card("AMEX");
		cards[2] = new Card("MASTER CARD");
		cards[3] = new Card("GOOGLE CARD");
		cards[4] = new Card("APPLE CARD");
		
		ListAggregate<Card> cardList = new CardListAggregate(cards);
		Iterator<Card> cardIterator = cardList.iterator();
		while (cardIterator.hashNext()) {
			Card expectedCard = cards[cardIterator.currentPosition()];

			Card itemCard = cardIterator.next();
			assertNotNull(itemCard);
			assertEquals(expectedCard.getType(), itemCard.getType());
			System.out.println("La tarjeta es : " + itemCard.getType());
		}
	}
}
