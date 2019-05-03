<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
</head>
<body>
	<h1>Welcome</h1>
	<form method="get" action="searchArtist">
        <input type="text" name="keyword" />
        <input type="submit" value="Search by Artist" />
    </form>
    <form method="get" action="searchAlbum">
        <input type="text" name="keyword" />
        <input type="submit" value="Search by Album" />
    </form>
    <a href="ListArtists">List of all Artists</a>
</body>
</html>