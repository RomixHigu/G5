package com.td.desafio.latam.f20211217.models;

public class Botilleria {

	private Cerveza cerveza;
	private String nombre;
	
	public Botilleria(Cerveza cerveza, String nombre) {
		super();
		this.cerveza = cerveza;
		this.nombre = nombre;
	}
	public Cerveza getCerveza() {
		return cerveza;
	}
	public void setCerveza(Cerveza cerveza) {
		this.cerveza = cerveza;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
