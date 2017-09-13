package com.gor_lak.filRouge.ProxiBanque.service;

import com.gor_lak.filRouge.ProxiBanque.metier.Client;
import com.gor_lak.filRouge.ProxiBanque.metier.Compte;
import com.gor_lak.filRouge.ProxiBanque.metier.Conseiller;
import com.gor_lak.filRouge.ProxiBanque.metier.Courant;
import com.gor_lak.filRouge.ProxiBanque.metier.Employe;
import com.gor_lak.filRouge.ProxiBanque.metier.Entreprise;
import com.gor_lak.filRouge.ProxiBanque.metier.Epargne;
import com.gor_lak.filRouge.ProxiBanque.metier.Gerant;
import com.gor_lak.filRouge.ProxiBanque.metier.Particulier;

public class ServiceGerant implements IserviceGerant {

	@Override
	public void seConnecterConseiller(String login1, String mdp1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterConseiller(Conseiller c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierConseiller(Conseiller cn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerConseiller(Conseiller cn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterClient(Client cl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seConnecterClient(String login1, String mdp1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void patrimoineCompte(Client c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerClient(Client c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creerCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lireCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void simulationCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employe seConnecter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void lireEmploye(Employe em) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seConnecterParticulier(String login1, String mdp1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lireCompteParticulier(Particulier p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seConnecterEntreprise(String login1, String mdp1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lireCompteEntreprise(Entreprise e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void virsermentCompteCourant(Compte c1, Compte c2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lireCompteCourant(Courant cr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void virsermentCompteEpargne(Compte c1, Compte c2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lireCompteEpargne(Epargne ep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seConnecterGerant(String login1, int mdp1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierGerant(Gerant g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerGerant(Gerant g) {
		// TODO Auto-generated method stub
		
	}

	

}
