package com.proxiBanqueKM.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author kosseila
 *
 */
public class Agence {
private int idAgence;
private String adresse;
private int tel;
private List<Employe> employes =new ArrayList<Employe>();


public List<Employe> getEmployes() {
	return employes;
}
public void setEmployes(List<Employe> employes) {
	this.employes = employes;
}
public int getIdAgence() {
	return idAgence;
}
public void setIdAgence(int idAgence) {
	this.idAgence = idAgence;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getTel() {
	return tel;
}
public void setTel(int tel) {
	this.tel = tel;
}
public List<Employe> ajouterEmploye(Employe E){
	employes.add(E);
	return employes;
}

}

