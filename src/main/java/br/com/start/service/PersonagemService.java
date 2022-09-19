package br.com.start.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.start.model.Personagem;
import br.com.start.model.dto.PersonagemEntradaDto;
import br.com.start.model.dto.PersonagemSaidaDto;
import br.com.start.repository.PersonagemRepository;


@Service
public class PersonagemService {
	@Autowired
	private PersonagemRepository repository;
	
	@Autowired
	private ModelMapper mapper;
	
	public Personagem salvar(Personagem personagem) {        
        Personagem PersonagemBanco = repository.save(personagem);        
        return PersonagemBanco;
    }

	public boolean alterar(Integer id, PersonagemEntradaDto entradaDto) {        
       Optional<Personagem> optional = repository.findById(id);
       
       if(optional.isEmpty()) {
           return false;
       }
       
       Personagem personagemBanco =  optional.get(); 
       mapper.map(entradaDto, personagemBanco);

       repository.save(personagemBanco);
       
       return true;
   }
	public Personagem pegarUm(Integer id) {
        Optional<Personagem> optional = repository.findById(id);
        
        if(optional.isEmpty())
            return null;
        return optional.get();
   }
	public boolean excluir(Integer id) {
        Optional<Personagem> optional = repository.findById(id);        
        if(optional.isEmpty())
            return false;
        repository.deleteById(id);
        return true;
	}

	public List<PersonagemSaidaDto> listar() {
        List<Personagem> personagem = repository.findAll();
        
        List<PersonagemSaidaDto> saidasDtos = mapper.map(personagem, new TypeToken<List<PersonagemSaidaDto>>() {}.getType());
        
        return saidasDtos;
    }
	
}
