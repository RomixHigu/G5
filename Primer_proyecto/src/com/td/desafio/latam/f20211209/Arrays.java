package com.td.desafio.latam.f20211209;

public class Arrays {

	public static void main(String[] args) {
		// Conjunto de datos ordenados segun su orden de ingreso,
		// separados por coma
		// Todos comienzan en la posicion cero
		// (length) en todos podemos obtener el tamanio, cantidad de elementos

		int[] sinNumeros = {};// cero
		System.out.println(sinNumeros.length);
		String[] vocales = { "a", "e", "i", "o", "u" };
		System.out.println(vocales.length);

		// int[] numerosPares = {2,4,6,8,10};
		int[] numerosPares = new int[20]; // arreglo estatico de tamanio 5
		System.out.println(numerosPares.length);

		String[] alumnos = new String[10]; // {"Romina", "Soledad","Andres"};
		System.out.println(alumnos); 

		// Recorriendo arreglos

		for (int i = 0; i < vocales.length; i++) {
			// valor i (indice o posicion)
			System.out.printf("valor de i %d ", i);
			// acceder a cada elemento, uno por uno
			System.out.println("elemento " + vocales[i]);

		}
		// aceso individual
		System.out.println("** Elemento vocales [posicion 0] " + vocales[0]);
		System.out.println("** Elemento vocales [posicion 3] " + vocales[3]);
	}

}
