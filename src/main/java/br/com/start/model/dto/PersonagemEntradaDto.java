package br.com.start.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonagemEntradaDto {

	
	private String nome;
	private String classe;
	private String arma;
	private Integer vida;
	private Integer ataque;
	private Integer defesa;
	
}
