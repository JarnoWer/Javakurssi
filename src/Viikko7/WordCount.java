package Viikko7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Anna tiedoston nimi: ");
		String file = reader.nextLine();
		System.out.println("");
		Path filePath = Paths.get(file);
		int countRows = 0;
		int words = 0;
		int chars = 0;
		try {
			List<String> rows = Files.readAllLines(filePath);
			for (String row : rows) {
				countRows++;
				chars = chars + row.length();
				String[] lineToWords = row.split(" ");
				for (String oneWord : lineToWords) {
					if (oneWord != null && oneWord.isEmpty()) {
					} else {
						words++;
					}
				}
			}
			System.out.println("Tiedostossa on:\n" + countRows + " riviä\n" + words + " sanaa\n" + chars + " merkkiä");
		} catch (IOException e) {
			System.out.println(e);
		}
		reader.close();
	}
}
