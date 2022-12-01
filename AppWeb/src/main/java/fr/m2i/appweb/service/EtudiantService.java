package fr.m2i.appweb.service;

import org.springframework.stereotype.Service;

import fr.m2i.appweb.model.Etudiant;

@Service
public class EtudiantService {
	
	
	public String messageAccueil(Etudiant etudiant) {
		
		return "Bonjour "+ etudiant.getNom() + " " + etudiant.getPrenom();
	}

}
