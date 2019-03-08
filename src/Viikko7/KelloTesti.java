package Viikko7;

public class KelloTesti {

	public static void main(String[] args) {
		Kello kello = new Kello(11, 22);
		System.out.println(kello);
		kello.lisaaMinuutit(-29);
		System.out.println(kello);
		kello.lisaaMinuutit(135);
		System.out.println(kello);
		kello.setMinuutit(15);
		System.out.println(kello);
		kello.setMinuutit(61);
		System.out.println(kello.getTunnit());
		Kello kello2 = new Kello(11, -5);
		System.out.println(kello2);
	}

}
