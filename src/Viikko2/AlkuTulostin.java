package Viikko2;

import java.util.Scanner;

public class AlkuTulostin {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Kirjoita sana: ");
		String word = reader.nextLine();
		reader.close();
		int length = word.length();
		for (int count = 1; count <= length; count++)
			System.out.println(word.substring(0, count));
	}
}