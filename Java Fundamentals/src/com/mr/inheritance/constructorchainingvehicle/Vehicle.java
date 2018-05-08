package com.mr.inheritance.constructorchainingvehicle;

public class Vehicle {
	String color;
	int price;

	void start() {
		System.out.println("Start");
	}

	public Vehicle(String color, int price) {
		this.color = color;
		this.price = price;
	}

}
