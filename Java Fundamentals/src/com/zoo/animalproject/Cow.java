package com.zoo.animalproject;

public class Cow extends Animal {
	Cow(String color, String type) {
		super(color, type);
	}

	void giveMilk() {
		System.out.println("Cow gives milk");
	}
}
