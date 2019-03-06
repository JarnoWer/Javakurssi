package Viikko6;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EtunimiTilasto {
	public static void main(String[] args) {
		TiedostonLukija fileReader = new TiedostonLukija("etunimet.csv");
		List<String> rows = fileReader.lueRivit();
		HashMap<String, Integer> nameTable = new HashMap<>();
		Scanner reader = new Scanner(System.in);

		for (String nowRow : rows) {

			String[] split = nowRow.split(";");
			String wrongNumber = split[1];
			wrongNumber = wrongNumber.replaceAll(" ", "");
			int number = Integer.parseInt(wrongNumber);
			int ifAlredy = nameTable.getOrDefault(split[0], 0);
			nameTable.put(split[0], ifAlredy + number);
		}
		while (true) {
			System.out.print("Anna etunimi: ");
			String findName = reader.nextLine();
			if (findName.equals("lopeta")) {
				break;
			} else {
				System.out.println(findName + ": " + nameTable.getOrDefault(findName, 0) + " kappaletta.");
			}
		}
		reader.close();
	}
}