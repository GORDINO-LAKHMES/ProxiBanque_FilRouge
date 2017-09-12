package com.gor_lak.filRouge.ProxiBanque.dao;

import com.gor_lak.filRouge.ProxiBanque.metier.Auditeur;
import com.gor_lak.filRouge.ProxiBanque.metier.Client;
import com.gor_lak.filRouge.ProxiBanque.metier.Compte;
import com.gor_lak.filRouge.ProxiBanque.metier.Conseiller;
import com.gor_lak.filRouge.ProxiBanque.metier.Gerant;

/**
 * 
 * @author kosseila
 *
 */
public interface Idao {
	public void ajouterClient(Client cl);
	public void seConnecter (String login, String mdp);
	public void creerCompte(Compte c);
	public void modifierCompte(Compte c);
	public void supprimerCompte(Compte c);
	public void lireCompte (Client cl1); 
	public void simulationCompte(Client c);
	public void virserment (Compte c1, Compte c2);
	public void patrimoineCompte(Client c);
	public void attribuerClient(Client c);
	public void lireCompteAuditeur (Auditeur a); 
	public void ajouterConseiller(Conseiller c);
	public void modifierConseiller(Gerant g);
	public void supprimerConseiller(Gerant g);

}
