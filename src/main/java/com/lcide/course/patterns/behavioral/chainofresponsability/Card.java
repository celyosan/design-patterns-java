package com.lcide.course.patterns.behavioral.chainofresponsability;

/**
 * Objeto que define la cadena de responsabilidad
 * @author lcide
 *
 */
public class Card implements ApproveLoanChain {
	
	private ApproveLoanChain next;

	@Override
	public void setNext(ApproveLoanChain chain) {
		next = chain;
	}

	@Override
	public ApproveLoanChain getNext() {
		return next;
	}

	// Definimos cadena de responsabilidad
	@Override
	public CardType creditCardRequest(int totalLoan) {
		// Asignamos en next, el siguiente responsable.
		Gold gold = new Gold();
		this.setNext(gold);
		
		Platinium platinium = new Platinium();
		gold.setNext(platinium);
		
		Black black = new Black();
		platinium.setNext(black);
		
		return next.creditCardRequest(totalLoan);
		
		
	}

}
