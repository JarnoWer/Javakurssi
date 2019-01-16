package Viikko1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kimppakyyti {
	
	private static Scanner reader;
	
	public static void main(String[] args) {
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		reader = new Scanner(System.in);
		System.out.println("Anna ajetut kilometrit: ");
		double distance = reader.nextDouble();
		System.out.println("Anna kulutus per 100 km: ");
		double consump = reader.nextDouble();
		System.out.println("Anna polttoaineen litrahinta: ");
		double gasoPrice = reader.nextDouble();
		System.out.println("Anna kimppakyytiläisten lukumäärä: ");
		int headCount = reader.nextInt();
		String headPrice = twoDecimal.format(distance * consump / 100.0 * gasoPrice / headCount);
		System.out.println("Bensakustannus per henkilö on " + headPrice + " euroa");
	}
}
