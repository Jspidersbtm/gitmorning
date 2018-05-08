package com.mr.goldexample;

public class Person {
	void purchase() {
		Shop s = new Shop();
		Jewel j = s.sell();
		if (j != null) {
			j.polish();
			if (j instanceof Ring) {
				Ring r = (Ring) j;
				r.wearToFinger();
			} else if (j instanceof Bracelet) {
				Bracelet b = (Bracelet) j;
				b.wearToHand();
			} else if (j instanceof Chain) {
				Chain c = (Chain) j;
				c.wearToNeck();
			}
		} else {
			System.out.println("No jewels at this time");
		}
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.purchase();
	}
}
