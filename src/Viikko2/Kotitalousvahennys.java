package Viikko2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		double compensation = 1;
		double sumComp = 0;
		while (compensation != 0) {
			System.out.println("Anna tyˆkorvauksen m‰‰r‰ (0 lopettaa): ");
			compensation = reader.nextDouble();
			sumComp = sumComp + compensation;
		}
		reader.close();
		double amount = (sumComp * (45 / 100.0) - 100);
		if (amount > 2400) {
			System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on 2400,00 euroa");
		} else if (amount < 0){
		 System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on 0,00 euroa");
		}else {
			System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on " + twoDecimal.format(amount) + " euroa");
		}

	}
}
