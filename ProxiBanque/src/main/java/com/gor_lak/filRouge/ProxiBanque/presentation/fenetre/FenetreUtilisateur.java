package com.gor_lak.filRouge.ProxiBanque.presentation.fenetre;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.gor_lak.filRouge.ProxiBanque.metier.Client;
import com.gor_lak.filRouge.ProxiBanque.metier.Compte;
import com.gor_lak.filRouge.ProxiBanque.metier.Employe;

public class FenetreUtilisateur extends JFrame {

	private static JPanel conteneurFenetre = new JPanel();
	
	private static JTabbedPane tabbedGerant = new JTabbedPane();
	private static JTabbedPane tabbedConseiller = new JTabbedPane();
	private static JTabbedPane tabbedAudit = new JTabbedPane();
	private static JTabbedPane tabbedGestionConseiller = new JTabbedPane();
	private static JTabbedPane tabbedGestionClient = new JTabbedPane();	
	private static JTabbedPane tabbedGestionCompte = new JTabbedPane();	
	private static JTabbedPane tabbedOperationsBanquaire = new JTabbedPane(); 
	
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
	
	private static JComboBox<Employe> comboConseillers = new JComboBox<Employe>();
	private static JComboBox<Client> comboClients = new JComboBox<Client>();
	private static JComboBox<Compte> comboComptes = new JComboBox<Compte>();
	
	private static JButton boutonValider = new JButton("Valider");
	private static JButton boutonAnnuler = new JButton("Annuler");

	
	
	
	public FenetreUtilisateur(int id)
	{
		setSize(800,150);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		conteneurFenetre.setLayout(new BoxLayout(conteneurFenetre, BoxLayout.LINE_AXIS));

		conteneurModConseiller.add(comboConseillers);
		conteneurSuppConseiller.add(comboConseillers);
		
		tabbedGestionConseiller.add("Ajouter un conseiller",conteneurAjoutConseiller);
		tabbedGestionConseiller.add("Modifier un conseiller",conteneurModConseiller);
		tabbedGestionConseiller.add("Supprimer un conseiller",conteneurSuppConseiller);
		
		conteneurCreerCompte.add(comboClients);
		conteneurModCompte.add(comboClients);
		conteneurSuppCompte.add(comboClients);
		conteneurAjoutCB.add(comboClients);
		conteneurModCB.add(comboClients);
		conteneurSuppCB.add(comboClients);
		conteneurModCompte.add(comboComptes);
		conteneurSuppCompte.add(comboComptes);
		conteneurAjoutCB.add(comboComptes);
		conteneurModCB.add(comboComptes);
		conteneurSuppCB.add(comboComptes);
		
		tabbedGestionCompte.add("Créer un compte",conteneurCreerCompte);
		tabbedGestionCompte.add("Modifier un compte",conteneurModCompte);
		tabbedGestionCompte.add("Cloturer un compte",conteneurSuppCompte);
		tabbedGestionCompte.add("Associer une CB",conteneurAjoutCB);
		tabbedGestionCompte.add("Modifier une CB",conteneurModCB);
		tabbedGestionCompte.add("Desactiver une CB",conteneurSuppCB);
		
		tabbedOperationsBanquaire.add("Virement",conteneurVirement);
		
		tabbedGestionClient.add("Ajouter un client",conteneurAjoutClient);
		tabbedGestionClient.add("Modifier un client",conteneurModClient);
		tabbedGestionClient.add("Supprimer un client",conteneurSuppClient);
		tabbedGestionClient.add("Gerer les comptes",tabbedGestionCompte);
		tabbedGestionClient.add("Effectuer des opérations",tabbedOperationsBanquaire);
		
		
		
		
		
		
		if(id==1) {
			tabbedGerant.addTab("Gestion des conseillers", tabbedGestionConseiller);
			tabbedGerant.addTab("Gestion des clients", tabbedGestionClient);
			tabbedGerant.addTab("Opérations banquaires", tabbedOperationsBanquaire);
			tabbedGerant.addTab("Audit des comptes", conteneurAuditComptes);
			conteneurFenetre.add(tabbedGerant);
		}else if(id==2){
			tabbedConseiller.addTab("Gestion des clients", tabbedGestionClient);
			tabbedConseiller.addTab("Opérations banquaires", tabbedOperationsBanquaire);
			tabbedConseiller.addTab("Audit des comptes", conteneurAuditComptes);
			conteneurFenetre.add(tabbedConseiller);
		}else if(id==3){
			tabbedAudit.addTab("Audit des comptes", conteneurAuditComptes);
			conteneurFenetre.add(tabbedAudit);
		}
		
		

		
		this.add(conteneurFenetre);
		//pack();
	}
}
