package com.proxiBanqueKM.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.proxiBanqueKM.metier.Auditeur;
import com.proxiBanqueKM.metier.Client;
import com.proxiBanqueKM.metier.Compte;
import com.proxiBanqueKM.metier.Conseiller;
import com.proxiBanqueKM.metier.Gerant;

public class Dao implements Idao {

	public void ajouterClient(Client cl) {
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
					
					//4-envoyer la requÃªte 
				
					String requete="INSERT INTO client (nom, prenom, email, adresse, telephone) VALUES(?,?,?,?,?)"; 
					
					PreparedStatement ps=con.prepareStatement(requete);
					ps.setString(1, cl.getNom());
					ps.setString(2, cl.getPrenom());
					ps.setString(3, cl.getEmail());
					ps.setString(4, cl.getAdresse());
					ps.setInt(5, cl.getTelephone());
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
					
					//4-envoyer la requÃªte 
				
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
			
			//4-envoyer la requÃªte 
		
			String requete="INSERT INTO compte (idCompte, solde, dateOuverture, decouvert, taux ) VALUES(?,?,?)"; 
			
			PreparedStatement ps=con.prepareStatement(requete);
			ps.setInt(1, c.getIdCompte());
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
			
			//4-envoyer la requÃªte 
		
			String requete="UPDATE compte set  solde=?, "+ " Where idCompte=?";
			
			PreparedStatement ps=con.prepareStatement(requete);
		
			ps.setInt(1, c.getSolde());
			ps.setInt(2, c.getIdCompte());
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

	public void supprimerCompte(Compte c) {
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
			
			String requete="DELETE From compte  Where idCompte=?";
			
			PreparedStatement ps=con.prepareStatement(requete);
			ps.setInt(1, c.getIdCompte());
			
			//5-recuperer le resultat
			
			//6-liberer les ressources
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void lireCompte(Client cl1) {
		
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
			
			String requete="SELECT * FROM Client Where idClient= ?";
			

			PreparedStatement ps=con.prepareStatement(requete);
			ps.setInt(1, cl1.getIdClient());
		
			//5-recuperer le resultat
			ResultSet rs= ps.executeQuery();
			rs.next();
			
			//t.setId(rs.getInt("id"));
				
			cl1.setNom(rs.getString("nom"));	
			cl1.setPrenom(rs.getString("prenom"));	
			cl1.setAdresse(rs.getString("adresse"));	
			cl1.setEmail(rs.getString("email"));
			cl1.setTelephone(rs.getInt("adresse"));
			
				

			//6-liberer les ressources
			ps.close();
			con.close();
			
			
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

	public void simulationCompte(Client c) {
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
			
			String requete="SELECT * FROM Client Where idClient= ?";
			

			PreparedStatement ps=con.prepareStatement(requete);
			ps.setInt(1, c.getIdClient());
		
			//5-recuperer le resultat
			ResultSet rs= ps.executeQuery();
			rs.next();
			
			//t.setId(rs.getInt("id"));
				
		
			
				

			//6-liberer les ressources
			ps.close();
			con.close();
			
			
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

	public void virserment(Compte c1, Compte c2) {
		// TODO Auto-generated method stub

	}

	public void patrimoineCompte(Client c) {
		// TODO Auto-generated method stub

	}

	public void attribuerClient(Client c) {
		// TODO Auto-generated method stub

	}

	public void lireCompteAuditeur(Auditeur a) {
		// TODO Auto-generated method stub

	}

	public void ajouterConseiller(Conseiller c) {
		// TODO Auto-generated method stub

	}

	public void modifierConseiller(Gerant g) {
		// TODO Auto-generated method stub

	}

	public void supprimerConseiller(Gerant g) {
		// TODO Auto-generated method stub

	}

}
