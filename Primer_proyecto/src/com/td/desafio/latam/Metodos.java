package com.td.desafio.latam;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese numero");
		int numero = sc.nextInt();
		
		System.out.println(esPar(numero));
	/*	
		if(esPar(numero)) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		*/
		// TODO Auto-generated method stub
			
		}
	public static String esPar (int numero) {
		if(numero%2==0) {
		return "El numero es par";
	}else {
		return "El numero es impar";
	}
		
	}
}
