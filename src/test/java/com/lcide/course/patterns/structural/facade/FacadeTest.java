package com.lcide.course.patterns.structural.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.lcide.course.patterns.structural.facade.CreditMarketFacade;

class FacadeTest {
	
	@Test
	void test_Facade () {
		CreditMarketFacade creditMarket = new CreditMarketFacade();
		
		creditMarket.showSilverCredit();
		creditMarket.showGoldCredit();
		creditMarket.showBlackCredit();
		
		assertEquals(5000, creditMarket.getGoldCredit());
		assertEquals(1000000, creditMarket.getBlackCredit());
		assertEquals(200000, creditMarket.getSilverCredit());
	}

}
