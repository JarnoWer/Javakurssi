package Viikko2;

import java.util.Scanner;

public class Laskin {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Scanner stringScan = new Scanner(System.in);
		System.out.println("Anna ensimmäinen luku: ");
		int first = reader.nextInt();
		System.out.println("Anna toinen luku: ");
		int second = reader.nextInt();
		System.out.println("Anna operaatio: ");
        String given = stringScan.nextLine();
		if (given.equals("/")) {
			System.out.println(first + " " + given + " " + second + " = " + ((1.0 * first) / second));
		} else if (given.contentEquals("*")) {
			System.out.println(first + " " + given + " " + second + " = " + (first * second));
		} else if (given.equals("-")) {
			System.out.println(first + " " + given + " " + second + " = " + (first - second));
		} else if (given.equals("+")) {
			System.out.println(first + " " + given + " " + second + " = " + (first + second));
		} else {
			System.out.println("Operaatio voi olla vain (/, *, - tai +");
		}
		reader.close();
		stringScan.close();
	}
}
