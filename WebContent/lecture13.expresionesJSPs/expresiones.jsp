<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo de Expresiones en JSP</title>
</head>
<body>
	<h1>JSP de epxresiones</h1>
	Concatenación:
	<%="Saludos" + "JSP"%><br>
	Operacion:
	<%=2 * 3 / 2%><br>
	Sesion id:
	<%=session.getId()%><br>
	<br>
	<a href="index.html">Regresar al Inicio</a>
</body>
</html>