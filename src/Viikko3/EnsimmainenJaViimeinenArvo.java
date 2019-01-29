package Viikko3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnsimmainenJaViimeinenArvo {
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
		lukija.close();

		System.out.println();
		int listSize = lista.size();
		String first = lista.get(0);
		String last = lista.get(listSize - 1);
		System.out.println(first);
		System.out.println(last);
	}
}