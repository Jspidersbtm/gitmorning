package com.mr.uielementexample;

public class UIElement {
	String type;
	String name;

	public UIElement(String type, String name) {
		this.type = type;
		this.name = name;
	}

	void action() {
		System.out.println("Select to activate");
	}
}
