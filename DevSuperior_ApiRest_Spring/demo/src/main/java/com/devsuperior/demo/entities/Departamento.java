package com.devsuperior.demo.entities;

//entidades
public class Departamento {
	
	private Long id;
	private String name;
	
	public Departamento() {
		
	}
	
	public Departamento(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
