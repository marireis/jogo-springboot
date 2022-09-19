package br.com.start.controller;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.annotations.common.util.impl.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.start.model.Personagem;
import br.com.start.model.dto.PersonagemEntradaDto;
import br.com.start.model.dto.PersonagemSaidaDto;
import br.com.start.service.PersonagemService;

@RestController
@RequestMapping("personagem")
public class PersonagemController {
	
	@Autowired
	private PersonagemService service;
	
	@PostMapping
	public Personagem salvar(@RequestBody Personagem personagem) {
		return service.salvar(personagem);		
	}
	
	@PutMapping("id/{id}")
    public boolean alterar(@PathVariable("id") Integer id, @RequestBody PersonagemEntradaDto entradaDto) {
        return service.alterar(id,entradaDto);
    }
    
    @GetMapping("id/{id}")
    public Personagem pegarUm(@PathVariable Integer id) {
        return service.pegarUm(id);
    }
    

    @DeleteMapping("id/{id}")
	public boolean excluir(@PathVariable("id") Integer id) {		
		return service.excluir(id);
	}
    
    @GetMapping()
    public List<PersonagemSaidaDto> listar() {
        return service.listar();
    }
    


}
