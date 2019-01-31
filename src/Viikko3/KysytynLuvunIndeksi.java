package Viikko3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KysytynLuvunIndeksi {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<Integer> luvut = new ArrayList<Integer>();

		System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");

		while (true) {
			int syote = lukija.nextInt();

			if (syote == -1) {
				break;
			} else {
				luvut.add(syote);
			}
		}

		System.out.println();

		System.out.print("Mitä lukua etsitään? ");
		int etsittava = lukija.nextInt();
		lukija.close();
		int lkm = luvut.size();
		for (int i = 0; i < lkm; i++) {
			int numbers = luvut.get(i);
			if (numbers == etsittava) {
				System.out.println("Luku " + etsittava + " on indeksissä " + i);
			}
		}
	}
}
