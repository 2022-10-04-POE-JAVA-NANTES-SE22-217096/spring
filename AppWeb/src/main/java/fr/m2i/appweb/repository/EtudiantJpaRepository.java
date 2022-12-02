package fr.m2i.appweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.m2i.appweb.model.EtudiantJpa;


@Repository
public interface EtudiantJpaRepository extends JpaRepository<EtudiantJpa, Long>  { //CrudRepository
	
	//Automatise les find, findAll, read, query, count et get et recherche après le By
	
	
}
