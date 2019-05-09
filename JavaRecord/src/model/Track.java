package model;

public class Track {

    private long id;
    private String name;
    private long AlbumId;

    public Track(long id, String name, long aId) {
        this.id = id;
        this.name = name;
        this.AlbumId = aId;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public long AlbumId() {
    	return this.AlbumId;
    }
}
