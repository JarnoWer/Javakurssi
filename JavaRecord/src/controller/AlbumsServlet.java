package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dao.AlbumDao;
import database.dao.ArtistDao;
import model.Album;
import model.Artist;

@WebServlet("/Albums")
public class AlbumsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArtistDao artistDao = new ArtistDao();
	private AlbumDao AlbumDao = new AlbumDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idParameter = request.getParameter("id");
		long id = Long.parseLong(idParameter);

		Artist artist = artistDao.getArtist(id);
		List<Album> albums = AlbumDao.getAlbumsByArtist(artist);

		request.setAttribute("artist", artist);
		request.setAttribute("albums", albums);

		request.getRequestDispatcher("/WEB-INF/views/Albums.jsp").include(request, response);
	}
}
