package com.td.desafio.latam;

import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		/**
		 * WHILE
		 */
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int edad = 0;

		System.out.println("Ingrese edad");
		edad = sc.nextInt();

		while (edad >= 18) { // termina cuando la condicion es falsa
			System.out.println("Dentro del while");
			contador = contador + 1;

			if (contador == 5) {
				edad = 0;
			}
		}
		System.out.println("Fuera del while");

		sc.close();
	}
}