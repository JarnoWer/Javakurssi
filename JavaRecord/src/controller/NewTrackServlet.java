package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dao.AlbumDao;
import database.dao.TrackDao;
import model.Album;

@WebServlet("/newTrack")
public class NewTrackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AlbumDao albumDao = new AlbumDao();
	private TrackDao trackDao = new TrackDao();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idParameter = request.getParameter("id");
		long id = Long.parseLong(idParameter);
		Album album = albumDao.getAlbum(id);
		request.setAttribute("album", album);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/newTrack.jsp");
		dispatcher.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idParameter = request.getParameter("id");
		long id = Long.parseLong(idParameter);

		String trackName = request.getParameter("new");
		if (trackName == null || "".equals(trackName)) {
			request.setAttribute("error", "No name given");
			doGet(request, response);
		} else {
			trackDao.storeTrack(trackName, id);
			Album album = albumDao.getAlbum(id);
			response.sendRedirect("/JavaRecord/Tracks?id=" + album.getId());
		}

	}
}
