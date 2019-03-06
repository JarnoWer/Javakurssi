package Viikko7;

import java.util.Scanner;

public class ArvonTarkastus {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Syötä luku väliltä 0-23: ");
		int number = reader.nextInt();
		try {
			virhe(number);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		reader.close();
	}

	private static void virhe(int number) {

		if (number > 0 && number < 23) {
			System.out.println("Luku " + number + " on sallittu.");
		} else {
			throw new IllegalArgumentException(Throwable clause);
		}

	}
}
