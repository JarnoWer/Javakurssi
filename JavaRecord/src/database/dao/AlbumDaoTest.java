package database.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import model.Album;

public class AlbumDaoTest {

    @Test
    public void testSearchingByKeyword() {
        AlbumDao dao = new AlbumDao();

        List<Album> albums = dao.findAlbumsByTitle("wild");

        assertEquals("Restless and Wild", albums.get(0).getTitle());
    }

    @Test
    public void testSearchingWithUnexistingKeyword() {
        AlbumDao dao = new AlbumDao();

        List<Album> albums = dao.findAlbumsByTitle("�123");

        assertTrue(albums.isEmpty());
    }
    @Test
    public void albumWithId140IsMDM() {
        AlbumDao dao = new AlbumDao();
        Album album = dao.getAlbum(140);

        assertEquals("Mais Do Mesmo", album.getTitle());
    }

    @Test
    public void getArtistWithUnknownIdReturnsNull() {
    	AlbumDao dao = new AlbumDao();
        Album album = dao.getAlbum(-140);

        assertEquals(null, album);
    }
}
