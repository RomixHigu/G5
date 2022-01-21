package com.td.desafio.latam.f20211209;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNumerosPares {

	public static void main(String[] args) {
		agregaElemento();

	}

	public static void agregaElemento() {
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		ArrayList<Integer> numerosImpares = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int opcion = 0;
		do {
			System.out.println("Ingrese un numero");
			numero = sc.nextInt();
			sc.nextLine();
			if (numero % 2 == 0) {
				numerosPares.add(numero);
				System.out.println(numerosPares);
				// for (int i = 0; i < numerosPares.length; i++) {
			}else {
				numerosImpares.add(numero);
			}
			System.out.println("Desea ingresar otro numero?");
			System.out.println("(0) NO - (1) SI ");
			opcion = sc.nextInt();
			sc.nextLine();

		} while (opcion == 1);
		System.out.println("Numeros Pares: "+ numerosPares);
		System.out.println("Numeros Impares: " +numerosImpares);

		sc.close();
	}

}
