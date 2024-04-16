package com.lcide.course.patterns.structural.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DecoratorTest {
	
	@Test
	void test_Decorator () {
		CreditComponent gold = new GoldCreditComponent();
		
		CreditComponent blackInternationalPayment = new BlackCreditComponent();
		blackInternationalPayment = new InternationalPaymentCreditDecorator(blackInternationalPayment);
		
		CreditComponent goldSecureInternational = new GoldCreditComponent();
		goldSecureInternational = new InternationalPaymentCreditDecorator(goldSecureInternational);
		goldSecureInternational = new SecureCreditDecorator(goldSecureInternational);
		
		System.out.println("Tarjeta gold");
		gold.config();
		assertEquals(500000,gold.getCredit());
		
		System.out.println("Tarjeta black international payment");
		blackInternationalPayment.config();
		assertEquals(1000000,blackInternationalPayment.getCredit());

		
		System.out.println("Tarjeta gold secure international payment");
		goldSecureInternational.config();
		assertEquals(500000,gold.getCredit());

	}
}
