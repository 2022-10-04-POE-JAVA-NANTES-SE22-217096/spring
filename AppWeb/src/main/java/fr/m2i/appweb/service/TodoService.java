package fr.m2i.appweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import fr.m2i.appweb.model.Todo;

@Service
@SessionScope
public class TodoService {
	
	List<Todo> todos;
	
	
	public TodoService(){
		
		todos = new ArrayList<Todo>();
		
	}
	
	
	
	public void addTodo(String nom, String description) {
		
		Todo todo = new Todo();
		
		
		
		todo.setNom(nom);
		todo.setDescription(description);
		
		todos.add(todo);
		
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	public List<Todo> getTodos(){
		return todos;
	}
	
	
	

}
