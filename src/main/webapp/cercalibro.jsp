<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ricerca Libro</title>
</head>
<body>
	Inserisci un libro:<br>
	<form action="ExecuteRicercaLibroServlet" method="post">
		<label for="titolo">Titolo:</label>
			<input type="text" name="titoloInput">
		<label for="genere">Genere:</label>
			<input type="text" name="genereInput">
		<label for="pagine">Pagine:</label>
			<input type="text" name="numeroPagineInput">    
		<input type="submit" value="cerca">
	</form>
</body>
</html>