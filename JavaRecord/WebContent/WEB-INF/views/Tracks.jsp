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
			<li><a><c:out value="${ track.getName() }" /></a></li>

		</c:forEach>
	</ul>
</body>
</html>