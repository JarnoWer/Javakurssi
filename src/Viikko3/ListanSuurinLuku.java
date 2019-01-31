package Viikko3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListanSuurinLuku {
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
		lukija.close();

		System.out.println();
		int biggest = luvut.get(0);

		int number = 0;
		while (number < luvut.size()) {
			int nowInt = luvut.get(number);
			if (biggest < nowInt) {
				biggest = nowInt;
			}
			number ++;
			
		}
		System.out.println("Listan suurin luku: " + biggest);
	}
}
