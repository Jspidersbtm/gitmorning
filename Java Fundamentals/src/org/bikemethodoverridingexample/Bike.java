package org.bikemethodoverridingexample;

public class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Insert key and press button to start");
	}
}
