package com.imc.mobilemanufacture;

public class SamsungMobile extends AbstractIMC {

	@Override
	void call() {
		System.out.println("Call ");
	}

	@Override
	void sms() {
		System.out.println("SMS");
	}

	void bluetooth() {
		System.out.println("Bluetooth");
	}

	public static void main(String[] args) {
		AbstractIMC am = new SamsungMobile();
		am.call();
		am.sms();
		am.sos();
		// am.bluetooth();
		if (am instanceof SamsungMobile) {
			SamsungMobile sm = (SamsungMobile) am;
			sm.bluetooth();
		}
	}

}
