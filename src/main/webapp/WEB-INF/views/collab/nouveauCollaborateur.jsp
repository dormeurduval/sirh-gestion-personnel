<!DOCTYPE html>
<head>
  <meta charset="utf-8" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="<%=request.getContextPath()%>/js/script.js"></script>  
    <style>
    
    body {
      background-color: #eee;
    }

    h2 {
    text-align: center;
    }
  
    *[role="form"] {
      max-width: 530px;
      padding: 15px;
      margin: 0 auto;
      background-color: #fff;
      border-radius: 0.3em;
    }
  
    *[role="form"] h2 {
      margin-left: 5em;
      margin-bottom: 1em;
    }   

  </style>
  
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

  <form>
      <h2>Nouveau Collaborateur</h2>

        <label for="firstName">Nom</label>
        <input type="text" id="Nom" placeholder="Nom" class="form-control" required oninvalid="this.setCustomValidity('Entrez un nom')"
        oninput="setCustomValidity('')" name="nom">
        <span class="help-block">En majuscule</span>



        
         <div>
         	<label for="prenom">Prenom</label>
         	<input type="prenom" id="prenom" placeholder="Prenom" class="form-control" required oninvalid="this.setCustomValidity('Entrez un prenom')"
         	oninput="setCustomValidity('')" name="prenom">
         </div>


          <label for="birthDate">Date de naissance</label>
          <div>
              <input type="date" id="birthDate" class="form-control" required oninvalid="this.setCustomValidity('Entrez une date de naissance')"
              oninput="setCustomValidity('')" name="birthdate">
          </div>


        <label for="adresse">Adresse</label>
        <textarea class="form-control" rows="5" placeholder="Adresse" id="adresse" required oninvalid="this.setCustomValidity('Entrez une adresse')"
        oninput="setCustomValidity('')" name="adresse"></textarea>


        <label for="sociale">Numero de securite sociale</label>
        <div>
            <input type="num" id="sociale" placeholder="Numero de securite sociale" class="form-control" required oninvalid="this.setCustomValidity('Entrez un numero de securite sociale')"
            oninput="setCustomValidity('')" name="sociale">
        </div>

         <div >
             <button type="submit" class="btn btn-primary btn-block" id="creer">Creer</button>
         </div>

</form>

<div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <label for="firstName">Vous êtes sur le point de creer un collaborateur</label>
            </div>
            <div class="modal-body">
                Nom: <label id="prenom_window"></label><br>
                Prenom: <label id="nom_window"></label><br>
                Date: <label id="date_window"></label><br>
                Adresse: <label id="adresse_window"></label><br>
                Numero de securite sociale: <label id="num_window"></label>
            </div>
            <div class="modal-footer">
                <input type="button"  value="Annuler" id="annuler"></button>
                <input type="button" value="Confirmer" onclick="confirmer()"></button>
            </div>
        </div>
    </div>
</div>


<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>

</body>