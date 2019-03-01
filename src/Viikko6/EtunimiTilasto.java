package Viikko6;

import java.util.HashMap;
import java.util.List;

public class EtunimiTilasto {
	public static void main(String[] args) {
		TiedostonLukija fileReader = new TiedostonLukija("etunimet.csv");
		List<String> rows = fileReader.lueRivit();
		HashMap<String, Integer> nameTable = new HashMap<>();

		for (String nowRow : rows) {

			String[] split = nowRow.split(";");
			String wrongNumber = split[1];
			wrongNumber = wrongNumber.replaceAll(" ", "");
			int number = Integer.parseInt(wrongNumber);
			nameTable.put(split[0], number);
		}
	}
}