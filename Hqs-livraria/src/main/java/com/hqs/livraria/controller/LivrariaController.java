package com.hqs.livraria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hq-livraria")

public class LivrariaController {
	
	@GetMapping
	public String hello() {
		return "Alo mundão !!!";
	};
}
