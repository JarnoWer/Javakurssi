package Viikko5;

public class Song {

	private String title;
	private Artist songArtist;
	private int year;
	private int length;

	public String getTitle() {
		if (this.title == null) {
			return null;
		}
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
<<<<<<< HEAD
		if (songArtist == null) {
			return null;
		}
		return songArtist.getName();
	}

	public void setArtist(Artist artist2) {
		songArtist = artist2;
		String name = songArtist.getName();
		songArtist.setName(name);
=======
		String artturi = artist.getName();
		return artturi;
	}

	public void setArtist(String singer) {
		
		artist.setName(singer);
>>>>>>> 1c7c831506947840b52e321412cd79a50ab62754
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		if (this.songArtist != null) {
			return this.title + " by " + songArtist.getName();
		} else {
			return this.title;
		}
	}
}
