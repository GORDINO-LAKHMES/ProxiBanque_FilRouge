package com.gor_lak.filRouge.ProxiBanque.service;

import com.gor_lak.filRouge.ProxiBanque.dao.Dao;
import com.gor_lak.filRouge.ProxiBanque.dao.Idao;
import com.gor_lak.filRouge.ProxiBanque.metier.Auditeur;

public class ServiceAuditeur implements IserviceAuditeur {

	private Idao dao= new Dao();// on d�clare l'interface (Idao) et on initialise avec
	//la classe qui implimente l'interface (Dao) mais dao c'est juste un nom qu'on donne

	@Override
	public void lireCompteAuditeur(Auditeur a) {
		// TODO Auto-generated method stub
		dao.lireCompteAuditeur(null);
	}
	
	
	

}
