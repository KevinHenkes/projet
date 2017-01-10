package entities;

import java.util.ArrayList;
import java.util.List;

public class User {
	String nom;
	String prenom;
	String login;
	String motDePass;
	List<String> droits;
	
	public User() {
		this.droits = new ArrayList<String>();
	
	}
	
	public User(String nom, String prenom, String login, String motDePass) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePass = motDePass;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePass() {
		return motDePass;
	}
	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}
}