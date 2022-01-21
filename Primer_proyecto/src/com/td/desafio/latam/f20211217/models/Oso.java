package com.td.desafio.latam.f20211217.models;

public class Oso extends Animal {

	public String tipo;

	public Oso(String tipo) {
		super();
		this.tipo = tipo;
	}

	public Oso() {
		super();
		
	}

	public Oso(String nombre, String raza, String color, Alimento alimento, String tipo) {
		super(nombre, raza, color,alimento);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	
}
