package Viikko3;

import java.util.ArrayList;

public class Summa {

    public static void main(String[] args) {
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(2);
        luvut.add(6);
        luvut.add(-1);
        System.out.println(summa(luvut));

        luvut.add(5);
        luvut.add(1);
        System.out.println(summa(luvut));
    }

    public static int summa(ArrayList<Integer> luvut) {
    	int number = 0;
        int sum = 0;
		while (number < luvut.size()) {
			sum = sum + luvut.get(number);
			number++;
		}
        return sum;
    }
}