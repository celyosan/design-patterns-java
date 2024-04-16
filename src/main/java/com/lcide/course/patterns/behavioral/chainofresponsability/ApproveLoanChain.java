package com.lcide.course.patterns.behavioral.chainofresponsability;

public interface ApproveLoanChain {
	void setNext(ApproveLoanChain chain);
	ApproveLoanChain getNext ();
	CardType creditCardRequest (int totalLoan);
}
