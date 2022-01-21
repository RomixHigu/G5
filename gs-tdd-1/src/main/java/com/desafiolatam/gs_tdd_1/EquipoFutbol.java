package com.desafiolatam.gs_tdd_1;

public class EquipoFutbol {
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosEmpatados;

	
	

	public EquipoFutbol(int partidosGanados, int partidosPerdidos, int partidosEmpatados) {
		super();
		this.partidosGanados = partidosGanados;
		this.partidosPerdidos = partidosPerdidos;
		this.partidosEmpatados = partidosEmpatados;
	}


	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}


	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}


	public int getPartidosGanados() {
		return partidosGanados;
	}
}
