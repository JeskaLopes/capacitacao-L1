package com.generation.pizzaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.pizzaria.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	/**
	 * Através do MethodQuery podemos criar metodos abstrados ("sem corpo") para fazer
	 * nossas consultas
	 * 
	 * Atente-se ao retorno do metodo Ex List<Cliente>
	 * Se precisamos de uma lista precisamos informar que o retorno deve trazer uma lista,
	 * seja ela vazia ou não 
	 * Como nesse caso vamos pegar por nome, ele deve trazer todos os clientes com o nome pesquisado
	 * 
	 * Mais informações
	 * 
	 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	 * 
	 */
		public List<Cliente> findAllByNomeContainingIgnoreCase(String nome);
		
		/**
		 * Através do query Anotations podemos executar quelquer query nativa do banco
		 * de dados Sempre quando precisar passar um parametro para a query ex: idade
		 * usar o @Param("idade")
		 * Ao usar na query, indicar o parametro por : para ele entender que é um parametro 
		 *
		 * 
		 * Mais informações
		 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query
		 * 
		 */
		public List<Cliente> findAllByEmailContainingIgnoreCase(String email);
		
		
		@Query(value = "select * from tb_cliente where email LIKE '%:email%';", nativeQuery = true)
		public List<Cliente> pegarPorEmail(@Param("email") String email);
	
}
