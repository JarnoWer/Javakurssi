package Viikko2;

import java.util.Scanner;

public class MerkkijonojenVertailu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Sy�t� kaksi merkkijonoa.");
        String first = reader.nextLine();
        String second = reader.nextLine();

        if (first.equals(second)) {
            System.out.println("Sy�tetyt merkkijonot olivat samat!");
        } else {
            System.out.println("Sy�tetyt merkkijonot eiv�t olleet samat!");
        }
        reader.close();
    }
}
