<%@page import="dev.sgp.util.Constantes"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="dev.sgp.entite.Departement"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<script src="<%=request.getContextPath()%>/js/scriptList.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/styleList.css">

<!-- Required meta tags -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
	integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
	crossorigin="anonymous">
</head>


<body>
  	<ul class="nav">
    	<li class="nav-item">
      	<a class="nav-link active" href="#">Collaborateurs</a>
    	</li>
    	<li class="nav-item">
      	<a class="nav-link" href="#">Statistiques</a>
    	</li>
    	<li class="nav-item">
      	<a class="nav-link" href="#">Activités</a>
    	</li>
  	</ul>

	<div class="container">
		<div class="row">
			<h1>Les Collaborateurs</h1>
		</div>
		<form class="form-search">
			<div class="input-append">

				Rechercher un nom ou un prénom qui commence par : <input type="text"
					class="span2 search-query">
				<button type="submit" class="btn">Rechercher</button>
				<input type="checkbox" name="active" value="1" style="margin-left : 100px"> voir les collaborateurs désactivés</input>
				<br /> Filtrer par déppartement : <select>
				<%
					List<Departement> departs = (List<Departement>) request.getAttribute("listDeparts");
					if(departs != null)
					for (Departement depart : departs) {
				%>
				
					<option value="volvo"><%=depart.getNom()%></option>
				<%}
				%>
				</select>
			</div>
			<br />
		</form>
		<div class="row">
			
			<%
				List<Collaborateur> collabs = (List<Collaborateur>) request.getAttribute("listCollabs");
				if(collabs != null)
				for (Collaborateur col : collabs) {
			%>

			<div class="row-sm-3">
				<div class="card">
					<canvas class="header-bg" width="250" height="70" id="header-blur"></canvas>
					<div class="avatar">
						<img src="<%=col.getPhoto()%>" alt="not found" />
					</div>
					<div class="content">
						<p>
							
							<%=col.getNom()%> <%=col.getPrenom()%>
							<br> <i class="glyphicon glyphicon-qrcode"></i> <%=col.getMatricule()%>
							 <br><%=col.getIntitulePoste()%> <br> <%=col.getDepartement().getNom()%>
							 <br> <i class="glyphicon glyphicon-home"></i> <%=col.getAdresse()%>
							 <br><i class="glyphicon glyphicon-envelope"></i>  <%=col.getEmailPro()%>
							 <br><i class="glyphicon glyphicon-phone"></i> <%=col.getTelephone() %>
						</p>
						<p>
							<button type="button" class="btn" onclick="editer(col.getMatricule())">Editer</button>
						</p> 
					</div>
				</div>
			</div>

				<%
					}
				%>

		</div>
	</div>




	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"
		integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"
		integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ"
		crossorigin="anonymous"></script>
</body>
</html>