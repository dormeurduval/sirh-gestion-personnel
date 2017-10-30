
$(document).ready(function() {
    $("#creer").on("click",function(event) {
      if(document.getElementById("Nom").value!="" && document.getElementById("prenom").value!="" && 
      document.getElementById("birthDate").value!="" && document.getElementById("adresse").value!="" &&
      document.getElementById("sociale").value!=""){
        event.preventDefault();

        $("#nom_window").text(document.getElementById("Nom").value);
        $("#prenom_window").text(document.getElementById("prenom").value);
        $("#date_window").text(document.getElementById("birthDate").value);
        $("#adresse_window").text(document.getElementById("adresse").value);
        $("#num_window").text(document.getElementById("sociale").value);


        $('#myModal').modal();
      }  
    });
  });

  $(document).ready(function() {
    $("#annuler").on("click",function(event) {
      event.preventDefault();
      $('#myModal').modal("hide");
    });
  });
  


function confirmer(){
	document.forms[0].action="http://localhost:8080/sgp/collaborateurs/editer";
	document.forms[0].method="POST";
	document.forms[0].submit();

			  
}

function getCollaborateurs(){
	document.forms[0].action="http://localhost:8080/sgp/collaborateurs/lister";
	document.forms[0].method="GET";
	document.forms[0].submit();
	
}

  
 