package fr.m2i.appweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.m2i.appweb.model.Etudiant;
import fr.m2i.appweb.model.EtudiantJpa;
import fr.m2i.appweb.repository.EtudiantJpaRepository;

@Service
public class EtudiantService {
	
	@Autowired
	EtudiantJpaRepository ejr;
	
	
	public List<EtudiantJpa> getAll(){
		
		return ejr.findAll();
	}
	
	public void saveEtudiant(EtudiantJpa etudiant) {
		
		ejr.save(etudiant);
	}
	

}
