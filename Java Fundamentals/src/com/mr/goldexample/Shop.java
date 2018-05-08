package com.mr.goldexample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Shop {
	Jewel sell() {
		Jewel j = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the jewel type");
			String jewelName = br.readLine();
			// Scanner s = new Scanner(System.in);
			// String jewelName = s.next();
			if (jewelName.equalsIgnoreCase("ring")) {
				j = new Ring();
			} else if (jewelName.equalsIgnoreCase("Bracelet")) {
				j = new Bracelet();
			} else if (jewelName.equalsIgnoreCase("Chain")) {
				j = new Chain();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}
}
