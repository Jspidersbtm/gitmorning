package com.mr.aircooler;

public class TestCooler {
	public static void main(String[] args) {
		System.out.println("Cooler is present");
		Cooler c = new Cooler();
		System.out.println("Filling the cooler with water");
		Air a = c.cool(new ColdWater());
		System.out.println("Received air");
	}
}
