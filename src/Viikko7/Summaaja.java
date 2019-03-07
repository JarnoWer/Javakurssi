package Viikko7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Summaaja {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int sum = 0;
		boolean stop = false;
		while (stop == false) {
			try {
				System.out.print("Syötä seuraava luku (0 lopettaa): ");
				int number = reader.nextInt();
				if (number == 0) {
					System.out.println("\nLukujen summa on " + sum + ".");
					stop = true;
				} else {
					sum = sum + number;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Virheellinen syöte!\n");
				reader.nextLine();
			}
		}
		reader.close();
	}
}
