package com.mr.inheritance.vehicleexample;

public class TestVehicle {
	public static void main(String[] args) {
		Car c = new Car();
		c.brand = "Audi";
		c.color = "White";
		c.isAcPresent = true;
		c.noOfSeatBelts = 4;
		c.price = 8500000;
		c.move();
		c.start();
		c.stop();
		c.temperatureControl();
	}
}
