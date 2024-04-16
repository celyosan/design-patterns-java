package com.lcide.course.patterns.behavioral.command;

/**
 * En este command, definimos una lógica para desactivar la tarjeta
 * @author lcide
 *
 */
public class CreditCardDesactivateCommand implements Command {
	
	private CreditCardReciver reciver;
	
	public CreditCardDesactivateCommand(CreditCardReciver reciver) {
		super();
		this.reciver = reciver;
	}

	@Override
	public ActionType execute() {
		// Definimos la lógica
		reciver.sendPinNumberToCustomer();
		reciver.activateCard();
		reciver.sendSmsToCustomerWhenActivateCard();
		return ActionType.DESACTIVATE;
	}

}
