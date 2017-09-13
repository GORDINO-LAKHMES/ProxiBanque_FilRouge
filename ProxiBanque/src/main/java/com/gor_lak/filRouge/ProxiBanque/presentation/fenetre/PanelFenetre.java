package com.gor_lak.filRouge.ProxiBanque.presentation.fenetre;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.gor_lak.filRouge.ProxiBanque.metier.Client;
import com.gor_lak.filRouge.ProxiBanque.metier.Compte;
import com.gor_lak.filRouge.ProxiBanque.metier.Employe;

public class PanelFenetre extends JFrame{

	
	private static JPanel conteneurAuditComptes = new JPanel(); 
	private static JPanel conteneurAjoutConseiller = new JPanel(); 
	private static JPanel conteneurModConseiller = new JPanel(); 
	private static JPanel conteneurSuppConseiller = new JPanel(); 
	private static JPanel conteneurAjoutClient = new JPanel(); 
	private static JPanel conteneurModClient = new JPanel(); 
	private static JPanel conteneurSuppClient = new JPanel(); 
	private static JPanel conteneurCreerCompte = new JPanel();
	private static JPanel conteneurModCompte = new JPanel();
	private static JPanel conteneurSuppCompte = new JPanel();
	private static JPanel conteneurVirement = new JPanel();
	private static JPanel conteneurAjoutCB = new JPanel();
	private static JPanel conteneurModCB = new JPanel();
	private static JPanel conteneurSuppCB = new JPanel();
	
	private static JComboBox<Employe> comboConseillersMod = new JComboBox<Employe>();
	private static JComboBox<Employe> comboConseillersSupp = new JComboBox<Employe>();
	private static JComboBox<Client> comboClientsMod = new JComboBox<Client>();
	private static JComboBox<Client> comboClientsSupp = new JComboBox<Client>();
	private static JComboBox<Client> comboClientsCreerCompte = new JComboBox<Client>();
	private static JComboBox<Client> comboClientsModCompte = new JComboBox<Client>();
	private static JComboBox<Client> comboClientSuppCompte = new JComboBox<Client>();
	private static JComboBox<Client> comboClientsAjoutCB = new JComboBox<Client>();
	private static JComboBox<Client> comboClientsModCB = new JComboBox<Client>();
	private static JComboBox<Client> comboClientsSuppCB = new JComboBox<Client>();
	private static JComboBox<Compte> comboComptesMod = new JComboBox<Compte>();
	private static JComboBox<Compte> comboComptesSupp = new JComboBox<Compte>();
	private static JComboBox<Compte> comboComptesAjoutCB = new JComboBox<Compte>();
	private static JComboBox<Compte> comboComptesModCB = new JComboBox<Compte>();
	private static JComboBox<Compte> comboComptesSuppCB = new JComboBox<Compte>();
	
	
	public static JPanel AuditComptes() {
		
		return conteneurAuditComptes;	
	};
	
	public static JPanel AjoutConseiller() {
		
		return conteneurAjoutConseiller;	
	};
	
	public static JPanel ModConseiller() {
		
		conteneurModConseiller.add(comboConseillersMod);
		return conteneurModConseiller;	
	};
	
	public static JPanel SuppConseiller() {
		
		conteneurSuppConseiller.add(comboConseillersSupp);
		return conteneurSuppConseiller;	
	};
	
	public static JPanel AjoutClient() {
		
		return conteneurAjoutClient;	
	};
	
	public static JPanel ModClient() {
		
		conteneurModClient.add(comboClientsMod);
		return conteneurModClient;	
	};
	
	public static JPanel SuppClient() {
		
		conteneurSuppClient.add(comboClientsSupp);
		return conteneurSuppClient;	
	};
	
	public static JPanel CreerCompte() {
		
		conteneurCreerCompte.add(comboClientsCreerCompte);
		
		return conteneurCreerCompte;	
	};
	
	public static JPanel ModCompte() {
		
		
		conteneurModCompte.add(comboClientsModCompte);
		conteneurModCompte.add(comboComptesMod);
		
		return conteneurModCompte;	
	};
	
	public static JPanel SuppCompte() {
		
		
		conteneurSuppCompte.add(comboClientSuppCompte);
		conteneurSuppCompte.add(comboComptesSupp);
		
		return conteneurSuppCompte;	
	};
	
	public static JPanel Virement() {
		
		return conteneurVirement;	
	};
	
	public static JPanel AjoutCB() {
			
		conteneurAjoutCB.add(comboClientsAjoutCB);
		conteneurAjoutCB.add(comboComptesAjoutCB);
		return conteneurAjoutCB;	
	};
	
	public static JPanel ModCB() {
		
		conteneurModCB.add(comboClientsModCB);
		conteneurModCB.add(comboComptesModCB);
		return conteneurModCB;	
	};
	
	public static JPanel SuppCB() {
		
		conteneurSuppCB.add(comboClientsSuppCB);
		conteneurSuppCB.add(comboComptesSuppCB);
		return conteneurSuppCB;	
	};
	
}
