package com.gor_lak.filRouge.ProxiBanque.service;

import com.gor_lak.filRouge.ProxiBanque.metier.Client;
import com.gor_lak.filRouge.ProxiBanque.metier.Compte;

public interface IserviceConseiller {
	public void ajouterClient(Client cl);
	public void seConnecter (String login1, String mdp1);
	public void creerCompte(Compte c);
	public void modifierCompte(Compte c);
	public void supprimerCompte(Compte c);
	public void lireCompte (Client cl1); 
	public void simulationCompte(Client c);
	public void virserment (Compte c1, Compte c2);
	public void patrimoineCompte(Client c);
	public void attribuerClient(Client c);
}
