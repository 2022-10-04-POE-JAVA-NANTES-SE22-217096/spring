package fr.m2i.appweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.m2i.appweb.model.Etudiant;

@RestController
@RequestMapping(path="/rest")
public class ApiController {
	
	
	
	@GetMapping(path="/etudiant", produces={"application/json"})
	public Etudiant getEtudiant() {
		Etudiant result = new Etudiant();
		
		result.setNom("Minet");
		result.setPrenom("Bernard");
		
		
		return result;
		
	}

}
