package com.lcide.course.patterns.behavioral.command;

/**
 * En este command, definimos una lógica para desactivar la tarjeta
 * @author lcide
 *
 */
public class CreditCardActivateCommand implements Command {
	
	private CreditCardReciver reciver;
	
	public CreditCardActivateCommand(CreditCardReciver reciver) {
		super();
		this.reciver = reciver;
	}

	@Override
	public ActionType execute() {
		reciver.desactivateCart();
		reciver.sendSmsToCustomerWhenDesactivateCard();
		return ActionType.ACTIVATE;
	}

}
