package Viikko6;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;

public class UseanKaannoksenSanakirja {

	private Map<String, TreeSet<String>> dictionary = new HashMap<>();

	public void lisaa(String sana, String kaannos) {
		dictionary.putIfAbsent(sana, new TreeSet<String>());
		Set<String> already = dictionary.get(sana);
		already.add(kaannos);		
	}

	public Set<String> kaanna(String sana) {
		dictionary.putIfAbsent(sana, new TreeSet<String>());
		return dictionary.get(sana);
	}

	public void poista(String sana) {
		dictionary.remove(sana);
	}
}
