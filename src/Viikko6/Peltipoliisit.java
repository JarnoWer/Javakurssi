package Viikko6;

import java.util.Scanner;

public class Peltipoliisit {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String highSpeeds = "";
		while (true) {
			System.out.print("Anna seuraava komento: ");
			String command = reader.nextLine();
			String[] feed = command.split(";");
			if (feed[0].equals("lopeta")) {
				break;
			} else {
				highSpeeds = highSpeeds + command + ";";
			}
		}
		System.out.println(highSpeeds);
		// System.out.println("Suurin: " + getFastest(highSpeeds) + " km/h");
		// System.out.println("Suurin: " + getSlowest(highSpeeds) + " km/h");
		// System.out.println("Suurin: " + getAvarage(highSpeeds) + " km/h");
		reader.close();
	}

	private static String getAvarage(String[] highSpeeds) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getSlowest(String[] highSpeeds) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getFastest(String[] highSpeeds) {
		// TODO Auto-generated method stub
		return null;
	}
}
