package com.hqs.livraria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_livraria")
public class Livraria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message="Não pode ser nulo ou vazio")
	@Size(min = 3, max = 25, message = "Tamanho incorreto, minimo 3 e maximo de 25 caracteres")
	private String titulo;
	
	
}
