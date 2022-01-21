package com.td.desafio.latam.f20211227.models;

import com.td.desafio.latam.f20211227.interfaces.Genericos;

public class Humano extends Omnivoro implements Genericos{
	
	private boolean razonamiento;

	public Humano() {
		super();
	}

	public Humano(boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}

	public boolean isRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	@Override
	public void metodoAnimal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void repirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int caminar() {
		System.out.println("Camina en 2 extremidades");
		return 2;
	}

	@Override
	public int correr() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
