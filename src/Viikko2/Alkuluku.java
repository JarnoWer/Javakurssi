package Viikko2;

import java.util.Scanner;

public class Alkuluku {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Syötä jokin positiivinen kokonaisluku: ");
		int number = reader.nextInt();
		reader.close();
		if (number <= 1) {
			System.out.println("Luku " + number + "on liian pieni tai negatiivinen");
		} else if (number == 2) {
			System.out.println("Luku" + number + " on alkuluku.");
		} else {
			int divider = 2;
			while (((number % divider) != 0) && (divider <= number / 2)) {
				divider++;
			}
			if (number % divider == 0) {
				System.out.println("Luku " + number + " ei ole alkuluku.");
			} else {
				System.out.println("Luku " + number + " on alkuluku.");
			}
		}
	}
}