package com.mr.uielementexample;

public class TextBox extends UIElement {
	public TextBox() {
		super("TextBox", "Name");
	}

	@Override
	void action() {
		System.out.println("Enter the text to activate");
	}
}