package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dao.ArtistDao;
import model.Artist;

@WebServlet("/newArtist")
public class NewArtistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArtistDao artistDao = new ArtistDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/newArtist.jsp");
		dispatcher.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String artistName = request.getParameter("new");
		if (artistName == null || "".equals(artistName)) {
			request.setAttribute("error", "No name given");
			doGet(request, response);
		} else {
			artistDao.storeArtist(artistName);
			Artist artist = artistDao.getArtistId(artistName);
			response.sendRedirect("/JavaRecord/Albums?id=" + artist.getId());
		}

	}
}
