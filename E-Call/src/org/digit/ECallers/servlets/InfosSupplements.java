package org.digit.ECallers.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.digit.ECallers.beans.InfosSuppl;
import org.digit.ECallers.beans.User;
import org.digit.ECallers.dao.DAOFactory;
import org.digit.ECallers.dao.UserDao;
import org.digit.ECallers.forms.InfosSupplementsForm;
import org.digit.ECallers.forms.InscriptionForms;

/**
 * Servlet implementation class InfosSupplements
 */

public class InfosSupplements extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static final String CHEMIN = "chemin"; 

	public static final String CONF_DAO_FACTORY = "daofactory";
    public static final String ATT_USER         = "utilisateur";
    public static final String ATT_FORM         = "form";
    public static final String VUE              = "/WEB-INF/formulaire.jsp";
    
     

    private UserDao     utilisateurDao;

    public void init() throws ServletException {
        /* RÃ©cupÃ©ration d'une instance de notre DAO Utilisateur */
        this.utilisateurDao = ( (DAOFactory) getServletContext().getAttribute( CONF_DAO_FACTORY ) ).getUtilisateurDao();
    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    	/* Récupération de la session depuis la requête */
		HttpSession session = request.getSession();
        /* Affichage de la page */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    	/*
         * Lecture du paramètre 'chemin' passé à la servlet via la déclaration
         * dans le web.xml
         */
        String chemin = this.getServletConfig().getInitParameter( CHEMIN );
    	
        /* PrÃ©paration de l'objet formulaire */
    	InfosSupplementsForm form = new InfosSupplementsForm( utilisateurDao );

        /* Traitement de la requÃªte et rÃ©cupÃ©ration du bean en rÃ©sultant */
        InfosSuppl infosUser = form.InfosSupplements( request, chemin );

        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_USER, infosUser );

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

}
