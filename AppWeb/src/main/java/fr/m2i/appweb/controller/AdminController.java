package fr.m2i.appweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/admin")
public class AdminController {

	private final String URL = "/admin/";
	
	@GetMapping(path = "/accueil")
	public String getWelcome() {
		return URL + "welcome";
	}
	
	@RequestMapping(path="/formation", method=RequestMethod.GET)
	public String getFormation() {
		return URL + "formation";
	}
	

	
	/**
	 * 
	 * Faire une application Spring Boot
	 * 
	 * Avec une Zone admin qui contient
	 * 
	 * Une page d'accueil et une page formation
	 * 
	 * 
	 * Une zone etudiant
	 * 
	 * Une page d'accueil et une page formation
	 * 
	 * 
	 * Dans les deux cas les pages se nomment accueil.html et formation.html mais sont bien différentes.
	 * 
	 * 
	 * Vous me rajouter un css sur chaque page, je veux un fond rose.
	 * 

	 * 
	 */
	
}
