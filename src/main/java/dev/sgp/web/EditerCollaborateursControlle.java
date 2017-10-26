package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateursControlle extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est avecPhoto 
		String matricule="";
		String s="";
		List<String>l = new ArrayList<String>();
		
		matricule = req.getParameter("matricule");
		if(matricule==null)
			s+="matricule ";
		String titre="";
		titre = req.getParameter("titre");
		if(titre==null)
			s+="titre "; 
		String nom="";
		
		nom = req.getParameter("nom");
		if(nom==null)
			s+="nom "; 
		String prenom="";
		prenom = req.getParameter("prenom");
		if(prenom==null)
			s+="prenom";
		

		if(!s.equals("")){
			resp.sendError(400,"Ce qui est attendu "+s);
		}
		else{
			resp.setContentType("text/html"); 
			resp.setStatus(201);
			// code HTML ecrit dans le corps de la reponse 
			resp.getWriter().write("<h1>La servlet vérifie que les parametres suivants sont renseignes</h1>" 
					+ "<ul>" 
					+ "<li>matricule="
					+ matricule 
					+ "</li>" 
					+ "<li>titre="
					+ titre + "</li>" + 
					"<li>nom="
					+ nom + "</li>" 
					+"<li>prenom="
					+ prenom + "</li>"+ 
					"</ul>");
			
		}	
		
	}
}
