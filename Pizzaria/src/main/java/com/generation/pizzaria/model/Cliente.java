package com.generation.pizzaria.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Não pode ser nulo, ou vazio ")
	@Size(min = 3, max = 25, message="Tamanho incorreto, minimo 3 máximo 25 caracteres" )
	private String nome;
	
	@NotBlank(message = "Não pode ser nulo, ou vazio")
	private String endereco;
	
	@NotBlank(message = "Não pode ser nulo, ou vazio")
	private String telefone;
	
	@NotBlank(message = "Não pode ser nulo, ou vazio")
	@Email(message = "O email precisa ser um email valido")
	private String email; 
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("cliente")
	private List<Pedido> pedidos;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
