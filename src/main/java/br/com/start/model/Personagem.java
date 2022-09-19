package br.com.start.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name="personagem")

public class Personagem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //gerar id automatico
	private Integer id;
	
	private String nome;
	private String classe;
	private String arma;
	private Integer vida;
	private Integer ataque;
	private Integer defesa;
	
}
