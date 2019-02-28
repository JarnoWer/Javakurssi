package Viikko6;

import java.util.Scanner;

public class Peltipoliisit {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String highSpeeds = "";
		System.out.print("Syötä rekisterinumerot ja nopeudet. Lopuksi kirjoita \"lopeta\":");
		while (true) {
			String command = reader.nextLine();
			String[] feed = command.split(";");
			if (feed[0].equals("lopeta")) {
				break;
			} else {
				highSpeeds = highSpeeds + command + ";";
			}
		}
		System.out.println("Suurin: " + getFastest(highSpeeds) + " km/h");
		System.out.println("Pienin: " + getSlowest(highSpeeds) + " km/h");
		System.out.println("Keskiarvo: " + getAvarage(highSpeeds) + " km/h");
		reader.close();
	}

	private static double getAvarage(String highSpeeds) {
		String[] results = highSpeeds.split(";");
		int number = 1;
        int sum = 0;
		while (number < results.length) {
			sum = sum + Integer.parseInt(results[number]);
			number++;
			number++;
		}

        double result = (1.0*sum)/(results.length/2);
		return result;
	}

	private static String getSlowest(String highSpeeds) {
		String[] results = highSpeeds.split(";");
		int biggest = Integer.parseInt(results[1]);
		int number = 1;
		int plate = 0;
		while (number < results.length) {
			int nowInt = Integer.parseInt(results[number]);
			if (biggest > nowInt) {
				biggest = nowInt;
				plate = number-1;
			}
			number++;
			number++;
		}
		String regPlate = results[plate];
		return regPlate + ", " + biggest;
	}

	private static String getFastest(String highSpeeds) {
		String[] results = highSpeeds.split(";");
		int biggest = Integer.parseInt(results[1]);
		int number = 1;
		int plate = 0;
		while (number < results.length) {
			int nowInt = Integer.parseInt(results[number]);
			if (biggest < nowInt) {
				biggest = nowInt;
				plate = number-1;
			}
			number++;
			number++;
		}
		String regPlate = results[plate];
		return regPlate + ", " + biggest;
	}
}
