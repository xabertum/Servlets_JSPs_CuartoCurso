package cuartoCurso.lecture10.ManejoCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesServlet
 */
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CookiesServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Suponemos que el usuario está visitando por primera vez nuestro sitio
		boolean nuevoUsuario = true;

		// Obtenemos todas las cookies
		Cookie[] cookies = request.getCookies();

		// Buscamos si ya existe una cookie creada con anterioridad llamada
		// visitanteRecurrente
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("visitanteRecurrente") && cookie.getValue().equals("si")) {
					// En caso de ya exista una cookie indicando que ya existe un usuario registrado
					// con anterioridad, ponemos la bandera en falso y salimos del ciclo
					nuevoUsuario = false;
					break;
				}
			}
		}

		// Revisamos si el el usuario es nuevo visitante
		String mensajeString = null;
		if (nuevoUsuario) {
			// En caso de ser un usuario nuevo creamos el objeto cookie
			Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
			// Agregamos la cookie en la respuesta
			response.addCookie(visitanteCookie);
			mensajeString = "Gracias por visitar nuestro sitio";

		} else {
			mensajeString = "Gracias por visitar NUEVAMENTE nuestro sitio";
		}

		// Escribimos la salida
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.print("Mensaje: " + mensajeString);
	}

}
