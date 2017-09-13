package com.gor_lak.filRouge.ProxiBanque.metier;
/**
 * 
 * @author kosseila
 *
 */
import java.util.ArrayList;
import java.util.List;

public class Gerant extends Employe {
	private int idGerant;
	private List<Conseiller> conseillers =new ArrayList<Conseiller>();

	public List<Conseiller> getConseillers() {
		return conseillers;
	}

	public int getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(int idGerant) {
		this.idGerant = idGerant;
	}

	public void setConseillers(List<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}
	
	public List<Conseiller> ajouterConseiller(Conseiller Cn){
		conseillers.add(Cn);
		return conseillers;
	}
}
