package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.*;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

public class EditerCollaborateursControlle extends HttpServlet {
	CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	DepartementService collabDepartement = Constantes.COLLAB_DEPART;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// utilisation du service

		req.getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateur.jsp").forward(req,resp);
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est avecPhoto 
		String nom=req.getParameter("nom");
		String prenom=req.getParameter("prenom");
		String dateBirth=req.getParameter("birthdate");
		String numSociale=req.getParameter("sociale");
		String adresse=req.getParameter("adresse");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		Collaborateur collaborateur=
		new Collaborateur(nom,prenom,LocalDate.parse(dateBirth,formatter),adresse,numSociale);
		if(collaborateur.isValide()){
			resp.setStatus(200);
			collabService.sauvegarderCollaborateur(collaborateur);
		
			req.setAttribute("listCollabs",collabService.listerCollaborateurs());
			req.setAttribute("listDeparts",collabDepartement.listerDepartements());
			req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req,resp);
		}
		else{
			resp.sendError(400);
		}
	}
}
