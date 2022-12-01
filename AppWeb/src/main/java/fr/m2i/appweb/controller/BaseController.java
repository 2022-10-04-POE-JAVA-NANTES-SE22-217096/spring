package fr.m2i.appweb.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.m2i.appweb.model.Etudiant;
import fr.m2i.appweb.service.EtudiantService;

@Controller
public class BaseController {
	
	@Autowired
	EtudiantService etudiantService;
	
	
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
	public String postFormulaire(Model model, @ModelAttribute Etudiant etudiant) {
	
		model.addAttribute("message", etudiantService.messageAccueil(etudiant));
		
		return "/form/resultat";
	}


}
