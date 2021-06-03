package com.generation.pizzaria.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_pedidos")

public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	//sempre quando um objeto tem o outrp, pra evitar recursividade
	@JsonIgnoreProperties("pedidos")
	private Cliente cliente;
	
	@OneToMany(mappedBy ="pedido", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("pedido")
	private List<Cardapio> cardapio;
	
	@CreatedDate
	private LocalDateTime horarioPedido;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cardapio> getCardapio() {
		return cardapio;
	}
	public void setCardapio(List<Cardapio> cardapio) {
		this.cardapio = cardapio;
	}

}
