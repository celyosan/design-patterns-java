package com.lcide.course.patterns.behavioral.state;

/**
 * Define el estado con un comportamiento dado
 * @author lcide
 *
 */
public interface MobileAlertState {
	boolean alert(MobileAlertStateContext ctxt);

}
