package com.gor_lak.filRouge.ProxiBanque.metier;
/**
 * 
 * @author kosseila
 *
 */
public class Compte {
private int solde;
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
