package com.td.desafio.latam.f20220103.models;

import java.util.LinkedList;
import java.util.Queue;

public class EjercicioQueue {

	public static void main(String[] args) {
		Queue<Object> clientes = new LinkedList<>();
		clientes.add("Armando Casas");
		clientes.add("Pedro del Campo");
		clientes.add("Silvana Susana");
		clientes.add("Natalia Ivanovic");
		clientes.add("Roger Federer");
		clientes.add("Dominic Toretto");
		
		clientes.remove("Roger Federer");
		
		System.out.println(clientes);
		System.out.println(clientes.size());
	}

}
