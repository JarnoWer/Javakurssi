package Viikko2;

import java.util.Scanner;

public class RekisterinumeroTarkastin {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.println("Syötä rekisterinumero (q-kirjain lopettaa): ");
			String regLic = reader.nextLine();
			if (regLic.equals("q")) {
				break;
			} else if (regLic.matches("[qwertyuiopåäölkjhgfdsazxcvbnmQWERTYUIOPÅÄÖLKJHGFDSAZXCVBNM]{2,3}-[0-9]{1,3}")) {
				System.out.println(regLic + " on kelvollinen rekisterinumero.");
			} else {
				System.out.println(regLic + " ei ole kelvollinen rekisterinumero.");
			}
		}
		reader.close();
	}
}
