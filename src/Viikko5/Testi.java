package Viikko5;

public class Testi {
	public static void main(String[] args) {
		Artist artist = new Artist("Rick Astley", 1966);
		System.out.println(artist);

		Song song = new Song();
		song.setTitle("Never Gonna Give You Up");
		song.setYear(1987);
		song.setLength(215);
		System.out.println(song);

		//song.setArtist(artist);
		System.out.println(song);
    }
}