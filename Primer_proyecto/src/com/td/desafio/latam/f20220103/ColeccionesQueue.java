package com.td.desafio.latam.f20220103;

import java.util.LinkedList;
import java.util.Queue;

public class ColeccionesQueue {

	public static void main(String[] args) {
		
		//Cola de elementos (en espera)
		Queue<Object> continentes = new LinkedList<>();
		//Agregar elementos a la cola
		continentes.add("Africa");
		continentes.add("America");
		continentes.add("Europa");
		continentes.add("Oceania");
		continentes.add("Asia");
		continentes.add("Antartica");
		System.out.println(continentes.remove("Antartica"));
		System.out.println(continentes);
		
		//Eliminar el encabezado de la cola
		System.out.println(continentes.poll());
		System.out.println(continentes);
		//Obtener encabezado sin eliminarlo
		System.out.println("peek: "+continentes.peek());
		System.out.println(continentes);
		//Encontrar elemento sin eliminarlo
		System.out.println("elemento: "+continentes.element());
		System.out.println(continentes);
		//Numero de elementos en cola
		System.out.println(continentes.size());
	}

}
