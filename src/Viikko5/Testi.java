package Viikko5;

public class Testi {
	public static void main(String[] args) {
		Playlist playlist = new Playlist();

		Artist artist = new Artist("Rick Astley", 1966);

		Song song = new Song();
		song.setTitle("Never Gonna Give You Up");
		song.setYear(1987);
		song.setLength(215);
		song.setArtist(artist);

		playlist.addSong(song);

		System.out.println(playlist);
		System.out.println(playlist.getTotalLength());

		Artist artist2 = new Artist("David Hasselhoff", 1952);

		Song song2 = new Song();
		song2.setTitle("Hooked on a Feeling");
		song2.setYear(1997);
		song2.setLength(211);
		song2.setArtist(artist2);

		playlist.addSong(song2);

		System.out.println(playlist);
		System.out.println(playlist.getTotalLength());
	}
}