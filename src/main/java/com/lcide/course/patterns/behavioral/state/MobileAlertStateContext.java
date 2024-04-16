package com.lcide.course.patterns.behavioral.state;

public class MobileAlertStateContext {

	private MobileAlertState currentState;
	
	public MobileAlertStateContext() {
		this.currentState = new SoundState();
	}

	public void setState(MobileAlertState state) {
		this.currentState = state;
	}
	
	public boolean alert() {
		return currentState.alert(this);
	}
}
