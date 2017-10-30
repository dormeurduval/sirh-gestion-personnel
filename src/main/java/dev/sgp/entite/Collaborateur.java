/**
 * 
 */
package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;



public class Collaborateur {
	String matricule;
	String nom;
	String prenom;
	LocalDate dateBirth;
	String adresse;
	String numSociale;
	String emailPro;
	String photo;
	ZonedDateTime dateHeureCreation;
	Boolean actif;
	Departement departement;
	String telephone;
	String intitulePoste;
	

	static int current_matricule=0;
	
	public Collaborateur(String nom,String prenom,LocalDate dateBirth,String adresse,String numSociale){
		this.nom=nom;
		this.prenom=prenom;
		this.dateBirth=dateBirth;
		this.adresse=adresse;
		this.numSociale=numSociale;
		dateHeureCreation=ZonedDateTime.now();
		actif=true;
		matricule=String.valueOf(current_matricule);
		current_matricule++;
		emailPro = prenom+"."+nom+"@societe.com";
		photo="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_isWgOJHA7YNXAhKDE5h12SW2l91gIYU9YfZTisz4KItXN18U";
		telephone="05898989";
		departement=new Departement(0,"Compatibilite");
		intitulePoste="Informatique";
	}
	
	public boolean isValide(){
		return numSociale.length()>=14 && nom.equals(nom.toUpperCase());
	}
	
	public boolean commencePar(String string){
		return nom.startsWith(string)||prenom.startsWith(string);
	}
	
	/** getters
	 * @return the intitulePoste
	 */
	public String getIntitulePoste() {
		return intitulePoste;
	}

	/** Setter
	 * @param fonction the intitulePoste to set
	 */
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	
	/** getters
	 * @return the departement
	 */
	public Departement getDepartement() {
		return departement;
	}

	/** Setter
	 * @param departement the departement to set
	 */
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	/** getters
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/** Setter
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	/** getters
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/** Setter
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/** getters
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** getters
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/** getters
	 * @return the dateBirth
	 */
	public LocalDate getDateBirth() {
		return dateBirth;
	}
	/** Setter
	 * @param dateBirth the dateBirth to set
	 */
	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}
	/** getters
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/** getters
	 * @return the numSociale
	 */
	public String getNumSociale() {
		return numSociale;
	}
	/** Setter
	 * @param numSociale the numSociale to set
	 */
	public void setNumSociale(String numSociale) {
		this.numSociale = numSociale;
	}
	/** getters
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}
	/** Setter
	 * @param emailPro the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	/** getters
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	/** Setter
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/** getters
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	/** Setter
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}
	/** getters
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}
	/** Setter
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	
	
	
}
