package com.generation.pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.pizzaria.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	//TODO Implementar alguns metogos de consulta personalizada (Methods Query ou Query Anotations) e chamar no repository
	
	
	
}
