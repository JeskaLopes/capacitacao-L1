package com.generation.pizzaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.generation.pizzaria.model.Cardapio;


@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, Long>{
	
	//TODO Implementar alguns metogos de consulta personalizada (Methods Query ou Query Annotations) e chamar no repository
	
	//public List<Cardapio> findAllByPrecoContaining(double preco);
	
	//Query Annotation para pegar preços maiores ou iguais ordenados do maior para o menor
	@Query(value = "select * from tb_cardapio where preco >= :preco ORDER BY preco DESC", nativeQuery = true)
	public List<Cardapio> pegarPorPrecoMaiorQue(@Param("preco") double preco);
	
	//TODO fazer o get pelo sabor
	
}
