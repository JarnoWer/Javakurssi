package Viikko4;

import java.util.ArrayList;
import java.util.List;

public class Numerot {
	public static void main(String[] args) {
		List<Integer> arvot = new ArrayList<>();
	       arvot.add(3);
	       arvot.add(2);
	       arvot.add(6);
	       arvot.add(-1);
	       System.out.println("Muodostetaan lista: " + arvot);
	       System.out.println("Listan pienin arvo on: " + pienin(arvot));
	       System.out.println("Listan suurin arvo on: " + suurin(arvot));
	       System.out.println("Listan arvojen summa on: " + summa(arvot));
	}
	public static int pienin(List<Integer> arvot) {
		int smallest = arvot.get(0);

		int number = 0;
		while (number < arvot.size()) {
			int nowInt = arvot.get(number);
			if (smallest > nowInt) {
				smallest = nowInt;
			}
			number++;
		}
		return smallest;
	}
	public static int suurin(List<Integer> arvot) {
		int biggest = arvot.get(0);

		int number = 0;
		while (number < arvot.size()) {
			int nowInt = arvot.get(number);
			if (biggest < nowInt) {
				biggest = nowInt;
			}
			number ++;
		}
		return biggest;
	}
	public static int summa(List<Integer> arvot) {
		int number = 0;
        int sum = 0;
		while (number < arvot.size()) {
			sum = sum + arvot.get(number);
			number++;
		}
        return sum;
	}
}