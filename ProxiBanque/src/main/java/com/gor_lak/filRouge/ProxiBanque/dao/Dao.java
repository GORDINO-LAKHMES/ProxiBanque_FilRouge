package com.gor_lak.filRouge.ProxiBanque.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.gor_lak.filRouge.ProxiBanque.metier.Auditeur;
import com.gor_lak.filRouge.ProxiBanque.metier.Client;
import com.gor_lak.filRouge.ProxiBanque.metier.Compte;
import com.gor_lak.filRouge.ProxiBanque.metier.Conseiller;
import com.gor_lak.filRouge.ProxiBanque.metier.Gerant;

/**
 * 
 * @author kosseila
 *
 */
public class Dao implements Idao {

	@Override
	public void ajouterClient(Client c) {
		// TODO Auto-generated method stub
		try {
			// 1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque2";
			String login="root";
			String mdp="";
			
			//3- se connecter a la BDD
			Connection con=DriverManager.getConnection(adresse, login, mdp);
			
			//4-envoyer la requête 
		
			String requete="INSERT INTO client (nom, prenom, email, adresse, telephone) VALUES(?,?,?,?,?)"; 
			
			PreparedStatement ps=con.prepareStatement(requete);
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
			ps.setString(3, c.getEmail());
			ps.setString(4, c.getAdresse());
			ps.setInt(5, c.getTelephone());
			ps.executeUpdate();
		
			//5-recuperer le resultat
			
			//6-liberer les ressources
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void seConnecter(String login1, String mdp1) {
		// TODO Auto-generated method stub
		try {
			// 1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque2";
			String login="root";
			String mdp="";
			
			//3- se connecter a la BDD
			Connection con=DriverManager.getConnection(adresse, login, mdp);
			
			//4-envoyer la requête 
		
			String requete="INSERT INTO Conseiller (login1, mdp1) VALUES(?,?)"; 
			
			PreparedStatement ps=con.prepareStatement(requete);
			ps.setString(1, login1);
			ps.setString(2,mdp1);
	
			ps.executeUpdate();
		
			//5-recuperer le resultat
			
			//6-liberer les ressources
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void creerCompte(Compte c) {
		try {
			// 1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque2";
			String login="root";
			String mdp="";
			
			//3- se connecter a la BDD
			Connection con=DriverManager.getConnection(adresse, login, mdp);
			
			//4-envoyer la requête 
		
			String requete="INSERT INTO compte (numeroCompte, solde, dateOuverture, decouvert, taux ) VALUES(?,?,?)"; 
			
			PreparedStatement ps=con.prepareStatement(requete);
			ps.setInt(1, c.getNumeroCompte());
			ps.setInt(2, c.getSolde());
			ps.setInt(3, c.getDateOuverture());
			//ps.setDouble(2, );
			
			ps.executeUpdate();
		
			//5-recuperer le resultat
			
			//6-liberer les ressources
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void modifierCompte(Compte c) {
		try {
			// 1- charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- adresse de la BDD
			String adresse="jdbc:mysql://localhost:3306/proxibanque2";
			String login="root";
			String mdp="";
			
			//3- se connecter a la BDD
			Connection con=DriverManager.getConnection(adresse, login, mdp);
			
			//4-envoyer la requête 
		
			String requete="UPDATE compte set  solde=?, "+ " Where idCompte=?";
			
			PreparedStatement ps=con.prepareStatement(requete);
		
			ps.setInt(1, c.getSolde());
			ps.setInt(2, idCompte);
			//ps.setDouble(2, );
			
			ps.executeUpdate();
		
			//5-recuperer le resultat
			
			//6-liberer les ressources
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void supprimerCompte(Compte c) {
		// TODO Auto-generated method stub
		System.out.println("je supprime le compte");
	}

	@Override
	public void lireCompte(Client cl1) {
		// TODO Auto-generated method stub
		System.out.println("je regarde les transactions au niveau de ton compte");
	}

	@Override
	public void simulationCompte(Client c) {
		// TODO Auto-generated method stub
		System.out.println("je fais une simulation");
	}

	@Override
	public void virserment(Compte c1, Compte c2) {
		// TODO Auto-generated method stub
		System.out.println(" je fais un virement");
	}

	@Override
	public void patrimoineCompte(Client c) {
		// TODO Auto-generated method stub
		System.out.println(" gestion de ton patrimoine");
	}

	@Override
	public void attribuerClient(Client c) {
		// TODO Auto-generated method stub
		System.out.println("j'attribue les clients pour chaque conseiller");
	}

	@Override
	public void lireCompteAuditeur (Auditeur a) {
	
		// TODO Auto-generated method stub
		System.out.println("j'analyse les comptes des clients");
	}

	@Override
	public void ajouterConseiller(Conseiller c) {
		// TODO Auto-generated method stub
		System.out.println("j'ajoute des conseillers a la liste");
	}

	@Override
	public void modifierConseiller(Gerant g) {
		// TODO Auto-generated method stub
		System.out.println("je modifie les informations des conseillers");
	}

	@Override
	public void supprimerConseiller(Gerant g) {
		// TODO Auto-generated method stub
		System.out.println("je supprime les donn�es de notre conseiller qui est parti a la retraite");

	}

}
