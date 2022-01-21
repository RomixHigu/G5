package com.td.desafio.latam.f20211222.models;

public class Neurologo extends Medico {

	private String especialidad;

	public Neurologo() {
		super();

	}

	public Neurologo(String especialidad) {
		super();
		this.especialidad = especialidad;
	}
	

	public Neurologo(String nombre, String rut, int edad, String especialidad) {
		super(nombre, rut, edad);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	@Override
	public void consulta () {
		System.out.println("Neurologia: Diagnostica trastornos de la cognicion y de la conciencia.");
	}
}
