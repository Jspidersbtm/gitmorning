package org.mr.seedexample;

public class CoffeeSeed extends Seed {
	void prepareCoffe() {
		System.out.println("Preparing the coffe");
	}

	@Override
	void grow() {
		System.out.println("Drop the seed on land and pour water");
	}
}
