package com.lcide.course.patterns.behavioral.state;

public class VibrationState implements MobileAlertState {

	@Override
	public boolean alert(MobileAlertStateContext ctxt) {		
		System.out.println("Vibrando");
		return true;
	}

}
