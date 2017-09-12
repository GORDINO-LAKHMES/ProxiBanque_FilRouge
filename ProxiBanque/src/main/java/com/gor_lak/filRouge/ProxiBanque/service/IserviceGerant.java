package com.gor_lak.filRouge.ProxiBanque.service;

import com.gor_lak.filRouge.ProxiBanque.metier.Conseiller;
import com.gor_lak.filRouge.ProxiBanque.metier.Gerant;

public interface IserviceGerant extends IserviceConseiller {

	public void ajouterConseiller(Conseiller c);
	public void modifierConseiller(Gerant g);
	public void supprimerConseiller(Gerant g);


	
}
