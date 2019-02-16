package Viikko5;

import java.util.ArrayList;
import java.util.Scanner;

public class YhteystietoLista {

	private static ArrayList<Yhteystieto> lista;

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		lista = new ArrayList<Yhteystieto>();

		while (true) {
			System.out.print("Anna seuraava komento: ");
			String command = reader.nextLine();
			String[] feed = command.split(" ");
			if (feed[0].equals("Lis‰‰")) {
				System.out.println(putYhteystieto(feed));
			} else if (feed[0].equals("Etsi")) {
				System.out.println(findContact(command));
			} else if (feed[0].equals("Poista")) {
				System.out.println(removeContact(command));
			} else if (feed[0].equals("Listaa")) {
				System.out.println(makeList());
			} else if (feed[0].equals("Poistu")) {
				break;
			} else {
				System.out.println("Tuntematon komento.");
			}
		}
		reader.close();
	}

	public static String putYhteystieto(String[] feed) {
		int size = feed.length;
		if (size > 3) {
			String name = feed[1] + " " + feed[2];
			String phone = feed[3];
			name = name.substring(0,name.length()-1);
			Yhteystieto contact = new Yhteystieto(name, phone);
			addToList(contact);
			int last = lista.size() - 1;
			String result = "Lis‰ttiin uusi yhteystieto (" + lista.get(last).toString() + ")\n";
			return result;
		} else {
			return "jotain m‰t‰‰";
		}
	}

	public static String makeList() {
		if (lista == null) {
			return null;
		} else {
			String list = "";
			for (int i = 0; i < lista.size(); i++) {
				list = list + (i) + ": " + lista.get(i).toString() + "\n";
			}
			return list;
		}
	}

	public static void addToList(Yhteystieto contact) {
		lista.add(contact);
	}

	public static String findContact(String feed) {
		// ETSI sana pois merkkijonosta
		String wanted = feed.substring(5).toLowerCase();
		String post = "";
		boolean x = false;
		int searchListLength = lista.size();
		for (int i = 0; i < searchListLength; i++) {
			String nowIn = lista.get(i).getNimi();
			nowIn = nowIn.toLowerCase();
			if (nowIn.contains(wanted)) {
				post = lista.get(i).toString() + "\n";
				x = true;
			}
		}
		if (x == true) {
			return post;
		} else {
			return "Yhteystietoa ei lˆytynyt.\n";
		}
	}

	public static String removeContact(String feed) {
		String name = feed.substring(7);
		String post = "";
		boolean x = false;
		for (int i = 0; i < lista.size(); i++) {
			String nowIn = lista.get(i).getNimi();
			if (nowIn.equalsIgnoreCase(name)) {
				lista.remove(i);
				post = "Yhteystieto poistettiin.\n";
				x = true;
			}
		}
		if (x == true) {
			return post;
		} else {
			return "Yhteystietoa ei lˆytynyt.\n";
		}
	}
}