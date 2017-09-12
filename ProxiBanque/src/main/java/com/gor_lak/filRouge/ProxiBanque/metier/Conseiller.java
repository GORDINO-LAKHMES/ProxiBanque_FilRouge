package com.gor_lak.filRouge.ProxiBanque.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author kosseila
 *
 */
public class Conseiller extends Employe {
private Gerant monGerant;
private List<Client> clients =new ArrayList<Client>();


// getters et setters 
public List<Client> getClients() {
	return clients;
}

public void setClients(List<Client> clients) {
	this.clients = clients;
}

public Gerant getMonGerant() {
	return monGerant;
}

public void setMonGerant(Gerant monGerant) {
	this.monGerant = monGerant;
}

public List<Client> ajouterClient(Client C){
	clients.add(C);
	return clients;
}
}
