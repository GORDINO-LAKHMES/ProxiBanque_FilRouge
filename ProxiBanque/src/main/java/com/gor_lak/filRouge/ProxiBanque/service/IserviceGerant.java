package com.gor_lak.filRouge.ProxiBanque.service;


import com.gor_lak.filRouge.ProxiBanque.metier.Gerant;

public interface IserviceGerant extends IserviceConseiller {

	public void seConnecterGerant (String login1, int mdp1);
	public void modifierGerant(Gerant g);
	public void supprimerGerant(Gerant g);


	
}
