package com.proxiBanqueKM.dao;

import com.proxiBanqueKM.metier.Auditeur;
import com.proxiBanqueKM.metier.Client;
import com.proxiBanqueKM.metier.Compte;
import com.proxiBanqueKM.metier.Conseiller;
import com.proxiBanqueKM.metier.Gerant;

/**
 * 
 * @author kosseila
 *
 */
public interface Idao {
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
	public void lireCompteAuditeur (Auditeur a); 
	public void ajouterConseiller(Conseiller c);
	public void modifierConseiller(Gerant g);
	public void supprimerConseiller(Gerant g);

}
