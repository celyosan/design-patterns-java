package com.lcide.course.patterns.behavioral.state;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StateTest {
	
	@Test
	void test_State() {
		MobileAlertStateContext ctxt = new MobileAlertStateContext();
		assertTrue(ctxt.alert());
		
		ctxt.setState(new VibrationState());
		assertTrue(ctxt.alert());
		
		ctxt.setState(new SilentState());
		assertTrue(ctxt.alert());
	}

}
