package org.digit.ECallers.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.digit.ECallers.beans.Contact;
import org.digit.ECallers.dao.DAOException;
import org.digit.ECallers.dao.UserDao;

public class SearchContactForm {
	
	private static final String CHAMP_TEL = "num_tel";
	
	

	private String resultat;
	private Map<String, String> erreurs = new HashMap<String, String>();
	
	private UserDao      utilisateurDao;

	public SearchContactForm( UserDao utilisateurDao ) {
	    this.utilisateurDao = utilisateurDao;
	}

	public String getResultat() {
	    return resultat;
	}

	public Map<String, String> getErreurs() {
	    return erreurs;
	}
	

	public Contact searchContactByUser( HttpServletRequest request ) {
		
	    String tel = getValeurChamp( request, CHAMP_TEL );
	    
	    Contact contact = null;

	    try {
	    	
	        traiterTelephone( tel );

	        if ( erreurs.isEmpty() ) {
	            contact = utilisateurDao.searchContact( tel );
	            resultat = "Succes de connexion.";
	        } else {
	            resultat = "Échec de connexion.";
	        }
	    } catch ( DAOException e ) {
	        resultat = "Échec de connexion : une erreur imprévue est survenue, merci de réessayer dans quelques instants.";
	        e.printStackTrace();
	    }
	    
	    return contact;
	}
	
	
	    private void traiterTelephone( String telephone ) {
	        try {
	            validationTel( telephone );
	        } catch ( FormValidationException e ) {
	            setErreur( CHAMP_TEL, e.getMessage() );
	        }
	    }
	    
		private void validationTel( String telephone ) throws FormValidationException {
	        if ( telephone != null ) {
	            if ( !telephone.matches( "^\\d+$" ) ) {
	                throw new FormValidationException( "Le numéro de téléphone doit uniquement contenir des chiffres." );
	            } else if ( telephone.trim().length() < 9 && telephone.trim().length() > 9 ) {
	                throw new FormValidationException( "Le numéro de téléphone doit contenir 9 chiffres." );
	            }
	        } else {
	            throw new FormValidationException( "Merci d'entrer un numéro de téléphone." );
	        }
	    }

	/*
	 * Ajoute un message correspondant au champ spécifié à la map des erreurs.
	 */
	private void setErreur( String champ, String message ) {
	    erreurs.put( champ, message );
	}

	/*
	 * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
	 * sinon.
	 */
	private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
	    String valeur = request.getParameter( nomChamp );
	    if ( valeur == null || valeur.trim().length() == 0 ) {
	        return null;
	    } else {
	        return valeur.trim();
	    }
	}
	
}
