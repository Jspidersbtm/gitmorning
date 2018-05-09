package com.imc.mobilemanufacture;

public abstract class AbstractIMC {
	abstract void call();

	abstract void sms();

	void sos() {
		System.out.println("Emergency");
	}
}
