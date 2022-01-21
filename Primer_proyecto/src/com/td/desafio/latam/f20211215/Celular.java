package com.td.desafio.latam.f20211215;

public class Celular {
	String marca;
	String modelo;
	String sistemaOperativo;
	String tamanioPantalla;
	String memoria;
	
		
	public Celular(String marca, String modelo, String sistemaOperativo, String tamanioPantalla, String memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.sistemaOperativo = sistemaOperativo;
		this.tamanioPantalla = tamanioPantalla;
		this.memoria = memoria;
	}

	public Celular() {
		super();
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getTamanioPantalla() {
		return tamanioPantalla;
	}

	public void setTamanioPantalla(String tamanioPantalla) {
		this.tamanioPantalla = tamanioPantalla;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", sistemaOperativo=" + sistemaOperativo
				+ ", tamanioPantalla=" + tamanioPantalla + ", memoria=" + memoria + "]";
	}
	public static void llamar() {
		
	}
		

	public static void grabar () {
		
	}
	
	public static void reproducir() {
		
	}
	}