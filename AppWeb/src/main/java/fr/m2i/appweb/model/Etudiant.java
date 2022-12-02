package fr.m2i.appweb.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Etudiant implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nom;
	private String prenom;
	
	private String age;
	private String formation;
	
	@Override
	public String toString() {
		
		return nom + " " + prenom;
	}
	
	
	
}
