package Viikko5;

import java.util.ArrayList;
import java.util.Scanner;

public class YhteystietoLista {
	
	private static ArrayList<Yhteystieto> lista;
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("Anna seuraava komento: ");
			String command = reader.next();
			if (command.equals("Lis‰‰")) {
				System.out.println(putYhteystieto(reader.nextLine()));
				
			} else if (command.equals("Etsi")) {
				System.out.println("Etsi sana havaittu");
			} else if (command.equals("Poista")) {
				
			} else if (command.equals("Listaa")) {
				
			} else if (command.equals("Poistu")) {
				break;
			} else {
				System.out.println("Tuntematon komento.");
			}
			reader.nextLine();
		}
		reader.close();
	}
	public static String putYhteystieto(String row) {
		String[] words = row.split(" ");
		int size = words.length;
		if ( size > 3) {
		String name = words[0] + " " + words[1];
		String phone = words[2];
		lista = new ArrayList<Yhteystieto>();
		Yhteystieto contact = new Yhteystieto(name, phone);
		lista.add(contact);
		String result = "Lis‰ttiin uusi yhteystieto ";
		return result;
		} else {
			return "jotain m‰t‰‰";
		}
	}
	
}
