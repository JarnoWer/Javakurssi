package database.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Artist;

public class ArtistDaoTest {

    @Test
    public void artistWithId50IsMetallica() {
        ArtistDao dao = new ArtistDao();
        Artist artist = dao.getArtist(50);

        assertEquals("Metallica", artist.getName());
    }

    @Test
    public void getArtistWithUnknownIdReturnsNull() {
        ArtistDao dao = new ArtistDao();
        Artist artist = dao.getArtist(-100);

        assertEquals(null, artist);
    }
}
