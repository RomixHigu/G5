package com.td.desafio.latam.f20211227.models;

public abstract class Animal {
	
	public float altura;
	public float peso;
	
	public Animal() {
		super();
	}

	public Animal(float altura, float peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public abstract void metodoAnimal();
	
	
}
