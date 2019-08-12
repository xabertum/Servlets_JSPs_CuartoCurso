package cuartoCurso.lecture04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ManejoFormulariosHTML
 */
@WebServlet(description = "Lecture04.ManejoFormularios", urlPatterns = { "/ManejoFormulariosHTML" })
public class ManejoFormulariosHTML extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManejoFormulariosHTML() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		String[] tecnologias = request.getParameterValues("tecnologia");
		String genero = request.getParameter("genero");
		String ocupacion = request.getParameter("ocupacion");
		String[] musicaStrings = request.getParameterValues("musica");
		String comentario = request.getParameter("comentarios");

		response.getWriter().append("El usuario es: " + usuario + "\n");
		response.getWriter().append("El password es: " + password + "\n");
		PrintWriter outPrintWriter = response.getWriter();

		for (String tecnologia : tecnologias) {
			outPrintWriter.append(tecnologia);
			outPrintWriter.append("/");
		}

		response.getWriter().write("\n");
		
		response.getWriter().append("El genero seleccionado es: " + genero + "\n");
		response.getWriter().append("La ocupacion seleccionada es: " + ocupacion + "\n");

		for (String musica : musicaStrings) {
			response.getWriter().append(musica);
			response.getWriter().append("/");
		}

		response.getWriter().append("\n");
		
		response.getWriter().append("El comentario es: " + comentario + "\n");

	}

}
