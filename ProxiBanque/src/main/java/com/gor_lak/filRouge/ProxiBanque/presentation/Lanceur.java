package com.gor_lak.filRouge.ProxiBanque.presentation;

import java.util.Scanner;

import com.gor_lak.filRouge.ProxiBanque.metier.visa;
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
		// TODO Auto-generated method stub
		
		Scanner clavier= new Scanner(System.in);
		//Object visaP=visa.visaP; Object visaE=visa.visaE;
		Object Carte[]= {visa.visaP, visa.visaE};
		
		System.out.println("Veillez saisir 0 pour choisir la VisaE et 1 pour la VisaP");
		int n= clavier.nextInt();
		System.out.println("\nVous avez choisi la cate "+ "[ "+Carte[n]+" ]");
		
		System.out.println("\n\n=================================================Auditeur======================================================1");
		
		IserviceAuditeur isa= new ServiceAuditeur();
		isa.lireCompteAuditeur (null);
		
		System.out.println("=================================================Gerant=========================================================3\n");
		IserviceGerant isg=new ServiceGerant();
		
		isg.seConnecter(null, null);
		isg.ajouterClient(null);
		isg.attribuerClient(null);
		isg.creerCompte(null);
		isg.lireCompte(null);
		isg.modifierCompte(null);
		isg.simulationCompte(null);
		isg.patrimoineCompte(null);
		isg.virserment(null,null);
		isg.supprimerCompte(null);
		isg.ajouterConseiller(null);
		isg.modifierConseiller(null);
		isg.supprimerConseiller(null);
		System.out.println("=================================================Conseiller====================================================2\n");
		IserviceConseiller isc= new ServiceConsseiller();
		
		isc.seConnecter(null, null);
		isc.ajouterClient(null);
		isc.attribuerClient(null);
		isc.creerCompte(null);
		isc.lireCompte(null);
		isc.modifierCompte(null);
		isc.simulationCompte(null);
		isc.patrimoineCompte(null);
		isc.virserment(null, null);
		isc.supprimerCompte(null);
		
	}

}
