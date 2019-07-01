package org.digit.ECallers.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Deconnexion extends HttpServlet {
	
	//public static final String VUE = "/Connexion";
	
	public static final String URL_REDIRECTION = "connexion.jsp";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* R�cup�ration et destruction de la session en cours */
        HttpSession session = request.getSession();
        session.invalidate();

        /* Affichage de la page de connexion */
        //this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        
        /* Redirection vers le Site du Z�ro ! */
        response.sendRedirect( URL_REDIRECTION );
    }

}
