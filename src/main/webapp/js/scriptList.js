function editer(x){
    form = document.createElement('form');
    form.setAttribute('method', 'POST');
    form.setAttribute('action','http://localhost:8080/sgp/collaborateurs/lister');
    myvar = document.createElement('input');
    myvar.setAttribute('name', 'matricule');
    myvar.setAttribute('value',x);
    form.appendChild(myvar);
    document.body.appendChild(form);
    form.submit(); 

			  
}