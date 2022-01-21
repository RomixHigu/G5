package com.td.desafio.latam.f20211222.models;

public class Medico {
	private String nombre;
	private String rut;
	private int edad;
	
	public Medico() {
		super();
	}

	public Medico(String nombre, String rut, int edad) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void consulta() {
		System.out.println("Medicina General: Diagnostica, cura, trata, receta y deriva");
	}
}
