package com.lcide.course.patterns.behavioral.state;

public class SilentState implements MobileAlertState {

	@Override
	public boolean alert(MobileAlertStateContext ctxt) {		
		System.out.println("Silencio. Pantalla iluminada.");
		return true;
	}

}
