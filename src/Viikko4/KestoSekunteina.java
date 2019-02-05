package Viikko4;

import java.util.Scanner;

public class KestoSekunteina {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Anna tunnit: ");
		int hours = reader.nextInt();
		System.out.println("Anna minuutit: ");
		int minutes = reader.nextInt();
		System.out.println("Anna sekunnit: ");
		int seconds = reader.nextInt();
		reader.close();
		System.out.println("Yhteensä " + kestoSekunteina(hours, minutes, seconds) + " sekuntia.");
	}

	private static Integer kestoSekunteina(int hours, int minutes, int seconds) {
		int sum = (((hours * 60) * 60) + (minutes * 60)) + seconds;
		return sum;
	}
}
