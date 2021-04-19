<%@page import="it.prova.ricercalibro.model.Libro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Libro Presente</title>
</head>
<body>
	Il libro che cerchi è
	<% Libro libroPresente = (Libro) request.getAttribute("esito_attribute"); %><br>
	Titolo: <%= libroPresente.getTitolo() %><br>
	Genere: <%= libroPresente.getGenere() %><br>
	Pagine: <%= libroPresente.getNumeroPagine() %><br>
	ed è presente<br>

	
	<a href="cercalibro.jsp">home</a>
</body>
</html>