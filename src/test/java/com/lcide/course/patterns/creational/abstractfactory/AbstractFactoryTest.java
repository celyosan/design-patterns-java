package com.lcide.course.patterns.creational.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

	@Test
	void test_AbstractFactory () {
		AbstractFactory<?> cardAbstractFactory = FactoryProvider.getFactory(FactoryType.CARD);		
		VisaProduct visaCard = (VisaProduct) cardAbstractFactory.create(CardType.VISA.name());
		
		assertEquals(CardType.VISA, visaCard.getCardType());
		assertNotNull(visaCard.getCardNumber());
		
		AbstractFactory<?> paymentMethodAbstractFactory = FactoryProvider.getFactory(FactoryType.PAYMENT_METHOD);		
		DebitProduct debit = (DebitProduct) paymentMethodAbstractFactory.create(PaymentMethodType.DEBIT.name());
		
		assertEquals(PaymentMethodType.DEBIT, debit.getPaymentMethod());
		assertNotNull(debit.doPayment());
	}
}
