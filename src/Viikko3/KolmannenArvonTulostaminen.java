package Viikko3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KolmannenArvonTulostaminen {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();

		System.out.println("Syötä sanoja listalle. Tyhjä tai yhdysviiva (-) lopettaa:");

		while (true) {
			String syote = lukija.nextLine();

			if ("".equals(syote) || "-".equals(syote)) {
				break;
			} else {
				lista.add(syote);
			}
		}
		lukija.close();

		System.out.println();
		String eka = lista.get(2);
		System.out.println(eka);
	}
}
