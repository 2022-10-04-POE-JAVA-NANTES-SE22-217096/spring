package fr.m2i.appweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.m2i.appweb.model.Todo;
import fr.m2i.appweb.service.TodoService;

@Controller
@RequestMapping(path="/todo")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	
	
	@GetMapping(path="/todo")
	public String getTodo(Model model, @ModelAttribute Todo todo){
		
		
		model.addAttribute("todos", todoService.getTodos());
		
		return "/todo/todo";
	}
	
	@PostMapping(path="/todo")
	public String postTodo(Model model, @ModelAttribute Todo todo){
		
		
		todoService.addTodo(todo);
		model.addAttribute("todos", todoService.getTodos());
		
		
		return "/todo/todo";
	}

}
