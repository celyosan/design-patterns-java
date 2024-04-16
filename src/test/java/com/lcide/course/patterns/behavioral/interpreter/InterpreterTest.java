package com.lcide.course.patterns.behavioral.interpreter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class InterpreterTest {
	
	@Test
	void test_Interpreter() {
		Expression zero = new TerminalExpression("0");
		Expression one = new TerminalExpression("1");
		
		Expression containsAtLeastOne = new OrExpression(zero, one);
		Expression containsAll = new AndExpression(zero, one);
		
		assertFalse(containsAtLeastOne.interpret("zero"));
		
		assertTrue(containsAtLeastOne.interpret("0"));
		
		assertFalse(containsAll.interpret("0"));
		
		assertTrue(containsAll.interpret("0, 1"));
	}

}
