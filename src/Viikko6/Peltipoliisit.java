package Viikko6;

import java.util.Scanner;

public class Peltipoliisit {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print("Anna seuraava komento: ");
			String command = reader.nextLine();
			String[] feed = command.split(";");
			if (feed[0].equals("lopeta")) {
				break;
			} else {
				
			}
		}
		reader.close();
	}
}
