package org.digit.ECallers.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;
import org.digit.ECallers.beans.Contact;
import org.digit.ECallers.dao.DAOFactory;
import org.digit.ECallers.dao.UserDao;
import org.digit.ECallers.forms.ConnexionForm;
import org.digit.ECallers.forms.SearchContactForm;

/**
 * Servlet implementation class SearchContact
 */
public class SearchContact extends HttpServlet {
	
	public static final String  ATT_USER                     = "utilisateur";
	public static final String ATT_SESSION_USER              = "sessionUtilisateur";
	public static final String CONF_DAO_FACTORY              = "daofactory";
	public static final String ATT_CONTACT                   = "contact";
    public static final String ATT_FORM                      = "form";
    public static final String VUE                           = "/WEB-INF/contact.jsp";

    private UserDao     utilisateurDao;

    public void init() throws ServletException {
        /* Récupération d'une instance de notre DAO Utilisateur */
        this.utilisateurDao = ( (DAOFactory) getServletContext().getAttribute( CONF_DAO_FACTORY ) ).getUtilisateurDao();
    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    	
        /* Affichage de la page d'inscription */
    	
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Préparation de l'objet formulaire */
        SearchContactForm form = new SearchContactForm( utilisateurDao );

        /* Traitement de la requête et récupération du bean en résultant */
        Contact contact = form.searchContactByUser(request);
        /* R�cup�ration de la session depuis la requ�te 
	    HttpSession session = request.getSession();*/

	    /*
	     if ( form.getErreurs().isEmpty() ) {
	        session.setAttribute( ATT_SESSION_USER, utilisateur );
	    } else {
	        session.setAttribute( ATT_SESSION_USER, null );
	    }
	     */
	    

        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_CONTACT, contact );

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

}
