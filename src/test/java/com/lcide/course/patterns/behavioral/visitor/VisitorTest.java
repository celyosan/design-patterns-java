package com.lcide.course.patterns.behavioral.visitor;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class VisitorTest {
	
	@Test
	void test_Visitor () {
		ElementOffer elementOffer = new GasoilOffer();	
		assertTrue(elementOffer.accept(new BlackCreditCardVisitor()));
		
		elementOffer = new FlyOffer();
		assertTrue(elementOffer.accept(new ClassicCreditCardVisitor()));
	}

}
