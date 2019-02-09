package Viikko4;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Leikkaus {
	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<>();
		listA.add(3);
		listA.add(2);
		listA.add(6);
		listA.add(-1);
		List<Integer> listB = new ArrayList<>();
		listB.add(3);
		listB.add(98);
		listB.add(-1);
		listB.add(-1);
		System.out.println("Lista A: " + listA);
		System.out.println("Lista B: " + listB);
		System.out.println("Listojen A ja B leikkaus: " + laskeLeikkaus(listA, listB));
	}

	public static List<Integer> laskeLeikkaus(List<Integer> listA, List<Integer> listB) {
		List<Integer> allResult = new ArrayList<>();
		int size = listA.size();
		int counter = 0;
		while (counter < size) {
			int number = listA.get(counter);
			int sizeB = listB.size();
			for (int countRound = 0; countRound < sizeB; countRound++) {
				int comparison = listB.get(countRound);
				if (number == comparison) {
					allResult.add(number);
				}
			}
			counter++;
		}
		List<Integer> listResult = allResult.stream().distinct().collect(Collectors.toList());
		return listResult;
		// Colletctorsin lähteenä https://www.geeksforgeeks.org/how-to-remove-duplicates-from-arraylist-in-java/
	}

}
