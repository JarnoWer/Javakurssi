package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.dao.AlbumDao;
import database.dao.TrackDao;
import model.Album;
import model.Track;


@WebServlet("/Tracks")
public class TracksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AlbumDao AlbumDao = new AlbumDao();
	private TrackDao TrackDao = new TrackDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idParameter = request.getParameter("id");
		long id = Long.parseLong(idParameter);

		Album album = AlbumDao.getAlbum(id);
		List<Track> tracks = TrackDao.getTracksByAlbum(album);

		request.setAttribute("album", album);
		request.setAttribute("tracks", tracks);

		request.getRequestDispatcher("/WEB-INF/views/Tracks.jsp").include(request, response);
	}
}
 
    
    
