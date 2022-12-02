package fr.m2i.appweb.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.m2i.appweb.model.Todo;

@RestController
@RequestMapping(path="/correctionapi")
public class CorrectionApi {
	
	
	@GetMapping(
			path="/todos"
			)
	public List<Todo> getTodos(){
		List<Todo> todos = new ArrayList<>();
		
		todos.add(new Todo("Exemple1", "du blabla"));
		todos.add(new Todo("Exemple2", "du blabla"));
	
		
		return todos;
	}

}
