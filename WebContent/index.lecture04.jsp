<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/style.css">
<script type="text/javascript" src="resources/funciones.js"></script>
</head>
<body>
	<h1>Lecture04</h1>
	<form onsubmit="return validarForma(this);" name="formulario1" method="post" action="Udemy_Servlets_JSPs/ManejoFormulariosHTML">
		<input type="hidden" name="oculto" value="valorOculto" />
		<table width="200" id="one-colum-empahsis">

			<caption>Formulario Registro de Datos</caption>
			<tr>
				<td class="oce-first">Usuario: (*)</td>
				<td>
					<input type="text" class="default" name="usuario" value="Introducir Usuario" onfocus="this.select();" />
				</td>
			</tr>
			<tr>
				<td class="oce-first">Password:</td>
				<td>
					<input type="password" class="default" name="password" onfocus="this.select();" />
				</td>
			</tr>
			<tr>
				<td>

					Java
					<input type="checkbox" name="tecnologia" value="java" />
					.Net
					<input type="checkbox" name="tecnologia" value="net" />
					PHP
					<input type="checkbox" name="tecnologia" value="php" />

				</td>
			</tr>

			<tr>
				<td class="oce-first">Genero: (*)</td>
				<td>
					Hombre:
					<input type="radio" name="genero" value="H" />
				</td>
				<td>
					Mujer:
					<input type="radio" name="genero" value="M" />
				</td>
			</tr>
			<tr>
				<td class="oce-first">Ocupacion: (*)</td>
				<td>
					<select name="ocupacion" class=default"">
						<option value="">Seleccionar</option>
						<option value="1">Profesor</option>
						<option value="2">Ingeniero</option>
						<option value="3">Jubilado</option>
						<option value="4">Otro</option>
					</select>
				</td>
			</tr>
			<tr>
				<td class="oce-first">Musica favorita:</td>
				<td>
					<select name="musica" multiple class="default">
						<option value="rock">Rock</option>
						<option value="pop">Pop</option>
						<option value="jazz">Jazz</option>
					</select>
				</td>
			</tr>

			<tr>
				<td class="oce-first">Comentarios</td>
				<td>
					<textarea name="comentarios" class="default" cols="30" rows="10" onfocus="this.select();">Escribir un texto</textarea>
				</td>
			</tr>
			
			<tr>
				
			
			</tr>

		</table>


	</form>
</body>
</html>