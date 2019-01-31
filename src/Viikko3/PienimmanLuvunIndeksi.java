package Viikko3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<Integer> luvut = new ArrayList<Integer>();

		System.out.println("Syötä kokonaislukuja listalle (9999 lopettaa):");

		while (true) {
			int syote = lukija.nextInt();

			if (syote == 9999) {
				break;
			} else {
				luvut.add(syote);
			}
		}
		lukija.close();

		System.out.println();
		int smallest = luvut.get(0);

		int number = 0;
		while (number < luvut.size()) {
			int nowInt = luvut.get(number);
			if (smallest > nowInt) {
				smallest = nowInt;
			}
			number++;
		}
		System.out.println("Pienin luku on " + smallest);
		int lkm = luvut.size();
		for (int i = 0; i < lkm; i++) {
			int numbers = luvut.get(i);
			if (numbers == smallest) {
				System.out.println("Pienin luku löytyy indeksistä " + i);
			}
		}
	}
}
