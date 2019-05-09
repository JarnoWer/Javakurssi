<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Album search results</title>
</head>
<body>
	<h1>Results</h1>
	<ul>
		<c:forEach var="album" items="${ albums }">
			<li><a href="Tracks?id=${ album.getId() }"><c:out
						value="${ album.getTitle() }" /></a></li>
		</c:forEach>
	</ul>
	<form method="get" action="searchAlbum">
		<input type="text" name="keyword" /> <input type="submit"
			value="Search by Album" />
	</form>
	<p>
		<a href="">Back to start</a>
	</p>
</body>
</html>