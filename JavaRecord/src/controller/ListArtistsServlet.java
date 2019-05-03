package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dao.ArtistDao;
import model.Artist;

@WebServlet("/ListArtists")
public class ListArtistsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ArtistDao dao = new ArtistDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Artist> allArtists = dao.getAllArtists();

		req.setAttribute("artists", allArtists);

		req.getRequestDispatcher("/WEB-INF/views/listArtists.jsp").include(req, resp);
	}
}
