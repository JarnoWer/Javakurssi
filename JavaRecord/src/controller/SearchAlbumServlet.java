package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dao.AlbumDao;
import model.Album;

@WebServlet("/searchAlbum")
public class SearchAlbumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AlbumDao albumDao = new AlbumDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String keyword = request.getParameter("keyword");

		List<Album> albums = albumDao.findAlbumsByTitle(keyword);

		request.setAttribute("albums", albums);

		request.getRequestDispatcher("/WEB-INF/views/searchAlbum.jsp").include(request, response);

	}

}
