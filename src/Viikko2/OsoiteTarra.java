package Viikko2;

import java.util.Scanner;

public class OsoiteTarra {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Anna etu- ja sukunimi: ");
		String firstName = reader.next();
		String surname = reader.nextLine().trim();
		String firstLetter = firstName.substring(0, 1).toUpperCase();
		String restWord = firstName.substring(1).toLowerCase();
		firstName = firstLetter + restWord;
		firstLetter = surname.substring(0, 1).toUpperCase();
		restWord = surname.substring(1).toLowerCase();
		surname = firstLetter + restWord;
		System.out.println("Anna katuosoite: ");
		String address = reader.nextLine();
		firstLetter = address.substring(0, 1).toUpperCase();
		restWord = address.substring(1).toLowerCase();
		address = firstLetter + restWord;
		System.out.println("Anna postinumero ja postitoimipaikka: ");
		String postCode = reader.next();
		String postOffice = reader.nextLine().trim();
		postOffice = postOffice.toUpperCase();
		System.out.println(firstName + " " + surname + "\n" + address + "\n" + postCode + " " + postOffice);
		reader.close();
	}
}
