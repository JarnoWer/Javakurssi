package Viikko4;

import java.util.Scanner;

public class SuoKuokkaJaJava {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Kuinka monta kertaa tulostetaan? ");
		int howMany = lukija.nextInt();
		lukija.close();
		int loops = 0;
		for (loops = 0; loops < howMany; loops++) {
			tulostaTeksti();
		}
	}

	public static void tulostaTeksti() {
		System.out.println("Alussa olivat suo, kuokka ja Java.");
	}
}
