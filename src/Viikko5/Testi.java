package Viikko5;

public class Testi {
	public static void main(String[] args) {
		Artist artist = new Artist("Rick", 1966);
		System.out.println(artist);
		Song song = new Song();
		System.out.println(song.getArtist());
		song.setArtist("Laulaja");
		song.setTitle("Never Gonna Give You Up");
		song.setYear(1987);
		song.setLength(215);
		System.out.println(song);
		System.out.println(artist);
		//song.setArtist(artist);
		System.out.println(song);
    }
}