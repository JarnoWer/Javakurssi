package Viikko3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoytyykoListalta {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();

		System.out.println("Sy�t� sanoja listalle. Tyhj� tai yhdysviiva (-) lopettaa:");

		while (true) {
			String syote = lukija.nextLine();

			if ("".equals(syote) || "-".equals(syote)) {
				break;
			} else {
				lista.add(syote);
			}
		}

		System.out.println();

		System.out.print("Ket� etsit��n? ");
		String etsittava = lukija.nextLine();

		lukija.close();

		int lkm = lista.size();
		boolean found = false;
		for (int i = 0; i < lkm; i++) {
			String choosen = lista.get(i);
			if (choosen.equals(etsittava)) {
				System.out.println(etsittava + " l�ytyi!");
				found = true;
			}

		}
		if (found == false) {
			System.out.println(etsittava + " ei l�ytynyt!");
		}
	}
}