package com.mr.generalization.vehicle;

import java.util.Random;

public class Toll {
	Vehicle collectMoney() {
		int opt = new Random().nextInt(3) + 1;
		switch (opt) {
		case 1:
			return new Truck();
		case 2:
			return new Car();
		default:
			return new Bike();
		}
	}
}
