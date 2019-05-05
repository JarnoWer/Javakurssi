package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dao.AlbumDao;
import database.dao.ArtistDao;
import model.Artist;

@WebServlet("/newAlbum")
public class NewAlbumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArtistDao artistDao = new ArtistDao();
	private AlbumDao albumDao = new AlbumDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idParameter = request.getParameter("id");
		long id = Long.parseLong(idParameter);
		Artist artist = artistDao.getArtist(id);
		request.setAttribute("artist", artist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/newAlbum.jsp");
		dispatcher.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idParameter = request.getParameter("id");
		long id = Long.parseLong(idParameter);

		String albumName = request.getParameter("new");
		if (albumName == null || "".equals(albumName)) {
			request.setAttribute("error", "No name given");
			doGet(request, response);
		} else {
			albumDao.storeAlbum(albumName, id);
			Artist artist = artistDao.getArtist(id);
			response.sendRedirect("/JavaRecord/Albums?id=" + artist.getId());
		}

	}
}
