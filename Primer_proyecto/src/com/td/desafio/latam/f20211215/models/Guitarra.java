package com.td.desafio.latam.f20211215.models;

public class Guitarra {
	//atributos
	private String tipoMastil;
	private String marca;
	
	//constructor vacio
	public Guitarra() {
		super();
	}
	
	//constructor con parametros o atributos
	public Guitarra(String tipoMastil, String marca) {
		super();
		this.tipoMastil = tipoMastil;
		this.marca = marca;
	}
	// get and set parametros
	public String getTipoMastil() {
		return tipoMastil;
	}
	public void setTipoMastil(String tipoMastil) {
		this.tipoMastil = tipoMastil;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	//to string
	@Override
	public String toString() {
		return "Guitarra [tipoMastil=" + tipoMastil + ", marca=" + marca + "]";
	}
	
}
