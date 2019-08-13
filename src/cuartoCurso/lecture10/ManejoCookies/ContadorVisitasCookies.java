package cuartoCurso.lecture10.ManejoCookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContadorVisitasCookies
 */
@WebServlet("/ContadorVisitasCookies")
public class ContadorVisitasCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContadorVisitasCookies() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Declaramos la variable contador
		int contador = 0;

		// Si existe anteriormente una cookie, obtenemos el contador de visitas actual
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("contadorVisitas")) {
					try {
						// Obtenemos el valor del contador visitas actual
						contador = Integer.parseInt(cookie.getValue());

					} catch (NumberFormatException e) {
						contador = 0;
					}
				}
			}
		}

		// incrementamos el contador de visitas
		// y lo agregamos a la cookie en la respuesta
		contador++;
		Cookie cookie = new Cookie("contadorVisitas", Integer.toString(contador));

		// La cookie se almacenará en el cliente por 1 hora
		cookie.setMaxAge(3600);
		response.addCookie(cookie);

		// Mandamos el mensaje al navegador
		response.getWriter().print("Contador de visitas de cada cliente: " + contador);
	}

}
