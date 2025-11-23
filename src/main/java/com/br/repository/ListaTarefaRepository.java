package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.model.ListaTarefa;

@Repository
public interface ListaTarefaRepository extends JpaRepository<ListaTarefa, Long> {
	
}
