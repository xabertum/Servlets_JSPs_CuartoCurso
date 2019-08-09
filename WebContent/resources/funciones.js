/**
 * Archivo de validacion del formulario
 * @author xabertum
 */

function validarForma(forma) {

	// Validamos el usuario
	var usuario = forma.usuario;
	if (usuario.value == "" || usuario.value == "Escribir usuario") {
		alert("Debe introducir un usario valido")
		usuario.focus();
		usuario.select();
		return false;
	}

	// Validamos el password
	var password = forma.password;
	if (password.value == "" || password.value.length < 3) {
		alert("Debe introducir un password valido")
		password.focus();
		password.select();
		return false;
	}

	// Validamos las tecnologias de interes
	var tecnologias = forma.tecnologia;
	var checkSeleccionado = false;

	// Revisamos si se selecciono algun checkbox
	for (let index = 0; index < tecnologias.length; index++) {
		if (tecnologias[i].checked) {
			checkSeleccionado = true;
		}
	}

	if (!checkSeleccionado) {
		alert("Debe seleccionar alguna tecnología");
		return false;
	}

	// Validamos el genero
	var generos = forma.genero;
	var radioSeleccionado = false;

	// Revisamos si se selecciono algun radiobutton
	for (let index = 0; index < generos.length; index++) {
		if (generos[i].checked) {
			radioSeleccionado = true;
		}
	}

	if (!radioSeleccionado) {
		alert("Debe seleccionar su genero");
		return false;
	}

	// Validamos la ocupación
	var ocupacion = forma.ocupacion;
	if (ocupacion.value = "") {
		alert("Debe seleccionar una ocupación");
		return false;
	}

	// Formulario validado
	alert("Formulario Validado correctamente, enviando datos...")
	return true;


}
