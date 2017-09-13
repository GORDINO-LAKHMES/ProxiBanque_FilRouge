package com.proxiBanqueKM.metier;
/**
 * 
 * @author kosseila
 *
 */
import java.util.ArrayList;
import java.util.List;

public class Gerant extends Employe {
	private List<Conseiller> conseillers =new ArrayList<Conseiller>();

	public List<Conseiller> getConseillers() {
		return conseillers;
	}

	public void setConseillers(List<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}
	
	public List<Conseiller> ajouterConseiller(Conseiller Cn){
		conseillers.add(Cn);
		return conseillers;
	}
}
