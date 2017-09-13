package com.gor_lak.filRouge.ProxiBanque.metier;
/**
 * 
 * @author kosseila
 *
 */
public class Employe {
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private int login;
	private int tel;
	private String adresse;
	private Agence monAgence;
	
	
	public Agence getMonAgence() {
		return monAgence;
	}
	public void setMonAgence(Agence monAgence) {
		this.monAgence = monAgence;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public Employe() {
		super();
	}

}
