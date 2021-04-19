package it.prova.ricercalibro.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import it.prova.ricercalibro.model.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExecuteRicercaLibroServlet
 */
@WebServlet("/ExecuteRicercaLibroServlet")
public class ExecuteRicercaLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static List<Libro> libri = new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExecuteRicercaLibroServlet() {
        super();
        riempiListaLibri();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
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
						
			if(ricercaInListaLibri(temp)) {
				rd = request.getRequestDispatcher("libroPresente.jsp");
				request.setAttribute("esito_attribute", temp);
			} else {
				rd =  request.getRequestDispatcher("libroNonPresente.jsp");
			}
				
			
		} else
			rd = request.getRequestDispatcher("inputNonValido.jsp");
		
		rd.forward(request, response);
	}
	
	public static List<Libro> getLibri() {
		return libri;
	}


	public boolean ricercaInListaLibri(Libro libroInput) {
		for(Libro libroItem: libri) {
			if(libroItem.equals(libroInput))
				return true;
		}
		
		return false;
	}
	
	private static void riempiListaLibri() {
		libri.add(new Libro("titolo","genere",123));
		libri.add(new Libro("titolo1","genere1",223));
		libri.add(new Libro("titolo2","genere2",133));
		libri.add(new Libro("titolo3","genere3",423));		
	}
	
	public static void addLibro(Libro libroItem) {
		libri.add(libroItem);
	}

}
