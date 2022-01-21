package com.td.desafio.latam.f20211217.models;

public class Botella {

	private String tipoBotella;
	private String marca;
	
	public Botella() {
		super();
	}
	public Botella(String tipoBotella, String marca) {
		super();
		this.tipoBotella = tipoBotella;
		this.marca = marca;
	}
	public String getTipoBotella() {
		return tipoBotella;
	}
	public void setTipoBotella(String tipoBotella) {
		this.tipoBotella = tipoBotella;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
