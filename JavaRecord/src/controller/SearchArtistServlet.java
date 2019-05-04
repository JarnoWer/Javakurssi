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

@WebServlet("/searchArtist")
public class SearchArtistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ArtistDao artistDao = new ArtistDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String keyword = request.getParameter("keyword");

		List<Artist> artists = artistDao.findArtistsByName(keyword);

		request.setAttribute("artists", artists);

		request.getRequestDispatcher("/WEB-INF/views/searchArtist.jsp").include(request, response);

	}

}
