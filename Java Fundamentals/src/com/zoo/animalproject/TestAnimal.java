package com.zoo.animalproject;

public class TestAnimal {
	public static void main(String[] args) {
		Zoo z = new Zoo();
		Animal a = z.sell();// Upcasting because the method will return
		// either cat, lion or cow object
		if (a != null) {
			a.eat();
		} else {
			System.out.println("No animal to eat");
		}

	}
}
