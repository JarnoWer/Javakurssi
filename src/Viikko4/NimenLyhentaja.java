package Viikko4;

import java.util.Scanner;

public class NimenLyhentaja {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Syötä etu- ja sukunimi: ");
		String firstName = reader.next();
		String lastName = reader.nextLine().trim();
		reader.close();
		String shorter = Lyhentaja.lyhennaNimi(firstName, lastName);
		System.out.println("Lyhennettynä: " + shorter);
	}
}
