package Viikko5;

public class Song {

	private String title;
	private Artist artist;
	private int year;
	private int length;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		String artturi = artist.getName();
		return artturi;
	}

	public void setArtist(String singer) {
		
		artist.setName(singer);
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
		if (this.artist != null) {
			return this.title + " by " + artist.getName();
		} else {
			return this.title;
		}
	}
}
