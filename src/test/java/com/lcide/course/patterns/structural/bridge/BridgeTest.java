package com.lcide.course.patterns.structural.bridge;

import com.lcide.course.patterns.structural.bridge.CreditCard;

import org.junit.jupiter.api.Test;

import com.lcide.course.patterns.structural.bridge.ClassicCreditCard;
import com.lcide.course.patterns.structural.bridge.UnsecureCreditCard;
import com.lcide.course.patterns.structural.bridge.SecureCreditCard;

class BridgeTest {

	@Test
	void test_Bridge () {
		CreditCard classic = new ClassicCreditCard(new UnsecureCreditCard());
		classic.makePayment();
		
		classic = new ClassicCreditCard(new SecureCreditCard());
		classic.makePayment();
	}
}
