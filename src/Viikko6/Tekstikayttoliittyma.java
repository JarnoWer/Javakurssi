package Viikko6;

import java.util.Scanner;

public class Tekstikayttoliittyma {
	public static void main(String[] args) {
		Sanakirja sanakirja = new Sanakirja();
		Scanner reader = new Scanner(System.in);

		System.out.print(
				"Komennot:\n  lisaa - lisää sanaparin sanakirjaan\n  kaanna - kysyy sanan ja tulostaa sen käännöksen\n  lopeta - poistuu käyttöliittymästä");
		System.out.println();

		boolean stop = false;
		while (true) {
			System.out.print("Komento:");
			String command = reader.nextLine();
			switch (command) {
			case "lisaa":
				System.out.print("Suomeksi: ");
				String word = reader.nextLine();
				System.out.print("Anna käännös: ");
				String translate = reader.nextLine();
				sanakirja.lisaa(word, translate);
				break;
			case "kaanna":
				System.out.print("Anna sana: ");
				String word1 = reader.nextLine();
				System.out.println("Käännös: " + sanakirja.kaanna(word1));
				break;
			case "lopeta":
				stop = true;
				System.out.println("Hei hei!");
				break;
			}
			if (stop == true) {
				break;
			}
		}
		reader.close();
	}
}
