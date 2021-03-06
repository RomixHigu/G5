package com.desafiolatam.gs_tdd_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class EquipoFutbolTest {
	private static final int CUATRO_JUEGOS_GANADOS = 4;
	private static final int CINCO_JUEGOS_EMPATADOS = 5;
	private static final int TRES_JUEGOS_PERDIDOS = 3;

	@Test
	public void setearJuegosGanados() {
		EquipoFutbol equipo = new EquipoFutbol(CUATRO_JUEGOS_GANADOS,TRES_JUEGOS_PERDIDOS,CINCO_JUEGOS_EMPATADOS);
		assertEquals(CUATRO_JUEGOS_GANADOS,equipo.getPartidosGanados());
		assertEquals(CINCO_JUEGOS_EMPATADOS, equipo.getPartidosEmpatados());
		assertEquals(TRES_JUEGOS_PERDIDOS, equipo.getPartidosPerdidos());
	}
}
