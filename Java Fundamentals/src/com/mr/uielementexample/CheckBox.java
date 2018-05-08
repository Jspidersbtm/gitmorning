package com.mr.uielementexample;

public class CheckBox extends UIElement {
	public CheckBox() {
		super("checkbox", "Checkname");
	}

	@Override
	void action() {
		System.out.println("check to activate");
	}
}
