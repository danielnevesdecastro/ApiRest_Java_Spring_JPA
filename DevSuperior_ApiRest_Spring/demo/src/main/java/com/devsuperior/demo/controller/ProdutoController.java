package com.devsuperior.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.entities.Produto;
import com.devsuperior.demo.repository.ProdutoRepository;

//endpoint , caminho da aplicação
//controlador 

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	// serialização , objeto de retorno transformado em JSON
	@GetMapping
	public List<Produto> getObjects() {
		return produtoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Produto setObjects(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	
}
