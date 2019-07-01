package org.digit.ECallers.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.digit.ECallers.beans.User;
import org.digit.ECallers.dao.DAOException;
import org.digit.ECallers.dao.UserDao;


public final class InscriptionForms {
	
	private static final String CHAMP_USERNAME = "username";
	private static final String CHAMP_SURNAME = "surname";
	private static final String CHAMP_TEL = "num_tel";
	

	private String resultat;
	private Map<String, String> erreurs = new HashMap<String, String>();
	
	private UserDao      utilisateurDao;

	public InscriptionForms( UserDao utilisateurDao ) {
	    this.utilisateurDao = utilisateurDao;
	}

	public String getResultat() {
	    return resultat;
	}

	public Map<String, String> getErreurs() {
	    return erreurs;
	}
	

	public User inscrireUtilisateur( HttpServletRequest request ) {
	    String nom = getValeurChamp( request, CHAMP_USERNAME );
	    String prenom = getValeurChamp( request, CHAMP_SURNAME );
	    String tel = getValeurChamp( request, CHAMP_TEL );
	    

	    User utilisateur = new User();

	   
	    try {
	        traiterNom( nom, utilisateur );
	        traiterPrenom( prenom, utilisateur );
	        traiterTelephone( tel, utilisateur );

	        if ( erreurs.isEmpty() ) {
	            utilisateurDao.create( utilisateur );
	            utilisateurDao.createContact(nom, prenom, tel);
	            resultat = "Succes de l'inscription.";
	        } else {
	            resultat = "echec de l'inscription.";
	        }
	    } catch ( DAOException e ) {
	        resultat = "Echec de l'inscription : une erreur imprevue est survenue, merci de reessayer dans quelques instants.";
	        e.printStackTrace();
	    }


	    return utilisateur;
	}
	
	 private void traiterNom( String nom, User utilisateur ) {
	        try {
	            validationNom( nom );
	        } catch ( FormValidationException e ) {
	            setErreur( CHAMP_USERNAME, e.getMessage() );
	        }
	        utilisateur.setUsername( nom );
	    }

	    private void traiterPrenom( String prenom, User utilisateur ) {
	        try {
	            validationPrenom( prenom );
	        } catch ( FormValidationException e ) {
	            setErreur( CHAMP_SURNAME, e.getMessage() );
	        }
	        utilisateur.setSurname( prenom );
	    }
	    
	    private void traiterTelephone( String telephone, User utilisateur ) {
	        try {
	            validationTel( telephone );
	        } catch ( FormValidationException e ) {
	            setErreur( CHAMP_TEL, e.getMessage() );
	        }
	        utilisateur.setNum_tel( telephone );
	    }

	
	    private void validationNom( String nom ) throws FormValidationException {
	        if ( nom != null ) {
	            if ( nom.length() < 2 ) {
	                throw new FormValidationException( "Le nom d'utilisateur doit contenir au moins 2 caractères." );
	            }
	        } else {
	            throw new FormValidationException( "Merci d'entrer un nom d'utilisateur." );
	        }
	    }

	    private void validationPrenom( String prenom ) throws FormValidationException {
	        if ( prenom != null && prenom.length() < 2 ) {
	            throw new FormValidationException( "Le prenom d'utilisateur doit contenir au moins 2 caracteres." );
	        }
	    }
	
	private void validationTel( String telephone ) throws FormValidationException {
        if ( telephone != null ) {
            if ( !telephone.matches( "^\\d+$" ) ) {
                throw new FormValidationException( "Le numero de telephone doit uniquement contenir des chiffres." );
            } else if ( telephone.length() < 9 || telephone.length() > 9 ) {
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
