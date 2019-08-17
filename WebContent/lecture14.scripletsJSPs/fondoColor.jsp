<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String fondoString = request.getParameter("colorFondo");
	// si no se envio un color ponemos un color por default
	if (fondoString == null || fondoString.trim().equals("")) {
		fondoString = "white";
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="<%=fondoString%>">
	<h1>
		Fondo de color aplicado:
		<%=fondoString%></h1>
	<br>
	<a href="index.html">Regresar al Index</a>
</body>
</html>