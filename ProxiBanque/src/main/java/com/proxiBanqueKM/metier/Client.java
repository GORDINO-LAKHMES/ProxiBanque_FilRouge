package com.proxiBanqueKM.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author kosseila
 *
 */
public class Client {
	private int idClient;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private int telephone;
	private Conseiller monConseiller;
	private List<Compte> comptes = new ArrayList<Compte>();
	
	
public int getIdClient() {
		return idClient;
	}
	public void setNumClient(int numClient) {
		this.idClient = numClient;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}




	public Conseiller getMonConseiller() {
		return monConseiller;
	}
	public void setMonConseiller(Conseiller monConseiller) {
		this.monConseiller = monConseiller;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
	public List<Compte> ajouterCompte(Compte Cm){
		comptes.add(Cm);
		return comptes;
	}




}
