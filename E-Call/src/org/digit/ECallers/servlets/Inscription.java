package org.digit.ECallers.servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.digit.ECallers.beans.User;
import org.digit.ECallers.dao.UserDao;
import org.digit.ECallers.dao.DAOFactory;
import org.digit.ECallers.forms.InscriptionForms;

import com.sun.javafx.collections.MappingChange.Map;

/**
 * Servlet implementation class Inscription
 */

public class Inscription extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public static final String CONF_DAO_FACTORY = "daofactory";
    public static final String ATT_USER         = "utilisateur";
    public static final String ATT_FORM         = "form";
    public static final String VUE              = "/inscription.jsp";
    
    public static final String SESSION_USER  = "utilisateur";
    public static final String CHEMIN           = "chemin";
    

    private UserDao     utilisateurDao;

    public void init() throws ServletException {
        /* RÃ©cupÃ©ration d'une instance de notre DAO Utilisateur */
        this.utilisateurDao = ( (DAOFactory) getServletContext().getAttribute( CONF_DAO_FACTORY ) ).getUtilisateurDao();
    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Affichage de la page d'inscription */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    	  /* Préparation de l'objet formulaire */
        InscriptionForms form = new InscriptionForms(utilisateurDao);
		
        /* Appel au traitement et à la validation de la requête, et récupération du bean en résultant */
        User utilisateur = form.inscrireUtilisateur( request );
		
        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_USER, utilisateur );
		
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        
        
    }

}
