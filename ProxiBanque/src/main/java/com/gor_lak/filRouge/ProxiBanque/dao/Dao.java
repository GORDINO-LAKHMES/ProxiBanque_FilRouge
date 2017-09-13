package com.gor_lak.filRouge.ProxiBanque.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.gor_lak.filRouge.ProxiBanque.metier.Auditeur;
import com.gor_lak.filRouge.ProxiBanque.metier.Client;
import com.gor_lak.filRouge.ProxiBanque.metier.Compte;
import com.gor_lak.filRouge.ProxiBanque.metier.Conseiller;
import com.gor_lak.filRouge.ProxiBanque.metier.Courant;
import com.gor_lak.filRouge.ProxiBanque.metier.Employe;
import com.gor_lak.filRouge.ProxiBanque.metier.Entreprise;
import com.gor_lak.filRouge.ProxiBanque.metier.Epargne;
import com.gor_lak.filRouge.ProxiBanque.metier.Gerant;
import com.gor_lak.filRouge.ProxiBanque.metier.Particulier;

public class Dao implements Idao {

	
	@Override
	public Employe seConnecter() {
		Employe em= new Employe();
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
		
			String requete="SELECT * FROM Employe Where login=?"; 
			
			PreparedStatement ps=con.prepareStatement(requete);
			ps.setString(1,em.getLogin());
			ps.setInt(2,em.getMotDePasse());
	
			ps.executeUpdate();
		
			//5-recuperer le resultat
			
			//6-liberer les ressources
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return em;
	}
	@Override
	public void seConnecterGerant(String login1, int mdp1) {
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
		
			String requete="INSERT INTO Gerant (login1, mdp1) VALUES(?,?)"; 
			
			PreparedStatement ps=con.prepareStatement(requete);
			ps.setString(1, login1);
			ps.setInt(2,mdp1);
	
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
	public void modifierGerant(Gerant g) {
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
		
			String requete="UPDATE Gerant set login, tel, adresse, email, nom, prenom"+ " Where idGerant=?";
			
			PreparedStatement ps=con.prepareStatement(requete);
		
			
			ps.setString(1, g.getLogin());
			ps.setInt(2, g.getTel());
			ps.setString(3, g.getAdresse());
			ps.setString(4, g.getEmail());
			ps.setString(5, g.getNom());
			ps.setString(6, g.getPrenom());
			
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
	public void supprimerGerant(Gerant g) {
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
			
			String requete="DELETE From Gerant  Where idGerant=?";
			
			PreparedStatement ps=con.prepareStatement(requete);
			ps.setInt(1, g.getIdGerant());
			
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
	public void seConnecterConseiller(String login1, String mdp1) {
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

	@Override
	public void ajouterConseiller(Conseiller c) {
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
		
			String requete="INSERT INTO Conseiller (login, tel,adresse, email, nom, prenom  ) VALUES(?,?,?,?,?,?)"; 
			
			PreparedStatement ps=con.prepareStatement(requete);
			ps.setString(1, c.getLogin());
			ps.setInt(3, c.getTel());
			ps.setString(4, c.getAdresse());
			ps.setString(5, c.getEmail());
			ps.setString(6, c.getNom());
			ps.setString(7, c.getPrenom());
	
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
	public void modifierConseiller(Conseiller cn) {
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
		
			String requete="UPDATE conseiller set login, tel, adresse, email, nom, prenom"+ " Where idConseiller=?";
			
			PreparedStatement ps=con.prepareStatement(requete);
		
	
			ps.setString(1, cn.getLogin());
			ps.setInt(2, cn.getTel());
			ps.setString(3, cn.getAdresse());
			ps.setString(4, cn.getEmail());
			ps.setString(5, cn.getNom());
			ps.setString(6, cn.getPrenom());
			
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
	public void supprimerConseiller(Conseiller cn) {
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
			
			String requete="DELETE From conseiller  Where idConseiller=?";
			
			PreparedStatement ps=con.prepareStatement(requete);
			ps.setInt(1, cn.getIdConseiller());
			
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
	public void ajouterClient(Client cl) {
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

	@Override
	public void seConnecterClient(String login1, String mdp1) {
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
		
			String requete="INSERT INTO Client (login1, mdp1) VALUES(?,?)"; 
			
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
	public void patrimoineCompte(Client c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerClient(Client c) {
		// TODO Auto-generated method stub
		
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

	@Override
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

	@Override
	public void lireCompte(Compte c) {
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
			
			String requete="SELECT * FROM Compte Where idCompte= ?";
			

			PreparedStatement ps=con.prepareStatement(requete);
			ps.setInt(1, c.getIdCompte());
		
			//5-recuperer le resultat
			ResultSet rs= ps.executeQuery();
			rs.next();
			
			//t.setId(rs.getInt("id"));
				
			c.setSolde(rs.getInt("Solde"));	
			
			
			
				

			//6-liberer les ressources
			ps.close();
			con.close();
			
			
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

	@Override
	public void simulationCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seConnecterParticulier(String login1, String mdp1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lireCompteParticulier(Particulier p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seConnecterAuditeur(String login1, String mdp1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lireCompteAuditeur(Auditeur a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seConnecterEntreprise(String login1, String mdp1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lireCompteEntreprise(Entreprise e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void virsermentCompteCourant(Compte c1, Compte c2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lireCompteCourant(Courant cr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void virsermentCompteEpargne(Compte c1, Compte c2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lireCompteEpargne(Epargne ep) {
		// TODO Auto-generated method stub
		
	}

	

	

}
