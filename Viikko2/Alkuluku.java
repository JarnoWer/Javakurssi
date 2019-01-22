package Viikko2;

import java.util.Scanner;

public class Alkuluku {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Syötä jokin positiivinen kokonaisluku: ");
		int number = reader.nextInt();
		reader.close();
		int divider = 2;
		do {
			int remainder = number % divider;
			if (remainder == 0) {
				System.out.println();
			}
		}
	}

}
