package Viikko3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListanLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");

        while (true) {
            int syote = lukija.nextInt();

            if (syote == -1) {
                break;
            } else {
                luvut.add(syote);
            }
        }
        lukija.close();

        System.out.println(); 
        int number = 0;
        int sum = 0;
		while (number < luvut.size()) {
			sum = sum + luvut.get(number);
			number++;
		}
        
        System.out.println("Summa: " + sum);
    }
}