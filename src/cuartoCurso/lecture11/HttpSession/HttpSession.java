package cuartoCurso.lecture11.HttpSession;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpSession
 */
@WebServlet("/HttpSession")
public class HttpSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HttpSession() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		javax.servlet.http.HttpSession session = request.getSession();
		String tituloString = null;

		// Pedimos el atributo y verficamos si existe
		Integer contadorVisitas = (Integer) session.getAttribute("contadorVisitas");

		// Si es igual a null, quiere decir que es la primera vez que se accede al
		// recurso
		if (contadorVisitas == null) {
			contadorVisitas = new Integer(1);
			tituloString = "Bienvenido por primera vez...";
		} else {
			// Si es distinto de nulo, incrementamos el contador
			tituloString = "Bienvenido Nuevamente";
			contadorVisitas++;
		}

		// En cualquier caso agregamos el valor del contador a la sesion
		session.setAttribute("contadorVisitas", contadorVisitas);

		// Mostramos los valores en el cliente
		response.getWriter().write("Titulo: " + tituloString + "\n");
		response.getWriter().append("Numero de accesos al recurso: " + contadorVisitas + "\n");
		response.getWriter().print("ID de la session: " + session.getId());

	}

}
