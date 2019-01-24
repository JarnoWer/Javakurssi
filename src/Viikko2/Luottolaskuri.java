package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Luottolaskuri {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		System.out.println("Anna luotollisen ostoksen hinta: ");
		double price = reader.nextDouble();
		System.out.println("Anna kuukausierien lukumäärä: ");
		int months = reader.nextInt();
		int i = 1;
		double payMount = price / months;
		while (price > 0) {
			price = price - payMount;
			System.out.println( i + ". erä " + twoDecimal.format(payMount) + "euroa, luottoa jäljellä " + twoDecimal.format(price) + "euroa");
			i ++;
		}
		reader.close();
	}
}
