package com.lcide.course.patterns.behavioral.state;

public class SoundState implements MobileAlertState {

	@Override
	public boolean alert(MobileAlertStateContext ctxt) {
		System.out.println("Rign ring ring");
		return true;
	}

}
