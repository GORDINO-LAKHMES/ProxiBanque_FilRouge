package com.gor_lak.filRouge.ProxiBanque.presentation;

import java.util.Scanner;

import com.gor_lak.filRouge.ProxiBanque.metier.visa;
import com.gor_lak.filRouge.ProxiBanque.presentation.fenetre.FenetreConnexion;
import com.gor_lak.filRouge.ProxiBanque.service.IserviceAuditeur;
import com.gor_lak.filRouge.ProxiBanque.service.IserviceConseiller;
import com.gor_lak.filRouge.ProxiBanque.service.IserviceGerant;
import com.gor_lak.filRouge.ProxiBanque.service.ServiceAuditeur;
import com.gor_lak.filRouge.ProxiBanque.service.ServiceConsseiller;
import com.gor_lak.filRouge.ProxiBanque.service.ServiceGerant;



/**
 * 
 * @author kosseila
 *
 */
public class Lanceur {

	public static void main(String[] args) {
		
		FenetreConnexion f = new FenetreConnexion();
		
		f.setVisible(true);
	}

}
