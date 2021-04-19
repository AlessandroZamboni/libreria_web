<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Libro Non Presente</title>
</head>
<body>
	Il libro non è presente, vuoi crearlo?<br>
	<form action="ExecuteAddLibroServlet" method="post">
		<label for="titolo">Titolo:</label>
			<input type="text" name="titoloInput">
		<label for="genere">Genere:</label>
			<input type="text" name="genereInput">
		<label for="pagine">Pagine:</label>
			<input type="text" name="numeroPagineInput">    
		<input type="submit" value="aggiungi">
		<a href="cercalibro.jsp">home</a>
	</form>
</body>
</html>