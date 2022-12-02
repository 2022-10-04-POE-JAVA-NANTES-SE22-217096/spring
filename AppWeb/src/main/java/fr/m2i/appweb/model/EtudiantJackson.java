package fr.m2i.appweb.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

/*
 * Exemple d'utilisation de Jackson 
 * 
 * Utilisé pour convertir des objets Java en XML ou JSON
 *
 */



@Data
@JsonRootName("renee")								//Determine le nom de l'élément s'il il doit apparaitre à la racine du document
@JsonPropertyOrder({"prenom","nom","age","forma"})		//Ordre des attributs
public class EtudiantJackson implements Serializable{

private static final long serialVersionUID = 2L;
	
	
	private String nom;
	private String prenom;
	
	private String age;
	
	@JsonProperty("forma")								//spécification nom JSON / XML
	private String formation;
	
	@Override
	public String toString() {
		
		return nom + " " + prenom;
	}
	
	
}
