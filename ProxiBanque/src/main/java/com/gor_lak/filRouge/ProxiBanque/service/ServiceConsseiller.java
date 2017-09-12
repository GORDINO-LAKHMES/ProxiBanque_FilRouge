package com.gor_lak.filRouge.ProxiBanque.service;

import com.gor_lak.filRouge.ProxiBanque.dao.Dao;
import com.gor_lak.filRouge.ProxiBanque.dao.Idao;
import com.gor_lak.filRouge.ProxiBanque.metier.Client;
import com.gor_lak.filRouge.ProxiBanque.metier.Compte;

public class ServiceConsseiller implements IserviceConseiller {

	private Idao dao= new Dao();// on d�clare l'interface (Idao) et on initialise avec
	//la classe qui implimente l'interface (Dao) mais dao c'est juste un nom qu'on donne
		
	@Override
	public void ajouterClient(Client cl) {
		// TODO Auto-generated method stub
		dao.ajouterClient(null);
	}

	@Override
	public void seConnecter(String login, String mdp) {
		// TODO Auto-generated method stub
		dao.seConnecter(null, null);
	}

	@Override
	public void creerCompte(Compte c) {
		// TODO Auto-generated method stub
		dao.creerCompte(null);
	}

	@Override
	public void modifierCompte(Compte c) {
		// TODO Auto-generated method stub
		dao.modifierCompte(null);
	}

	@Override
	public void supprimerCompte(Compte c) {
		// TODO Auto-generated method stub
		dao.supprimerCompte(null);
	}

	@Override
	public void lireCompte(Client cl1) {
		// TODO Auto-generated method stub
		dao.lireCompte(null);
	}

	@Override
	public void simulationCompte(Client c) {
		// TODO Auto-generated method stub
		dao.simulationCompte(null);
	}

	@Override
	public void virserment(Compte c1, Compte c2) {
		// TODO Auto-generated method stub
		dao.virserment(null, null);
	}

	@Override
	public void patrimoineCompte(Client c) {
		// TODO Auto-generated method stub
		dao.patrimoineCompte(null);
	}

	@Override
	public void attribuerClient(Client c) {
		// TODO Auto-generated method stub
		
	}

	
	

}
