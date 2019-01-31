package Viikko3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToisenJaKolmannenSumma {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<Integer> luvut = new ArrayList<Integer>();

		System.out.println("Syötä kokonaislukuja listalle (0 lopettaa):");

		while (true) {
			
			int syote = Integer.parseInt(lukija.nextLine());

			if (syote == 0) {
				break;
			} else {
				luvut.add(syote);
			}
		}

		lukija.close();

		System.out.println(); 

		int eka = luvut.get(1);
		int second = luvut.get(2);
		System.out.println(eka + second);
	}

}
