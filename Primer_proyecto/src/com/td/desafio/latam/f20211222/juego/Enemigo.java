package com.td.desafio.latam.f20211222.juego;

public class Enemigo implements Personaje, Jugador{

	private int xActual;
	
	@Override
	public void mover(int x) {
		while(xActual<x) {
			xActual++;
		}
		
	}

	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejecutarAccion(String accion) {
		// TODO Auto-generated method stub
		
	}

}
