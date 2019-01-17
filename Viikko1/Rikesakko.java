package Viikko1;

import java.util.Scanner;

public class Rikesakko {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Anna nopeusrajoitus: ");
		int limit = reader.nextInt();
		System.out.println("Anna nopeutesi: ");
		int speed = reader.nextInt();
		reader.close();
		if (speed < limit) {
			System.out.println("Ajoit rajoituksen mukaan.");
		} else if (speed > limit + 20) {
			System.out.println("Menee p�iv�sakoille");
		} else if (limit < 10 || limit > 120) {
			System.out.println("Liian pieni tai suuri nopeusrajoitus. Nopeusrajoitus voi olla v�lilt� 10-120.");
		} else if (limit >= 10 && limit <= 60) {
			if (speed > limit + 15) {
				System.out.println("Rikesakko on 200 euroa.");
			} else {
				System.out.println("Rikesakko on 170 euroa");
			}
		} else if (limit >= 70 && limit <= 120) {
			if (speed > limit + 15) {
				System.out.println("Rikesakko on 200 euroa.");
			} else {
				System.out.println("Rikesakko on 140 euroa");
			}
		} else {
			System.out.println("Hyvin outoa.");
		}
	}
}
