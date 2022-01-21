package com.td.desafio.latam.f20211227.models;

import com.td.desafio.latam.f20211227.interfaces.Genericos;

public class Leon extends Carnivoro implements Genericos {

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
		System.out.println("Camina en 4 extremidades");
		return 4;
	}

	@Override
	public int correr() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
