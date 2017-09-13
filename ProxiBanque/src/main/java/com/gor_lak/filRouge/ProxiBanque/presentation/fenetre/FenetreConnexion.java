package com.gor_lak.filRouge.ProxiBanque.presentation.fenetre;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FenetreConnexion extends JFrame {
	
	private JPanel conteneurFenetre = new JPanel();
	private JPanel conteneurLogin = new JPanel();
	private JPanel conteneurMdp = new JPanel();
	private JPanel conteneurBouton = new JPanel();
	private JButton boutonConnexion = new JButton("Connexion");
	private JButton boutonAnnuler = new JButton("Annuler");
	private JLabel labelLogin = new JLabel("Login");
	private JLabel labelMdp = new JLabel("Mot de passe");
	private static JTextField saisieLogin = new JTextField(20);
	private static JTextField saisieMdp = new JTextField(20);
	
	public FenetreConnexion()
	{
		
		setSize(300,150);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		
		
		conteneurFenetre.setLayout(new BoxLayout(conteneurFenetre, BoxLayout.PAGE_AXIS));
		conteneurLogin.setLayout(new BoxLayout(conteneurLogin, BoxLayout.LINE_AXIS));
		conteneurMdp.setLayout(new BoxLayout(conteneurMdp, BoxLayout.LINE_AXIS));
		conteneurBouton.setLayout(new BoxLayout(conteneurBouton, BoxLayout.LINE_AXIS));
		
		conteneurLogin.add(labelLogin);
		conteneurLogin.add(saisieLogin);
		
		conteneurMdp.add(labelMdp);
		conteneurMdp.add(saisieMdp);
		
		conteneurBouton.add(boutonConnexion);
		conteneurBouton.add(boutonAnnuler);
		
		conteneurFenetre.add(conteneurLogin);
		conteneurFenetre.add(conteneurMdp);
		conteneurFenetre.add(conteneurBouton);
		
		this.add(conteneurFenetre);	
		pack();
		
	}
}
