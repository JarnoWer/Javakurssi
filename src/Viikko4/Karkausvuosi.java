package Viikko4;

import java.util.Scanner;

public class Karkausvuosi {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Kirjoita vuosiluku: ");
		int vuosi = lukija.nextInt();
		lukija.close();
		if (onkoKarkausvuosi(vuosi)) {
			System.out.println("Vuosi " + vuosi + " on karkausvuosi.");
		} else {
			System.out.println("Vuosi " + vuosi + " ei ole karkausvuosi.");
		}

	}

	// kirjoita metodi onkoKarkausvuosi tähän
	public static boolean onkoKarkausvuosi(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

}