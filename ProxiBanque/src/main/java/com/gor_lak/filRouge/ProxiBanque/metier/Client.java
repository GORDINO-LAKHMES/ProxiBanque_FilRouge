package com.gor_lak.filRouge.ProxiBanque.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author kosseila
 *
 */
public class Client {
private Conseiller monConseiller;
private List<Compte> comptes = new ArrayList<Compte>();


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
