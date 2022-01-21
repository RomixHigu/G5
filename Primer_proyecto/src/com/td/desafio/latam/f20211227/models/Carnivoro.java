package com.td.desafio.latam.f20211227.models;

import java.util.List;

public abstract class Carnivoro extends Animal {

	public List<String>carnesFavoritas;

	public List<String> getCarnesFavoritas() {
		return carnesFavoritas;
	}

	public void setCarnesFavoritas(List<String> carnesFavoritas) {
		this.carnesFavoritas = carnesFavoritas;
	}
	
	public void metodoCarnivoro () {
		System.out.println("Metodo Carnivoro");
	}
}
