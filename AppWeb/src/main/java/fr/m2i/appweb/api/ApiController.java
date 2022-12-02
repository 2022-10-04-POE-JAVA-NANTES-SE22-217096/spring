package fr.m2i.appweb.api;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import fr.m2i.appweb.model.Etudiant;
import fr.m2i.appweb.model.EtudiantJackson;
import fr.m2i.appweb.model.EtudiantJpa;
import fr.m2i.appweb.service.EtudiantService;


@RestController
@RequestMapping(path="/api")
public class ApiController {
	
	@Autowired
	EtudiantService etudiantService;
	
	
	//Location URI 
	@GetMapping(
			path="/etudiant/{id}"
	)
	public Etudiant getEtudiantById(@PathVariable String id) {    //on utilise une variable du path {id}
		
		System.out.println(id);
		
		
		/*
		 * 
		 * Recuperation dans la BDD de l'étudiant.
		 * 
		 * 
		 */
		
		Etudiant etudiant = new Etudiant();
		
		
		return etudiant;
	}
	
	
	
	/*
	 * PARTIE 1 : BASES GET
	 * 
	 * Le test de négociation peut être éxecuté avec curl
	 * 
	 * Pour le JSON : curl -H "Accept: application/json" http://localhost:9090/api/etudiants
	 * Pour le XML : curl -H "Accept: application/xml" http://localhost:9090/api/etudiants
	 */
	
	@GetMapping(
			path="/etudiants",								//path / url
			produces={"application/json","application/xml"} //négociation de contenu / par défaut JSON
	)
	public List<Etudiant> getEtudiant() { 
	
		List<Etudiant> result = new ArrayList<Etudiant>();	
			
			
		Etudiant etudiant1 = new Etudiant();
		Etudiant etudiant2 = new Etudiant();
		
		etudiant1.setNom("Minet");
		etudiant1.setPrenom("Bernard");
		etudiant1.setAge("20");
		etudiant1.setFormation("POEI");
		
		etudiant2.setNom("Balasko");
		etudiant2.setPrenom("Josiane");
		etudiant2.setAge("20");
		etudiant2.setFormation("POEI");
		
		result.add(etudiant1);
		result.add(etudiant2);
		
		return result;
	}
	
	
	
	/*
	 * PARTIE 2 : BASES POST
	 * 
	 * Le test de négociation peut être éxecuté avec curl
	 * 
	 * Pour le JSON : curl -H "Accept: application/json" http://localhost:9090/api/etudiants
	 * Pour le XML : curl -H "Accept: application/xml" http://localhost:9090/api/etudiants
	 */
	
	
	@PostMapping(
			path="/etudiants/form",										//path / url
			consumes={MediaType.MULTIPART_FORM_DATA_VALUE} 				//Par formulaire
	)
	@ResponseStatus(code=HttpStatus.CREATED)							//Optionnel permet de renvoyer un code HTTP de retour (200 OK, 204 No Content etc...)
	public void postFormEtudiant(@ModelAttribute Etudiant etudiant) { 
		
		System.out.println(etudiant);
	
		
	}
	
	@PostMapping(
			path="/etudiants/json",								//path / url
			consumes={MediaType.APPLICATION_JSON_VALUE} 			//par JS[ON
	)
	@ResponseStatus(code=HttpStatus.CREATED)						//Optionnel permet de renvoyer un code HTTP de retour (200 OK, 204 No Content etc...), ici 201
	public void postJsonEtudiant(@RequestBody Etudiant etudiant) { 
		
		System.out.println(etudiant);
	
		
	}
	
	
	
	/*
	 * PARTIE 3 CONSTRUCTION AVANCEE DE REPONSE
	 * 
	 * 
	 * 
	 */
		
	@PostMapping(
			path="/etudiants/avance",								//path / url
			consumes={MediaType.APPLICATION_JSON_VALUE},			//par JSON
			produces={MediaType.APPLICATION_JSON_VALUE}
	)
	@ResponseStatus(code=HttpStatus.CREATED)						//Optionnel permet de renvoyer un code HTTP de retour (200 OK, 204 No Content etc...)
	public ResponseEntity<Etudiant> reponseAvanceeEtudiant(@RequestBody Etudiant etudiant, UriComponentsBuilder uriBuilder) { 
		
		System.out.println(etudiant);
		
		URI uri = uriBuilder.path("/api/etudiant/{id}").buildAndExpand(etudiant.getNom()).toUri(); //rajoute une location dans le header
        
		
		return ResponseEntity.created(uri).body(etudiant);
		
	
		
	}
	
	
	/*
	 * PARTIE 4 : Get avec jackson
	 * 
	 * 
	 * 
	 */
	@GetMapping(
			path="/etudiants/jackson",								//path / url
			produces={"application/json"} //négociation de contenu / par défaut JSON
	)
	public List<EtudiantJackson> getJacksonEtudiant() { 
	
		List<EtudiantJackson> result = new ArrayList<EtudiantJackson>();	
		
		
		EtudiantJackson etudiant1 = new EtudiantJackson();
		EtudiantJackson etudiant2 = new EtudiantJackson();
		
		etudiant1.setNom("Minet");
		etudiant1.setPrenom("Bernard");
		etudiant1.setAge("20");
		etudiant1.setFormation("POEI");
		
		etudiant2.setNom("Balasko");
		etudiant2.setPrenom("Josiane");
		etudiant2.setAge("20");
		etudiant2.setFormation("POEI");
		
		result.add(etudiant1);
		result.add(etudiant2);
		
		
		return result;
	}
	
	
	
	/*
	 * Exemple avec JPA
	 * 
	 * 
	 * 
	 */
	
	@GetMapping(
			path="/bdd/etudiants",								//path / url
			produces={"application/json"} 						//négociation de contenu / par défaut JSON
	)
	public List<EtudiantJpa> getEtudiants() { 
	
		
		
		return etudiantService.getAll();
		
	}
	
	
	@PostMapping(
			path="/bdd/etudiant/post",								//path / url
			consumes={"application/json"} 						//négociation de contenu / par défaut JSON
	)
	@ResponseStatus(code=HttpStatus.CREATED)	
	public void getEtudiants(@RequestBody EtudiantJpa etudiant) { 
	
		etudiantService.saveEtudiant(etudiant);
		
	}
	
	
	
}

