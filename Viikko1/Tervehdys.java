package Viikko1;

import java.util.Scanner;

public class Tervehdys {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Mitä kello on? Anna tunnit: ");
		int clock = reader.nextInt();
		reader.close();

		if (clock >= 22 || clock < 7)
			System.out.println("Hyvää yötä!");
		else if (clock < 10)
			System.out.println("Hyvää huomenta!");
		else if (clock < 17)
			System.out.println("Hyvää päivää!");
		else if (clock < 22)
			System.out.println("Hyvää iltaa!");
	}
}
