package Viikko4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		List<Integer> rightRow = new ArrayList<>();
		System.out.println("Anna oikea rivi (7 numeroa + lisänumero): ");
		String right = reader.nextLine();
		String[] eight = right.split(" ");
		for (int i = 0; i < 8; i++) {
			rightRow.add(Integer.parseInt(eight[i]));
		}
		int extra = rightRow.get(7);
		List<Integer> userRow = new ArrayList<>();
		System.out.println("Anna tarkastettava rivi (7 numeroa): ");
		String user = reader.nextLine();
		String[] seven = user.split(" ");
		for (int i = 0; i < 7; i++) {
			userRow.add(Integer.parseInt(seven[i]));
		}
		reader.close();
		
		List<Integer> cutList = Leikkaus.laskeLeikkaus(rightRow, userRow);
		int howMany = cutList.size();
		boolean isExtra = cutList.contains(extra);
		if (isExtra) {
			System.out.println((howMany - 1) +" oikein ja lisänumero.");
		} else {
		System.out.println(howMany + " oikein.");
		}
	}
}
