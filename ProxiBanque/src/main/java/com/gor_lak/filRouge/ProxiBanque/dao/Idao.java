package com.gor_lak.filRouge.ProxiBanque.dao;

import com.gor_lak.filRouge.ProxiBanque.metier.Auditeur;
import com.gor_lak.filRouge.ProxiBanque.metier.Client;
import com.gor_lak.filRouge.ProxiBanque.metier.Compte;
import com.gor_lak.filRouge.ProxiBanque.metier.Conseiller;
import com.gor_lak.filRouge.ProxiBanque.metier.Courant;
import com.gor_lak.filRouge.ProxiBanque.metier.Employe;
import com.gor_lak.filRouge.ProxiBanque.metier.Entreprise;
import com.gor_lak.filRouge.ProxiBanque.metier.Epargne;
import com.gor_lak.filRouge.ProxiBanque.metier.Gerant;
import com.gor_lak.filRouge.ProxiBanque.metier.Particulier;

/**
 * 
 * @author kosseila
 *
 */
public interface Idao {

	// Gerant
	public void seConnecterGerant (String login1, int mdp1);
	public void modifierGerant(Gerant g);
	public void supprimerGerant(Gerant g);
	
	//Conseiller
	public void seConnecterConseiller(String login1, String mdp1);
	public void ajouterConseiller(Conseiller c);
	public void modifierConseiller(Conseiller cn);
	public void supprimerConseiller(Conseiller cn);
	
	//Client
	public void ajouterClient(Client cl);
	public void seConnecterClient (String login1, String mdp1);
	public void patrimoineCompte(Client c);
	public void attribuerClient(Client c);
	
	//Compte
	public void creerCompte(Compte c);
	public void modifierCompte(Compte c);
	public void supprimerCompte(Compte c);
	public void lireCompte (Compte c); 
	public void simulationCompte(Compte c);
	//Employe
	public Employe seConnecter(String identifiant, int motDePasse);
	public void lireEmploye (Employe em); 
	//public boolean authentification (String login1 ,String motDePasse);
	//Particulier
	public void seConnecterParticulier (String login1, String mdp1);
	public void lireCompteParticulier (Particulier p); 
	//Carte
	
	//Auditeur
		public void seConnecterAuditeur (String login1, String mdp1);
		public void lireCompteAuditeur (Auditeur a); 
	//Entreprise
	public void seConnecterEntreprise (String login1, String mdp1);
	public void lireCompteEntreprise (Entreprise e); 
	
	//Courant
	public void virsermentCompteCourant (Compte c1, Compte c2);
	public void lireCompteCourant (Courant cr); 
	
	//Epargne
	public void virsermentCompteEpargne (Compte c1, Compte c2);
	public void lireCompteEpargne (Epargne ep); 
}
