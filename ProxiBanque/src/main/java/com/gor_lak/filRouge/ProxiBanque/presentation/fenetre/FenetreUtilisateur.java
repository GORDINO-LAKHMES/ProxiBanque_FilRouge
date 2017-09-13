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
	
	
	
	private static JButton boutonValider = new JButton("Valider");
	private static JButton boutonAnnuler = new JButton("Annuler");

	
	
	
	public FenetreUtilisateur(int id)
	{
		setSize(800,150);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		conteneurFenetre.setLayout(new BoxLayout(conteneurFenetre, BoxLayout.LINE_AXIS));

		//conteneurModConseiller.add(comboConseillers);
		//conteneurSuppConseiller.add(comboConseillers);
		
		tabbedGestionConseiller.add("Ajouter un conseiller",PanelFenetre.AjoutConseiller());
		tabbedGestionConseiller.add("Modifier un conseiller",PanelFenetre.ModConseiller());
		tabbedGestionConseiller.add("Supprimer un conseiller",PanelFenetre.SuppConseiller());
		
		/*conteneurCreerCompte.add(comboClients);
		conteneurModCompte.add(comboClients);
		conteneurSuppCompte.add(comboClients);
		conteneurAjoutCB.add(comboClients);
		conteneurModCB.add(comboClients);
		conteneurSuppCB.add(comboClients);
		conteneurModCompte.add(comboComptes);
		conteneurSuppCompte.add(comboComptes);
		conteneurAjoutCB.add(comboComptes);
		conteneurModCB.add(comboComptes);
		conteneurSuppCB.add(comboComptes);*/
		
		tabbedGestionCompte.add("Créer un compte",PanelFenetre.CreerCompte());
		tabbedGestionCompte.add("Modifier un compte",PanelFenetre.ModCompte());
		tabbedGestionCompte.add("Cloturer un compte",PanelFenetre.SuppCompte());
		tabbedGestionCompte.add("Associer une CB",PanelFenetre.AjoutCB());
		tabbedGestionCompte.add("Modifier une CB",PanelFenetre.ModCB());
		tabbedGestionCompte.add("Desactiver une CB",PanelFenetre.SuppCB());
		
		tabbedOperationsBanquaire.add("Virement",PanelFenetre.Virement());
		
		tabbedGestionClient.add("Ajouter un client",PanelFenetre.AjoutClient());
		tabbedGestionClient.add("Modifier un client",PanelFenetre.ModClient());
		tabbedGestionClient.add("Supprimer un client",PanelFenetre.SuppClient());
		tabbedGestionClient.add("Gerer les comptes",tabbedGestionCompte);
		tabbedGestionClient.add("Effectuer des opérations",tabbedOperationsBanquaire);
		
		
		
		
		
		
		if(id==1) {
			tabbedGerant.addTab("Gestion des conseillers", tabbedGestionConseiller);
			tabbedGerant.addTab("Gestion des clients", tabbedGestionClient);
			tabbedGerant.addTab("Opérations banquaires", tabbedOperationsBanquaire);
			tabbedGerant.addTab("Audit des comptes", PanelFenetre.AuditComptes());
			conteneurFenetre.add(tabbedGerant);
		}else if(id==2){
			tabbedConseiller.addTab("Gestion des clients", tabbedGestionClient);
			tabbedConseiller.addTab("Opérations banquaires", tabbedOperationsBanquaire);
			tabbedConseiller.addTab("Audit des comptes", PanelFenetre.AuditComptes());
			conteneurFenetre.add(tabbedConseiller);
		}else if(id==3){
			tabbedAudit.addTab("Audit des comptes", PanelFenetre.AuditComptes());
			conteneurFenetre.add(tabbedAudit);
		}
		
		

		
		this.add(conteneurFenetre);
		//pack();
	}
}
