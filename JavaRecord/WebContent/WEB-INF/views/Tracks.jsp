<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tracks by album</title>
</head>
<body>
	<h1>
		List of tracks by
		<c:out value="${ album.getTitle() }" />
	</h1>
	<ul>
		<c:forEach var="track" items="${ tracks }">
			<li><a><c:out value="${ track.getName() }" /> </a><a
				href="removeTrack?id=${ track.getId() }">Remove this track</a></li>
		</c:forEach>
	</ul>
	<p>
		<a href="newTrack?id=${ album.getId() }">Add new track to <c:out
				value="${ album.getTitle() }" /></a>
	</p>
	<br>
	<p>
		<a href="">Back to start</a>
	</p>
</body>
</html>