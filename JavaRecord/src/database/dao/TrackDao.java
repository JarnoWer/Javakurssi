package database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ChinookDatabase;
import model.Album;
import model.Track;

public class TrackDao {
	private ChinookDatabase db = new ChinookDatabase();
	public List<Track> getTracksByAlbum(Album album) {
		Connection conn = db.connect();
		PreparedStatement statement = null;
		ResultSet results = null;

		List<Track> tracks = new ArrayList<>();

		try {
			statement = conn.prepareStatement(
					"SELECT TrackId, Name, AlbumId FROM Track WHERE AlbumId = ? ORDER BY TrackId ASC ");

			statement.setLong(1, album.getId());

			results = statement.executeQuery();

			while (results.next()) {
				long id = results.getLong("TrackId");
				String name = results.getString("Name");
				long AId = results.getLong("AlbumId");

				tracks.add(new Track(id, name, AId));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			db.close(results, statement, conn);
		}

		return tracks;
	}

	public long getAlbumWithTrack(long id) {
		Connection conn = db.connect();
		PreparedStatement statement = null;
		ResultSet results = null;

		try {
			statement = conn.prepareStatement("SELECT AlbumId FROM Track WHERE TrackId = ?");

			statement.setLong(1, id);

			results = statement.executeQuery();

			if (results.next()) {
				long AlbumId = results.getLong("AlbumId");

				return AlbumId;
			} else {
				return 0;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			db.close(results, statement, conn);
		}

	}

	public void removeTrack(long id) {
		Connection conn = db.connect();
		PreparedStatement statement = null;
		ResultSet results = null;
		
		
			try {
				statement = conn.prepareStatement("DELETE FROM Track WHERE TrackId=?");
				statement.setLong(1, id);
				statement.executeUpdate();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			} finally {
				db.close(results, statement, conn);
			}
		
		
	}

	public void storeTrack(String trackName, long id) {
		Connection conn = db.connect();
		PreparedStatement statement = null;
		ResultSet results = null;
		
		
			try {
				statement = conn.prepareStatement("INSERT INTO Track (Name, AlbumId, MediaTypeId, GenreId, Milliseconds, UnitPrice) VALUES (?,?,2,9,123456,1)");
				statement.setString(1, trackName);
				statement.setLong(2, id);
				statement.executeUpdate();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			} finally {
				db.close(results, statement, conn);
			}
		
	}
		
	}


