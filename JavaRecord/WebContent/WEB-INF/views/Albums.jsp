<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Albums by artist</title>
</head>
<body>
	<h1>
		List of albums by
		<c:out value="${ artist.getName() }" />
	</h1>
	<p>You can click an album name to see tracks</p>
	<ul>

		<c:forEach var="album" items="${ albums }">
			<li><a href="Tracks?id=${ album.getId() }"><c:out
						value="${ album.getTitle() }" /></a></li>
		</c:forEach>
	</ul>
	<p>
		<a href="newAlbum?id=${ artist.getId() }">Add new album to <c:out value="${ artist.getName() }" /></a>
	</p>
	<br>
	<p>
		<a href="">Back to start</a>
	</p>
</body>
</html>