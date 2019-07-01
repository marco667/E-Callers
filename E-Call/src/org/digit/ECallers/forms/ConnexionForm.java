/**
 * 
 */
package org.digit.ECallers.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.digit.ECallers.beans.User;
import org.digit.ECallers.dao.DAOException;
import org.digit.ECallers.dao.UserDao;

/**
 * @author MALKO
 *
 */
public class ConnexionForm {
	
	private static final String CHAMP_USERNAME = "username";
	private static final String CHAMP_TEL = "num_tel";
	

	private String resultat;
	private Map<String, String> erreurs = new HashMap<String, String>();
	
	private UserDao      utilisateurDao;

	public ConnexionForm( UserDao utilisateurDao ) {
	    this.utilisateurDao = utilisateurDao;
	}

	public String getResultat() {
	    return resultat;
	}

	public Map<String, String> getErreurs() {
	    return erreurs;
	}
	

	public User connexionUtilisateur( HttpServletRequest request ) {
		
		String nom = getValeurChamp( request, CHAMP_USERNAME );
	    String tel = getValeurChamp( request, CHAMP_TEL );
	    
	    User utilisateur = null;

	    try {
	    	traiterNom( nom );
	        traiterTelephone( tel );

	        if ( erreurs.isEmpty() ) {
	        	
	        	try {
	        	utilisateur = utilisateurDao.search( nom, tel );
	        	resultat = "Succes de connexion.";
	        	}catch(DAOException e) {
	        		resultat = "Utilisateur inconnu";
	        	}
	        	
	        } else {
	            resultat = "Echec de connexion.";
	        }
	    } catch ( DAOException e ) {
	        resultat = "Echec de connexion : une erreur imprevue est survenue, merci de reessayer dans quelques instants.";
	        e.printStackTrace();
	    }
	    
	    return  utilisateur;

	}
	
		
	
		private void traiterNom( String nom ) {
	        try {
	            validationNom( nom );
	        } catch ( FormValidationException e ) {
	            setErreur( CHAMP_USERNAME, e.getMessage() );
	        }
	        
	    }
	
	
	    private void traiterTelephone( String telephone ) {
	        try {
	            validationTel( telephone );
	        } catch ( FormValidationException e ) {
	            setErreur( CHAMP_TEL, e.getMessage() );
	        }
	   
	    }

	    private void validationNom( String nom ) throws FormValidationException {
	        if ( nom != null ) {
	            if ( nom.length() < 2 ) {
	                throw new FormValidationException( "Le nom d'utilisateur doit contenir au moins 2 caractères." );
	            }
	        } else {
	            throw new FormValidationException( "Merci d'entrer votre nom d'utilisateur." );
	        }
	    }
	    
		private void validationTel( String telephone ) throws FormValidationException {
	        if ( telephone != null ) {
	            if ( !telephone.matches( "^\\d+$" ) ) {
	                throw new FormValidationException( "Le numéro de téléphone doit uniquement contenir des chiffres." );
	            } else if ( telephone.trim().length() < 9 || telephone.trim().length() > 9 ) {
	                throw new FormValidationException( "Le numero de telephone doit contenir 9 chiffres." );
	            }
	        } else {
	            throw new FormValidationException( "Merci d'entrer un numero de telephone." );
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
