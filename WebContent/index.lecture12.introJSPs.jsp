<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hola Mundo JSP</title>
</head>
<body>
  <h1>Ejercicio de Hola Mundo con JSPs</h1>
  <!-- Impresion de cadenas con diferentes tecnologias -->
  <ul>
    <li>Hola mundo con HTML</li>
    <li>
      <%
      	out.print("Hola mundo con Scriptlets");
      %>
    </li>
    <li>${"Hola mundo con Expression Language (EL)"}</li>
  </ul>
  <!-- Algunos valores del lado del servidor -->
  <ul>
    <li>
      Hola:
      <%=new Date()%>
    </li>
    <li>
      Nombre del contexto de la aplicacion:
      <%=request.getContextPath()%></li>
    <li>
      Valor del parametro x:
      <%=request.getParameter("x")%></li>      
  </ul>
  
  

</body>
</html>