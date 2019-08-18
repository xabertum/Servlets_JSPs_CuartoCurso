<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%-- Agregamos una declaración --%>
<%!//Declaramos una variable con su metodo get.
	private String usuarioString = "Alberto";

	public String getUsuario() {
		return this.usuarioString;
	}

	//Declaramos un contador de visitas
	private int contadorVisitas = 1;%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Uso de Declaraciones</title>
</head>
<body>
	<h1>Uso de Declaraciones</h1>
	<p>
		Usuario por medio del atributo:
		<%=this.usuarioString%></p>
	<p>
		Usuario por medio del metodo:
		<%=this.getUsuario()%></p>
	<p>
		Contador de visitas desde que se reiniió el servidor:
		<%=this.contadorVisitas++%></p>


</body>
</html>