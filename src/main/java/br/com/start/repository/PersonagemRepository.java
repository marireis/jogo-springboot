package br.com.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.start.model.Personagem;

public interface PersonagemRepository extends JpaRepository <Personagem, Integer>{
	
	

}
