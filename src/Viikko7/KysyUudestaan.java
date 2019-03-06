package Viikko7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KysyUudestaan {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		boolean stop = false;
		while (stop == false) {
			try {
				System.out.print("Sy�t� kokonaisluku: ");
				int luku = reader.nextInt();
				System.out.println("Sy�tit luvun " + luku + ".");
				stop = true;
			} catch (InputMismatchException e) {
				System.out.println("Virheellinen luku!\n");
				reader.nextLine();
			}
		}
		reader.close();
	}
}