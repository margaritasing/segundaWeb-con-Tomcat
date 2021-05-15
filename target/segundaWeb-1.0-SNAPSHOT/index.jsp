<%@ page import="com.example.segundaWeb.Alumna" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    Alumna alumna = new Alumna("juli", "back");
%>
<!DOCTYPE html>
<html><head>
    <title>Primer JSP</title>
    <link rel='stylesheet' href='css/estilos.css' />
</head>
<body>
<h1 class="titulo">Listado de alumnas</h1>
<h2><%= "Ejemplo de uso de un objeto: " + alumna.getCurso() %></h2>
<br/>
<table>
    <tr><td>Curso</td><td>Listado de alumnas</td></tr>
    <tr><td>Frontend 8</td><td><a href="detallesCurso?curso=front8">click para ver detalles</a></td></tr>
    <tr><td>Backend 5</td><td><a href="detallesCurso?curso=back5">click para ver detalles</a></td></tr>
</table>


</body>
</html>