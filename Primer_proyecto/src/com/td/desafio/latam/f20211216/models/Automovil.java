package com.td.desafio.latam.f20211216.models;

public class Automovil {
	//atributos
	private String color;
	private Double altura;
	private Double ancho;
	private String tipoMaterial;
	
	public Automovil() {
		super();
	
	}
	
	public Automovil(String color, Double altura, Double ancho, String tipoMaterial) {
		super();
		this.color = color;
		this.altura = altura;
		this.ancho = ancho;
		this.tipoMaterial = tipoMaterial;
	}

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	@Override
	public String toString() {
		return "Automovil [color=" + color + ", altura=" + altura + ", ancho=" + ancho + ", tipoMaterial="
				+ tipoMaterial + "]";
	}
	
	
	
}
