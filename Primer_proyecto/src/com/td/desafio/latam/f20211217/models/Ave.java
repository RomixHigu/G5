package com.td.desafio.latam.f20211217.models;

public class Ave extends Animal {

	public Ave() {
		super();
		
	}

	public Ave(String nombre, String raza, String color, Alimento alimento) {
		super(nombre, raza, color, alimento);
		
	}

	@Override
	public String toString() {
		return "Ave [getNombre()=" + getNombre() + ", getRaza()=" + getRaza() + ", getColor()=" + getColor()
				+ ", getAlimento()=" + getAlimento() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
}
