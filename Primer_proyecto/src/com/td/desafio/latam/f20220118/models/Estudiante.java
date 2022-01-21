package com.td.desafio.latam.f20220118.models;

public class Estudiante {
	private String nombre;
	private String apellido;
	
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Estudiante: Nombre=" + nombre + ", Apellido=" + apellido;
	}
	
	

}
