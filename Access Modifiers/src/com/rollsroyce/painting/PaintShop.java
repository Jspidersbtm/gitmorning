package com.rollsroyce.painting;

import com.rollsroyce.carmanufacture.Car;

public class PaintShop extends Car {
	void accessDetailsOfCar() {
		System.out.println(this.chasisNo);
		Car c = new Car();
		// protected member is not accessible to its own class object reference
		// outside the package
		// System.out.println(c.chasisNo);
	}
}
