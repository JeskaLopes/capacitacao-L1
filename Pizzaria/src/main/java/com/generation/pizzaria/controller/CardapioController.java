package com.generation.pizzaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.generation.pizzaria.model.Cardapio;
import com.generation.pizzaria.model.Cliente;
import com.generation.pizzaria.repository.CardapioRepository;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {
	
	//para tratar o cardápio como objeto e poder manipula-lo
	@Autowired
	private CardapioRepository repository;
	
	//get para trazer todas as informações
	//response entity traz sempre um optional, pode ser qualquer parametro
	@GetMapping
	public ResponseEntity<List<Cardapio>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	//get pelo id
	//mesmo nome do id no getmapping deve ser o passado pela função getById no pathvariable - senão pathvariable(idFulano)
	@GetMapping("/{id}")
	public ResponseEntity<Cardapio> getById(@PathVariable long id){		
		return repository.findById(id).map(cardapio -> ResponseEntity.ok(cardapio))
				.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());		
	}
	
	//get pelo preço
	@GetMapping("/por-preco/{preco}")
	public ResponseEntity<List<Cardapio>> getAllByPreco(@PathVariable double preco) {
		return ResponseEntity.ok(repository.pegarPorPrecoMaiorQue(preco));
	}
	
	//post para inserir itens no cardapio - precisa de requestbody
	@PostMapping
	public ResponseEntity<Cardapio> post(@RequestBody Cardapio cardapio){		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(cardapio));
	}
	
	//metodo de atualização utiliza a mesma função de inserir, porém o jpa verifica se o id é existente ele atualiza, senão ele cria. <3
	@PutMapping
	public ResponseEntity<Cardapio> put(@RequestBody Cardapio cardapio){		
		return ResponseEntity.status(HttpStatus.OK)
				.body(repository.save(cardapio));
	}
	
	//metodo de delete
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
