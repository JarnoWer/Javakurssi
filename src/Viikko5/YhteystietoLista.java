package Viikko5;

import java.util.ArrayList;
import java.util.Scanner;

public class YhteystietoLista {

	private static ArrayList<Yhteystieto> lista;

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		lista = new ArrayList<Yhteystieto>();

		while (true) {
			System.out.println("Anna seuraava komento: ");
			String command = reader.nextLine();
			String[] feed = command.split(" ");
			if (feed[0].equals("Lis‰‰")) {
				System.out.println(putYhteystieto(feed));
			} else if (feed[0].equals("Etsi")) {
				System.out.println(findContact(feed));
			} else if (feed[0].equals("Poista")) {

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
			Yhteystieto contact = new Yhteystieto(name, phone);
			addToList(contact);
			String result = "Lis‰ttiin uusi yhteystieto ";
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

	public static String findContact(String[] feed) {
		int size = feed.length;
		
	}
}
