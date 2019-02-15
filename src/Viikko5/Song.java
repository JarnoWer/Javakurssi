package Viikko5;

public class Song {

	private String title;
	private Artist songArtist;
	private int year;
	private int length;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		if (songArtist == null) {
			return null;
		}
		return songArtist.getName();
	}

	public void setArtist(Artist artist2) {
		songArtist = artist2;
		String name = songArtist.getName();
		songArtist.setName(name);
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