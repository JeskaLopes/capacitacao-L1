package com.generation.pizzaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_cardapio")
public class Cardapio {
	
	
	/*aqui cria a primary key*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message="Não pode ser nulo ou vazio")
	//size aceita min,max e mensagem
	@Size(min = 3, max = 30, message = "Tamanho incorreto, minimo 3 e maximo de 30 caracteres")
	private String sabor;
	
	@Min(0)
	private double preco;
	
	@NotBlank(message="Não pode ser nulo ou vazio")
	@Size(min = 1, max = 1, message = "Tamanho incorreto, min 1 e maximo 1")
	private String tamanho;
	private boolean bordaRecheada;
	
	@ManyToOne
	@JsonIgnoreProperties("cardapios")
	private Pedido pedido; 
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public boolean isBordaRecheada() {
		return bordaRecheada;
	}
	public void setBordaRecheada(boolean bordaRecheada) {
		this.bordaRecheada = bordaRecheada;
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
