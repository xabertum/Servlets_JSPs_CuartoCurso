package cuartoCurso.lecture06;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletsHeaders
 */
@WebServlet("/ServletsHeaders")
public class ServletsHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletsHeaders() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		try {
			String metodoHttpString = request.getMethod();
			String uriString = request.getRequestURI();

			response.getWriter().append("El metodo HTTP es: " + metodoHttpString + "\n");
			response.getWriter().append("El URI solicitado es: " + uriString + "\n");
			response.getWriter().append("Host" + request.getHeader("Host") + "\n");
			response.getWriter().append("Navegador: " + request.getHeader("User-Agent") + "\n");

			Enumeration<?> cabecerosEnumeration = request.getHeaderNames();
			while (cabecerosEnumeration.hasMoreElements()) {
				String nombreCabecero = (String) cabecerosEnumeration.nextElement();
				response.getWriter().append("<b>" + nombreCabecero + "</b>" + "\n");
				response.getWriter().append(request.getHeader(nombreCabecero) + "\n");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
