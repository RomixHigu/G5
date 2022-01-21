package com.td.desafio.latam.f20211222.models;

public class Oftalmologo extends Medico {
	
	private String especialidad;

	public Oftalmologo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oftalmologo(String nombre, String rut, int edad, String especialidad) {
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
		System.out.println("Oftalmologia: Diagnostica y trata las enfermedades del ojo.");
	}
}
