package Viikko6;

import java.util.Scanner;

public class MarsinLampotilat {
	public static void main(String[] args) {
		int[] results = putInTable();
		System.out.println("Mittausten keskiarvo:" + returnAvarage(results));
		System.out.println("Pienin mittaustulos: " + getSmallest(results));
		System.out.println("Suurin mittaustulos: " + getBig(results));
		
	}

	private static int getBig(int[] results) {
		int biggest = results[0];

		int number = 0;
		while (number < results.length) {
			int nowInt = results[number];
			if (biggest < nowInt) {
				biggest = nowInt;
			}
			number++;
		}
		return biggest;
	}

	private static int getSmallest(int[] results) {
		int smallest = results[0];

		int number = 0;
		while (number < results.length) {
			int nowInt = results[number];
			if (smallest > nowInt) {
				smallest = nowInt;
			}
			number++;
		}
		return smallest;
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
