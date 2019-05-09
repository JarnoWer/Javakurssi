<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new track to</title>
</head>
<body>
	<h1>
		Add new track to
		<c:out value="${ album.getTitle() }" />
	</h1>

	<c:if test="${ error != null }">
		<p>
			Error:
			<c:out value="${ error }" />
		</p>
	</c:if>

	<form method="post">
		<label>Name: <input name="new" />
		</label> <input type="submit" value="Save" />
	</form>

</body>
</html>