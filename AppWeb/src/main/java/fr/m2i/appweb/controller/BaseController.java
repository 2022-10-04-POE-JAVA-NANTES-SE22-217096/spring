package fr.m2i.appweb.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
