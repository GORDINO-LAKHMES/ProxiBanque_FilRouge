package com.proxiBanqueKM.metier;
/**
 * 
 * @author kosseila
 *
 */
public class Compte {

private int idCompte;
private int solde;
private int dateOuverture;




public int getIdCompte() {
	return idCompte;
}
public void setIdCompte(int idCompte) {
	this.idCompte = idCompte;
}
public int getDateOuverture() {
	return dateOuverture;
}
public void setDateOuverture(int dateOuverture) {
	this.dateOuverture = dateOuverture;
}
private Client monClient;
private Carte maCarte;


public Carte getMaCarte() {
	return maCarte;
}
public void setMaCarte(Carte maCarte) {
	this.maCarte = maCarte;
}
public int getSolde() {
	return solde;
}
public void setSolde(int solde) {
	this.solde = solde;
}
public Client getMonClient() {
	return monClient;
}
public void setMonClient(Client monClient) {
	this.monClient = monClient;
}
}
