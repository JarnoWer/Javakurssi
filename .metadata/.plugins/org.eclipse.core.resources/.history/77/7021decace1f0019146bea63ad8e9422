package Viikko1;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Alennus {

	private static Scanner reader;

	public static void main(String[] args) {
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		reader = new Scanner(System.in);
		System.out.println("Anna alentamaton hinta: ");
		double orgPrice = reader.nextDouble();
		System.out.println("Anna alennusprosentti: ");
		int discount = reader.nextInt();
		double discPrice = orgPrice * (100.0 - discount) / 100.0;
		String newPrice = twoDecimal.format(discPrice);
		System.out.println("Alennettu hinta on " + newPrice);
	}
}
