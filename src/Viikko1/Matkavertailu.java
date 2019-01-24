package Viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matkavertailu {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		System.out.println("Montako matkaa teet kuukaudessa: ");
		int tickets = reader.nextInt();
		System.out.println("Anna yksittäisen lipun hinta: ");
		double onePrice = reader.nextDouble();
		System.out.println("Anna kuukausilipun hinta: ");
		double monthPrice = reader.nextDouble();
		reader.close();
		double sumOne = (tickets * onePrice);
		String diff = twoDecimal.format(sumOne - monthPrice);
		String diffTwo = twoDecimal.format(monthPrice - sumOne);
		if (sumOne < monthPrice) {
			System.out.println("Yksittäinen on " + diffTwo + " euroa halvempi kuin kuukausilippu");

		} else
			System.out.println("Kuukausilippu on " + diff + " euroa halvempi kuin yksittäinen");
	}
}
