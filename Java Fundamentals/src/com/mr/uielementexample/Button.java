package com.mr.uielementexample;

public class Button extends UIElement {
	public Button() {
		super("Button", "Submit");
	}

	@Override
	void action() {
		System.out.println("Click to activate");
	}

	void show() {
		System.out.println("Display button");
	}
}
