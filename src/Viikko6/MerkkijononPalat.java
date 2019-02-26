package Viikko6;

import java.util.Scanner;

public class MerkkijononPalat {
	public static void main(String[] args) {
		System.out.println("Kirjoita lause: ");
		Scanner reader = new Scanner(System.in);
		String signLine = reader.nextLine();
		String[] separate = signLine.split(" ");

		int indeksi = 0;
		while (indeksi < separate.length) {
			String pala = separate[indeksi];
			System.out.println(pala);
			indeksi++;
		}
		reader.close();
	}
}
