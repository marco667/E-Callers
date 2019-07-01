package org.digit.ECallers.dao;

import org.digit.ECallers.beans.Contact;
import org.digit.ECallers.beans.InfosSuppl;
import org.digit.ECallers.beans.User;

public interface UserDao {
	
	void create( User utilisateur ) throws DAOException;
	void createContact(String nomContact, String prenomContact, String numcontact) throws DAOException;
	void addInfosByuser(InfosSuppl infosUser) throws DAOException;

    User search( String username, String num_tel ) throws DAOException;
    
    Contact searchContact( String telContact ) throws DAOException;
    
}
