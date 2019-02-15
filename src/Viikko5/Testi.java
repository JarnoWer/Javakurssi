package Viikko5;

public class Testi {
	public static void main(String[] args) {
<<<<<<< HEAD
		Playlist playlist = new Playlist();

		Artist artist = new Artist("Rick Astley", 1966);

=======
		Artist artist = new Artist("Rick", 1966);
		System.out.println(artist);
>>>>>>> 1c7c831506947840b52e321412cd79a50ab62754
		Song song = new Song();
		System.out.println(song.getArtist());
		song.setArtist("Laulaja");
		song.setTitle("Never Gonna Give You Up");
		song.setYear(1987);
		song.setLength(215);
<<<<<<< HEAD
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
=======
		System.out.println(song);
		System.out.println(artist);
		//song.setArtist(artist);
		System.out.println(song);
    }
>>>>>>> 1c7c831506947840b52e321412cd79a50ab62754
}