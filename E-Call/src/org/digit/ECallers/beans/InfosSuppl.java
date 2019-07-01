package org.digit.ECallers.beans;

import java.io.Serializable;

public class InfosSuppl implements Serializable {
	
	private long idInfos;
	private String photoUser;
	private String dateNaiss;
	private String email;
	private String sexe;
	private User utilisateur;
	
	
	public long getIdInfos() {
		return idInfos;
	}
	public void setIdInfos(long idInfos) {
		this.idInfos = idInfos;
	}
	public String getPhotoUser() {
		return photoUser;
	}
	public void setPhotoUser(String photoUser) {
		this.photoUser = photoUser;
	}
	public String getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public User getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(User utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	

}
