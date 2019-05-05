<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of all artists</title>
</head>
<body>
	<h1>List of all artists</h1>
	<br>
	<a href="newArtist">Add new artist to list</a>
	<p>You can click an artist name to see albums</p>
	<ul>
		<c:forEach var="artist" items="${ artists }">
			<li><a href="Albums?id=${ artist.getId() }"> <c:out
						value="${ artist.getName() }" />
			</a></li>
		</c:forEach>
	</ul>
	<br>
	<p>
		<a href="">Back to start</a>
	</p>
</body>
</html>