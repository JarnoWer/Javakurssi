package Viikko6;

import java.util.Scanner;

public class MarsinLampotilat {
	public static void main(String[] args) {
		int[] results = putInTable();
		System.out.println("Mittausten keskiarvo:" + returnAvarage(results));
		
	}

	private static double returnAvarage(int[] results) {
		int number = 0;
        int sum = 0;
		while (number < results.length) {
			sum = sum + results[number];
			number++;
		}

        double result = (1.0*sum)/results.length;
		return result;
	}

	private static int[] putInTable() {
		Scanner reader = new Scanner(System.in);
		int[] allResults = new int[10];
		for (int measurement = 1; measurement < 11; measurement++) {
			System.out.println("Syötä mittaus " + measurement + "/10: ");
			int result = reader.nextInt();
			if (-140 >  result == result < 20) {
				System.out.println("Anna lämpötila väliltä -140 - +20!");
				measurement--;
			} else {
				allResults[(measurement - 1)] = result;
			}
		}
		reader.close();
		return allResults;
	}
}
