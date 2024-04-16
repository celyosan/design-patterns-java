package com.lcide.course.patterns.behavioral.command;

/**
 * Contiene las acciones a realizar
 * @author lcide
 *
 */
public class CreditCardReciver {

	public void sendPinNumberToCustomer() {
		System.out.println("El pin number ha sido enviado al cliente.");		
	}
	
	public void sendSmsToCustomerWhenActivateCard() {
		System.out.println("Enviado SMS al cliente informando que su tarjeta ha sido activada.");		
	}
	
	public void activateCard() {
		System.out.println("La tarjeta ha sido activada.");		
	}
	
	public void desactivateCart() {
		System.out.println("La tarjeta ha sido desactivada.");		
	}
	
	public void sendSmsToCustomerWhenDesactivateCard() {
		System.out.println("Enviado SMS al cliente informando que su tarjeta ha sido desactivada.");		
	}
}
