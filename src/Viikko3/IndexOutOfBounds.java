package Viikko3;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBounds {
	public static void main(String[] args) {
		List<String> sanalista = new ArrayList<>();

		sanalista.add("Ensimmäinen");
		sanalista.add("Toinen");

		int kokonaispituus = 0;

		for (int i = 0; i < sanalista.size(); i++) {
			String sana = sanalista.get(i);
			kokonaispituus += sana.length();
			System.out.println(sanalista.get(2));
		}
	}
}
