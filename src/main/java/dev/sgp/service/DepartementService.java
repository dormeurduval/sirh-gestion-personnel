/**
 * 
 */
package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;
import dev.sgp.entite.Departement;

import dev.sgp.entite.Collaborateur;

public class DepartementService {

	List<Departement> listeDepartements = new ArrayList<>();

	public DepartementService(){
		sauvegarderDepartement(new Departement(0,"Comptabilite"));
		sauvegarderDepartement(new Departement(1,"Ressources Humaines"));
		sauvegarderDepartement(new Departement(2,"Informatique"));
		sauvegarderDepartement(new Departement(3,"Administratif"));
	}
	
	public List<Departement> listerDepartements() {
		return listeDepartements;
	}
	

	public void sauvegarderDepartement(Departement departement) {
		listeDepartements.add(departement);
	}
}
