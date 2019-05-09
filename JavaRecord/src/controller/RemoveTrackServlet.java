package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dao.AlbumDao;
import database.dao.TrackDao;
import model.Album;


@WebServlet("/removeTrack")
public class RemoveTrackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TrackDao trackDao = new TrackDao();
	private AlbumDao AlbumDao = new AlbumDao();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idParameter = request.getParameter("id");
		long id = Long.parseLong(idParameter);
		long albumId = trackDao.getAlbumWithTrack(id);
		Album album = AlbumDao.getAlbum(albumId);
		trackDao.removeTrack(id);
		
		response.sendRedirect("/JavaRecord/Tracks?id=" + album.getId());
		}

}
