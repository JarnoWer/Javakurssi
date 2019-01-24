package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		int givenkm = 1;
		int sumkm = 0;
		while (givenkm != 0) {
			System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
			givenkm = reader.nextInt();
			sumkm = sumkm + givenkm;
		}
		reader.close();
		System.out.println("Yhteensä " + sumkm + "kilometriä");
		System.out.println("Korvaus on " + twoDecimal.format(sumkm * 0.43) + "euroa");

	}
}
