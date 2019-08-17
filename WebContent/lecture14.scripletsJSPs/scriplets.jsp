<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP con Scriplets</title>
</head>
<body>
	<h1>JSO con Scriplets</h1>
	<!-- Scriplet para enviar información al navegador -->
	<%
		out.println("Saludos desde un scriplet");
	%>
	<br>
	<%
		String nombreAplicacion = request.getContextPath();
		out.println("nombreAplicación: " + nombreAplicacion);
	%>
	<br>
	<!-- Scriplet con codigo condicionado -->
	<%
		if (session != null && session.isNew()) {
	%>
	la Sesión SI es nueva
	<%
		} else if (session != null) {
	%>
	la sesión NO es nueva
	<%
		}
	%>
</body>
</html>