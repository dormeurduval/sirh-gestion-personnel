
package dev.sgp.service;
import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.*;

public class CollaborateurService {
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();

	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}
	
	public List<Collaborateur> filterByString(String s) {
		return (List<Collaborateur>) listeCollaborateurs.stream().filter(p->p.commencePar(s));
	}
	

	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
	
	public Collaborateur getCollaborateurMatricule(String matricule){
		for(Collaborateur col: listeCollaborateurs){
			if(col.getMatricule().equals(matricule)){
				return col;
			}
			
		}
		return null;
		
	}
}
