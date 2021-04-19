package it.prova.ricercalibro.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.ricercalibro.model.Libro;

/**
 * Servlet implementation class ExecuteAddLibroServlet
 */
@WebServlet("/ExecuteAddLibroServlet")
public class ExecuteAddLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExecuteAddLibroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titoloParameter = request.getParameter("titoloInput");
		String genereParameter = request.getParameter("genereInput");
		String numeroPagineParameter = request.getParameter("numeroPagineInput");
		
		RequestDispatcher rd = null;
		
		if(titoloParameter != null && genereParameter != null && numeroPagineParameter != null && !titoloParameter.isEmpty()
				&& !genereParameter.isEmpty() && !numeroPagineParameter.isEmpty() && numeroPagineParameter.matches("[0-9]+")) {
			
			Libro temp = new Libro(titoloParameter,genereParameter, Integer.valueOf(numeroPagineParameter));
			
			ExecuteRicercaLibroServlet.addLibro(temp);
			
			rd = request.getRequestDispatcher("operazioneEffettuata.jsp");				
			
		} else
			rd = request.getRequestDispatcher("inputNonValido.jsp");
		
		rd.forward(request, response);
	}

}
