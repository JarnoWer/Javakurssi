package Viikko6;

import java.util.HashMap;

public class Sanakirja {
	private HashMap<String, String> dictionary = new HashMap<>();
	public String kaanna(String word) {
		return dictionary.get(word);
	}
	public void lisaa (String word, String translation) {
		dictionary.put(word, translation);
	}
}
