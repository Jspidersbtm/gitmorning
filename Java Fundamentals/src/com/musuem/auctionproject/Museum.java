package com.musuem.auctionproject;

import java.util.Scanner;

public class Museum {
	Object auction() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of an item");
		String nameOfItem = s.next();
		if (nameOfItem.equalsIgnoreCase("coin"))
			return new Coin();
		else if (nameOfItem.equalsIgnoreCase("sword"))
			return new Sword();
		else if (nameOfItem.equalsIgnoreCase("Car"))
			return new Car();
		else
			return null;

	}
}
