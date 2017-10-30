package dev.sgp.web;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dev.sgp.service.*;
import dev.sgp.util.Constantes;
import dev.sgp.entite.*;




public class ListerCollaborateursControlle extends HttpServlet {
	// recuperation du service private
	CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	DepartementService collabDepartement = Constantes.COLLAB_DEPART;

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// utilisation du service
		Collaborateur col = collabService.getCollaborateurMatricule(req.getParameter("matricule"));
		req.setAttribute("col",col);
		req.getRequestDispatcher("/WEB-INF/views/collab/EditerCollaborateurs.jsp").forward(req,resp);
		
	}
}
