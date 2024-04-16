package com.lcide.course.patterns.creational.factorymethod;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FactoryMethodTest {
	
	@Test
	void test_FactoryMethod () {
		PaymentProduct payment = PaymentFactoryCreator.buildPayment(PaymentType.GOOGLE_PAYMENT);
		
		assertTrue (payment instanceof GooglePaymentConcreteProduct);
		
		assertTrue (payment.doPayment());
	}
	@Test
	void test_FactoryMethod_unimplementedObject () {
		assertThrows(UnsupportedOperationException.class, () -> PaymentFactoryCreator.buildPayment(PaymentType.PAYPAL));
	}

}
