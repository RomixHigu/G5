package com.td.desafio.latam.f20220117.models;

public class Ciudad {
	private String nombre;
	private String region;
	
	public Ciudad() {
		super();
	}
	public Ciudad(String nombre, String region) {
		super();
		this.nombre = nombre;
		this.region = region;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	
}
