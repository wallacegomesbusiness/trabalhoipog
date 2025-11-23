package com.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.model.ListaTarefa;
import com.br.repository.ListaTarefaRepository;

// Endereço: http://localhost:8080/listatarefa

@RequestMapping("/listatarefa/")
@RestController
public class ListaTarefaController {
	
	// Criando uma instancia do repositorio JPA Hibernate
	@Autowired
	private ListaTarefaRepository lRep;
	
	@GetMapping("/lista")
	
	@PostMapping("/lista")
	
	@PutMapping("/lista/{id}")
	
	@DeleteMapping("/lista/{id}")
	
	
	
}
