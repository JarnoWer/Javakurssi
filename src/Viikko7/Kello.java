package Viikko7;

public class Kello {
	private int tunnit;
	private int minuutit;
	
	public Kello(int hours, int minutes) {
		try {
			testValues(hours, minutes);
			this.tunnit = hours;
			this.minuutit = minutes;
		} catch (VirheellinenAikaPoikkeus e) {
			System.out.println(e.getMessage());
		}
			
		}
	private void testValues(int hours, int minutes) {
		if (hours > 0 && hours < 24) {
			
		} else {
			throw new VirheellinenAikaPoikkeus("Virhe syötteessä");
		}
	}
	public void lisaaMinuutit(int minutes) {
		
		minuutit = minuutit + minutes;
		while (minuutit >= 60) {
			minuutit = minuutit -60;
			tunnit ++;
			if (tunnit >= 24) {
				tunnit = 0;
			}
		}
	}
	@Override
	public String toString() {
		return tunnit + ":" + String.format("%02d", minuutit);
	}
}
