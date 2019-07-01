package org.digit.ECallers.beans;

import java.io.Serializable;

public class Contact  implements Serializable{
	
	private long id_contact;
	private String nomContact;
	private String prenomContact; 
	private String numcontact;
	
	
	public long getId_contact() {
		return id_contact;
	}
	public void setId_contact(long id_contact) {
		this.id_contact = id_contact;
	}
	public String getNomContact() {
		return nomContact;
	}
	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	}
	public String getNumcontact() {
		return numcontact;
	}
	public void setNumcontact(String numcontact) {
		this.numcontact = numcontact;
	}
	public String getPrenomContact() {
		return prenomContact;
	}
	public void setPrenomContact(String prenomContact) {
		this.prenomContact = prenomContact;
	}
	
	
}
