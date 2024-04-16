package com.lcide.course.patterns.behavioral.strategy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StrategyTest {
	
	@Test
	void test_Strategy () {
		String text = "Este texto será Convertido a Mayúsculas a través del Algoritmo";		
		Context ctxt = new Context(new CapitalStrategyTextFormatter());
		String result = ctxt.publishText(text);
		
		assertTrue(result.contains(text.toUpperCase()));
		assertFalse(result.contains(text.toLowerCase()));
		
		text = "Este texto será Convertido a Minúsculas a través del Algoritmo";		
		ctxt = new Context(new LowerStrategyTextFormatter());
		result = ctxt.publishText(text);		
		
		assertTrue(result.contains(text.toLowerCase()));
		assertFalse(result.contains(text.toUpperCase()));

	}

}
