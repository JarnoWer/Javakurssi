package database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ChinookDatabase;
import model.Artist;

public class ArtistDao {
    private ChinookDatabase db = new ChinookDatabase();

    public Artist getArtist(long id) {
        Connection conn = db.connect();
        PreparedStatement statement = null;
        ResultSet results = null;

        try {
            statement = conn.prepareStatement("SELECT * FROM Artist WHERE ArtistId = ?");
            statement.setLong(1, id);
            results = statement.executeQuery();

            if (results.next()) {
                String name = results.getString("Name");
                long artistId = results.getLong("ArtistId");

                return new Artist(artistId, name);
            } else {
                return null;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            db.close(results, statement, conn);
        }
    }

    public List<Artist> getAllArtists() {
        return new ArrayList<Artist>();
    }
}
