package com.proxiBanqueKM.metier;
/**
 * 
 * @author kosseila
 *
 */
public class Carte {


private Compte monCompte;
private int numCarte;

public int getNumCarte() {
	return numCarte;
}

public void setNumCarte(int numCarte) {
	this.numCarte = numCarte;
}

public Compte getMonCompte() {
	return monCompte;
}

public void setMonCompte(Compte monCompte) {
	this.monCompte = monCompte;
}
}
