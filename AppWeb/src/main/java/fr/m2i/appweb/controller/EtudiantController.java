package fr.m2i.appweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/etudiant")
public class EtudiantController {
	
	private final String URL = "/etudiant/";
	
	
	@GetMapping(path = "/accueil")
	public String getWelcome(Model model, @RequestParam("nom") String nom ) {
		
		model.addAttribute("hello", "hello du modele");
		model.addAttribute("nom", nom);
		
		return URL + "welcome";
	}
	
	@RequestMapping(path="/formation", method=RequestMethod.GET)
	public String getFormation() {
		return URL + "formation";
	}
	
	
	

	
	
	
	

}
