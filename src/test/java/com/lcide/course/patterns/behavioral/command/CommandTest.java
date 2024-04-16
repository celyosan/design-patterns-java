package com.lcide.course.patterns.behavioral.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.lcide.course.patterns.behavioral.command.ActionType;
import com.lcide.course.patterns.behavioral.command.CreditCardActivateCommand;
import com.lcide.course.patterns.behavioral.command.CreditCardDesactivateCommand;
import com.lcide.course.patterns.behavioral.command.CreditCardInvoker;
import com.lcide.course.patterns.behavioral.command.CreditCardReciver;

class CommandTest {
	
	@Test
	void test_Command () {
		CreditCardInvoker invoker = new CreditCardInvoker();
		CreditCardReciver receiver = new CreditCardReciver();
		invoker.setCommand(new CreditCardActivateCommand(receiver));
		assertEquals(ActionType.ACTIVATE, invoker.executeCommand());
		invoker.setCommand(new CreditCardDesactivateCommand(receiver));
		assertEquals(ActionType.DESACTIVATE, invoker.executeCommand());
	}
}
