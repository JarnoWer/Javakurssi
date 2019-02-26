package Viikko6;

import java.util.Scanner;

public class SanojenVaihtaminen {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Kirjoita lause: ");
		String signLine = reader.nextLine();
		System.out.println("Mitk‰ sanat vaihdetaan kesken‰‰n? ");
		int eka = reader.nextInt();
		int toka = reader.nextInt();
		reader.close();
		System.out.println(sanojenVaihtaminen(signLine, eka, toka));
	}
	public static String sanojenVaihtaminen(String signLine, int eka, int toka) {
		String[] separate = signLine.split(" ");
		String change = separate[eka];
		separate[eka] = separate[toka];
		separate[toka] = change;
		return String.join(" ", separate);
	}
}
