package com.mr.inheritance.constructorchainingvehicle;

public class Car extends Vehicle {

	boolean isAcPresent;

	public Car(String color, int price, boolean isAcPresent) {
		super(color, price);
		this.isAcPresent = isAcPresent;
	}

	Car() {
		this("Black", 5000000, true);
		System.out.println("car zero param constructor");
	}

	public static void main(String[] args) {
		Car c = new Car();
	}

}
