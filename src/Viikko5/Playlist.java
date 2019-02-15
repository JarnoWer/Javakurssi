package Viikko5;

import java.util.ArrayList;

public class Playlist {
	
	private ArrayList<Song> songs;
	
	public Playlist() {
		this.songs = new ArrayList<Song>();
	}
	public void addSong(Song song) {
		this.songs.add(song);
	}
	public Song getSong(int index) {
		if (index < this.songs.size()) {
			return this.songs.get(index);
		} else {
			return null;
		}
	}
	public int getTotalLength() {
		int sum = 0;
		for (int i = 0; i < this.songs.size(); i++) {
			sum = sum + this.songs.get(i).getLength();
		}
		return sum;
	}
	public String toString() {
		if (songs == null) {
			return null;
		} else {
			String list = "";
			for (int i = 0; i < this.songs.size(); i++) {
				list = list + (i + 1) + ": " + this.songs.get(i).toString() + "\n";
			}
			return list;
		}
	}
}
