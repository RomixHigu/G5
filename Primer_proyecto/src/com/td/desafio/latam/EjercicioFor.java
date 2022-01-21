package com.td.desafio.latam;

import java.util.Scanner;

public class EjercicioFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//solicitar el ingreso de 3 numeros e imprimir la suma total de los 3
		int total = 0; //acumulador
		
		for (int i = 1; i<=3;i++) { //si le asigno valor 0 a i, debo establecer solo una opcion de muestrs, en este caso solo <3.
			System.out.println("Ingrese un numero");
			int numero1 = sc.nextInt();
			
			total = total + numero1;
		}
		System.out.println("La suma total es "+ total);

		}
}
