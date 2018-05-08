package com.zoo.animalproject;

import java.util.Scanner;

public class Zoo {
	Animal sell() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an animal name");
		String name = s.next();
		if (name.equalsIgnoreCase("Cow")) {
			return new Cow("White", "Herbivorous");
		} else if (name.equalsIgnoreCase("Cat")) {
			return new Cat("Black", "Domestic");
		} else if (name.equalsIgnoreCase("Lion")) {
			return new Lion("Brown", "Carnivorous");
		} else
			return null;
	}
}
