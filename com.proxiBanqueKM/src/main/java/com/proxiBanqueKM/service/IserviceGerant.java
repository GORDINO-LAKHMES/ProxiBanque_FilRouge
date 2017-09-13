package com.proxiBanqueKM.service;

import com.proxiBanqueKM.metier.Conseiller;
import com.proxiBanqueKM.metier.Gerant;

public interface IserviceGerant extends IserviceConseiller {

	public void ajouterConseiller(Conseiller c);
	public void modifierConseiller(Gerant g);
	public void supprimerConseiller(Gerant g);


	
}
