package org.mr.seedexample;

public class TestSeed {
	public static void main(String[] args) {
		// null, new CoffeeSeed(), new MangoSeed(), new Seed()
		Seed s = new MangoSeed();
		s.grow();
		if (s instanceof CoffeeSeed) {
			CoffeeSeed cs = (CoffeeSeed) s;
			cs.prepareCoffe();
		} else if (s instanceof MangoSeed) {
			MangoSeed m = (MangoSeed) s;
			m.prepareJuice();
		}
	}
}
