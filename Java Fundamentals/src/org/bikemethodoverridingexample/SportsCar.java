package org.bikemethodoverridingexample;

public class SportsCar extends Car {
	@Override
	void start() {
		System.out.println("Push the button to start");
	}
}
