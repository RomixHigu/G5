package com.td.desafio.latam.f20211227.models;

import java.util.List;

public abstract class Herbivoro extends Animal {

	public List<String> vegetalesFavoritos;

	public Herbivoro() {
		super();
	}

	public Herbivoro(List<String> vegetalesFavoritos) {
		super();
		this.vegetalesFavoritos = vegetalesFavoritos;
	}

	public List<String> getVegetalesFavoritos() {
		return vegetalesFavoritos;
	}

	public void setVegetalesFavoritos(List<String> vegetalesFavoritos) {
		this.vegetalesFavoritos = vegetalesFavoritos;
	}
	
	
}
