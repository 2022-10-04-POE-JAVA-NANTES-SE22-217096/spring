package fr.m2i.appweb.model;

import lombok.Data;


public class Todo {

		private String nom;
		private String description;
		
		
		public Todo()
		{
			
		}
		
		public Todo(String nom, String description) {
			this.nom = nom;
			this.description = description;
			
		}
		
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
		@Override
		public String toString() {
			
			return nom + " "+description;
			
			
		}
}
