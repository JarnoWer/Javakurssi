package Viikko7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Aanestys {
	public static void main(String[] args) {
		Map<String, Integer> voteResults = new TreeMap<>();
		Scanner reader = new Scanner(System.in);
		System.out.print("Anna ‰‰nestystiedoston nimi: ");
		String file = reader.nextLine();
		System.out.println("");
		Path filePath = Paths.get(file);
		int winnerVotes = 0;
		String winner = null;
		reader.close();
		try {
			List<String> rows = Files.readAllLines(filePath);
			for (String row : rows) {
				voteResults.putIfAbsent(row, 0);
				int votes = voteResults.get(row) + 1;
				voteResults.put(row, votes);
			}
			for (Map.Entry<String, Integer> entry : voteResults.entrySet()) {
				String key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key + ": " + value + " ‰‰nt‰");
				if (value > winnerVotes) {
					winnerVotes = value;
					winner = key;
				}
			}
			System.out.println("\nƒ‰nestyksen voitti " + winner);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
