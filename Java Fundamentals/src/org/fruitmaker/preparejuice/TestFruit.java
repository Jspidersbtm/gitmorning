package org.fruitmaker.preparejuice;

public class TestFruit {
	public static void main(String[] args) {
		Lemon l = new Lemon();
		l.clean();
		l.prepareJuice();

		Apple a = new Apple();
		a.clean();
		a.prepareJuice();//

		MuskMelon m = new MuskMelon();
		a.clean();
		m.prepareJuice();
	}
}
