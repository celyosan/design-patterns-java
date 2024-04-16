package com.lcide.course.patterns.behavioral.templatemethod;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TemplateMethodTest {
	
	@Test
	void test_TemplateMethod () {
		Payment payment = new Visa(); 
		assertTrue(payment.makePayment());
		
		payment = new Paypal();
		assertTrue(payment.makePayment());
	}

}
