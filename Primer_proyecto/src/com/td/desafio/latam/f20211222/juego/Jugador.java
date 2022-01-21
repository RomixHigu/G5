package com.td.desafio.latam.f20211222.juego;

public interface Jugador extends Personaje {
	//definicion
	void saltar();
	void ejecutarAccion(String accion);
	//NO TIENE CONSTRUCTOR
	//NO SE EXTIENDE, SOLO SE IMLPEMENTA
	//NO TIENEN ATRIBUTOS
}
