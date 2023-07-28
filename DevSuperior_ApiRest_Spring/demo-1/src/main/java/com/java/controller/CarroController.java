package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.Carro;
import com.java.repository.CarroRepository;

@RestController
@RequestMapping
public class CarroController {

	// injeção
	@Autowired
	CarroRepository carroRepository;

	// buscar info
	@GetMapping("/carro")
	public List<Carro> getAllCarros() {
		return carroRepository.findAll();
	}
	
	//buscar info especifica
	@GetMapping("/carro/{id}")
	public Carro getCarroById(@PathVariable Long id) {
		return carroRepository.findById(id).get();
	}
	// enviar info, postar
	@PostMapping("/carro")
	@ResponseStatus(HttpStatus.CREATED)
	public Carro setCarro(@RequestBody Carro carro) {
		return carroRepository.save(carro);
	}
	
	
	@DeleteMapping("/carro/{id}")
	public void deleteCarro (@PathVariable Long id) {
		carroRepository.deleteById(id);
	}
}
