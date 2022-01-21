package com.td.desafio.latam.f20211222.juego;

public class Protagonista implements Personaje, Jugador, Resultado {

	private int xActual;
	private int yActual=1;
	
	@Override
	public void mover(int x) {
		
		xActual = xActual + x;
	}

	@Override
	public void saltar() {
		while(yActual < 5) {
			yActual++;
		}
		while(yActual > 1) {
			yActual--;
		}
		
	}

	@Override
	public void ejecutarAccion(String accion) {
		if (accion.equalsIgnoreCase("saltar") && yActual == 1) {
			saltar();
		}else if (accion.equalsIgnoreCase("avanzar")) {
			mover(2);
			System.out.println("Haz avanzado");
		}else if (accion.equalsIgnoreCase("ganar")) {
			ganar(100);
		}
		
	}

	@Override
	public void ganar(int pasos) {
		if (pasos >= 100) {
			System.out.println("Haz ganado");
		}
		
	}

}
