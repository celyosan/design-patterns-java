package com.lcide.course.patterns.behavioral.observer;


public interface Subject {
	
	boolean addAttach (Observer obs);
	boolean detach(Observer obs);
	boolean notifyUpdate(SemaforoObservable obs);
}
