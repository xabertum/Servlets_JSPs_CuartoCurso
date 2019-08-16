<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Procesa Formulario</title>
</head>
<body>
	<h1>Proceso de Formulario</h1>
	<p>
		Usuario:
		<%=request.getParameter("usuario")%>
	</p>
	<p>
		Password:
		<%=request.getParameter("password")%>
	</p>
	<a href="index.htlm">Regresar al inicio</a>
</body>
</html>