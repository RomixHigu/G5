package com.td.desafio.latam.f20211227.models;

public abstract class Omnivoro extends Animal {

	public String comidasFavoritas;

	public Omnivoro() {
		super();
	}

	public Omnivoro(String comidaFavorita) {
		super();
		this.comidasFavoritas = comidaFavorita;
	}

	public String getComidaFavorita() {
		return comidasFavoritas;
	}

	public void setComidaFavorita(String comidaFavorita) {
		this.comidasFavoritas = comidaFavorita;
	}

	public void metodoOmnivoro() {
		System.out.println("Metodo Omnivoro");
	}
}
