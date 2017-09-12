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
public class Dao implements Idao {

	@Override
	public void ajouterClient(Client c) {
		// TODO Auto-generated method stub
		System.out.println("j'ai ajout� un client");
	}

	@Override
	public void seConnecter(String login, String mdp) {
		// TODO Auto-generated method stub
		System.out.println("je suis connect�");
	}

	@Override
	public void creerCompte(Compte c) {
		// TODO Auto-generated method stub
		System.out.println("j'ai cree un compte");
	}

	@Override
	public void modifierCompte(Compte c) {
		// TODO Auto-generated method stub
		System.out.println("je modifie le compte");
	}

	@Override
	public void supprimerCompte(Compte c) {
		// TODO Auto-generated method stub
		System.out.println("je supprime le compte");
	}

	@Override
	public void lireCompte(Client cl1) {
		// TODO Auto-generated method stub
		System.out.println("je regarde les transactions au niveau de ton compte");
	}

	@Override
	public void simulationCompte(Client c) {
		// TODO Auto-generated method stub
		System.out.println("je fais une simulation");
	}

	@Override
	public void virserment(Compte c1, Compte c2) {
		// TODO Auto-generated method stub
		System.out.println(" je fais un virement");
	}

	@Override
	public void patrimoineCompte(Client c) {
		// TODO Auto-generated method stub
		System.out.println(" gestion de ton patrimoine");
	}

	@Override
	public void attribuerClient(Client c) {
		// TODO Auto-generated method stub
		System.out.println("j'attribue les clients pour chaque conseiller");
	}

	@Override
	public void lireCompteAuditeur (Auditeur a) {
	
		// TODO Auto-generated method stub
		System.out.println("j'analyse les comptes des clients");
	}

	@Override
	public void ajouterConseiller(Conseiller c) {
		// TODO Auto-generated method stub
		System.out.println("j'ajoute des conseillers a la liste");
	}

	@Override
	public void modifierConseiller(Gerant g) {
		// TODO Auto-generated method stub
		System.out.println("je modifie les informations des conseillers");
	}

	@Override
	public void supprimerConseiller(Gerant g) {
		// TODO Auto-generated method stub
		System.out.println("je supprime les donn�es de notre conseiller qui est parti a la retraite");

	}

}
