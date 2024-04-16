package com.lcide.course.patterns.behavioral.chainofresponsability;

/**
 * Eslabon de la cadena
 * @author lcide
 *
 */
public class Gold implements ApproveLoanChain {
	
	private ApproveLoanChain next;

	@Override
	public void setNext(ApproveLoanChain chain) {
		next = chain;

	}

	@Override
	public ApproveLoanChain getNext() {
		return next;
	}

	@Override
	public CardType creditCardRequest(int totalLoan) {		
		// definimos logica de cadena
		if (totalLoan <= 10000) {
			System.out.println("Esta solicitud de tarjeta de crédito la maneja la tarjeta Gold");
			return CardType.GOLD;
		} else {
			// pasa a que lo controle otra, ya que no lo controla esta clase
			return next.creditCardRequest(totalLoan);
		}
	}

}
