package Viikko7;

public class Kello {
	private int tunnit;
	private int minuutit;

	public Kello(int hours, int minutes) {
		if (hours >= 0 && hours < 24) {
		} else {
			throw new VirheellinenAikaPoikkeus("Tunnit täytyy olla välillä 0-23");
		}
		if (minutes >= 0 && minutes < 60) {
		} else {
			throw new VirheellinenAikaPoikkeus("Minuutit täytyy olla välillä 0-59");
		}
		this.tunnit = hours;
		this.minuutit = minutes;

	}

	public void setMinuutit(int minutes) {
		if (minutes >= 0 && minutes < 60) {
		} else {
			throw new VirheellinenAikaPoikkeus("Minuutit täytyy olla välillä 0-59");
		}
		this.minuutit = minutes;
	}

	public int getMinuutit() {
		return this.minuutit;
	}

	public int getTunnit() {
		return this.tunnit;
	}

	public void setTunnit(int hours) {
		if (hours >= 0 && hours < 24) {
		} else {
			throw new VirheellinenAikaPoikkeus("Tunnit täytyy olla välillä 0-23");
		}
		this.tunnit = hours;
	}

	public void lisaaMinuutit(int minutes) {
		try {
			if (minutes >= 0) {
			} else {
				throw new VirheellinenAikaPoikkeus("Minuutteja voi vain lisätä");
			}
			minuutit = minuutit + minutes;
			while (minuutit >= 60) {
				minuutit = minuutit - 60;
				tunnit++;
				if (tunnit >= 24) {
					tunnit = 0;
				}
			}
		} catch (VirheellinenAikaPoikkeus e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public String toString() {
		return tunnit + ":" + String.format("%02d", minuutit);
	}
}
