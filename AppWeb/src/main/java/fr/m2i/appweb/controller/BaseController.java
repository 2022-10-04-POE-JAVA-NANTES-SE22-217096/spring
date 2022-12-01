package fr.m2i.appweb.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.m2i.appweb.model.Etudiant;

@Controller
public class BaseController {
	
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getIndex() {
		
		return "index";
	}
	
	@RequestMapping(path="/formation", method=RequestMethod.GET)
	public String getFormation() {
		
		return "formation";
	}
	
	
	
	@GetMapping(path="/formulaire")
	public String getFormulaire(@ModelAttribute Etudiant etudiant) {
		
		
		return "/form/formulaire";
	}
	
	@PostMapping(path="/formulaire")
	public String postFormulaire(@ModelAttribute Etudiant etudiant) {
		
	System.out.println(etudiant.getNom());
		
		return "/form/resultat";
	}
	
	
	/***
	 * 
	 * 
	 * 
	 * Autre Controller
	 * 
	 * il gère 3 routes 
	 * welcome /contact /formations
	 * 
	 * (3 methodes GET)
	 *
	 *Afficher un template
	 */

}
