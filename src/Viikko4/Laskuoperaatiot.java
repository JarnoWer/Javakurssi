package Viikko4;

public class Laskuoperaatiot {
	public static void main(String[] args) {
		double first = 9.0;
		double second = 3.0;
		System.out.println("Suoritetaan testi arvoilla " + first + " ja " + second + ":\n");
		System.out.println(first + " + " + second + " = " + summa(first, second));
		System.out.println(first + " + " + second + " = " + erotus(first, second));
	}

	public static double summa(double first, double second) {
		double sum = first + second;
		return sum;
	}

	public static double erotus(double first, double second) {
		double sum = first - second;
		return sum;
	}
}