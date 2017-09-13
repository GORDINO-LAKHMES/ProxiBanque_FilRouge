package com.gor_lak.filRouge.ProxiBanque.service;

import com.gor_lak.filRouge.ProxiBanque.metier.Auditeur;

public interface IserviceAuditeur {
	public void lireCompteAuditeur (Auditeur a); 
	public void seConnecterAuditeur (String login1, String mdp1);
}
