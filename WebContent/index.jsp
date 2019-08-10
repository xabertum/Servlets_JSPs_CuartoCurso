<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>
  <h1>Hello World!</h1>
  <ul>
    <li>
      <a href="/Udemy_Servlets_JSPs/HolaMundo">Servlet 1 (Hola Mundo 1)</a>
    </li>

    <li>
      <a href="/Udemy_Servlets_JSPs/HolaMundoServlets">Servlet 2 (Hola Mundo 2)</a>
    </li>

    <li>
      <a href="/Udemy_Servlets_JSPs/EjemploServlet">Servlet 3 (Ejemplo Servlet)</a>
    </li>
  </ul>

  <h1>Formulario Servlets</h1>
  <form name="formularioManejoParam" action="/Udemy_Servlets_JSPs/ManejoParametros" method="post">
    Usuario:
    <input type="text" name="usuario" />
    <br>
    Password:
    <input type="password" name="password" value="" />
    <br>
    <input type="submit" value="Enviar" />
  </form>
</body>
</html>