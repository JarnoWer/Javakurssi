<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Artist search results</title>
</head>
<body>
	<h1>Results</h1>
	<ul>
		<c:forEach var="artist" items="${ artists }">
			<li><a href="Albums?id=${ artist.getId() }"> <c:out
						value="${ artist.getName() }" />
			</a></li>
		</c:forEach>
	</ul>
	<form method="get" action="searchArtist">
		<input type="text" name="keyword" /> <input type="submit"
			value="Search by Artist" />
	</form>
	<p>
		<a href="">Back to start</a>
	</p>
</body>
</html>