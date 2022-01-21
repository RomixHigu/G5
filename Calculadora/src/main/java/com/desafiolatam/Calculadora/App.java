package com.desafiolatam.Calculadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Modelo.Datos;
import Servicio.Calculadora;

public class App {

	public static void main(String[] args) {
		Datos datos = new Datos();
		Calculadora calculadora = new Calculadora();
		Scanner sc = new Scanner(System.in);		
		int opcion = 0;
		
		menu();		
		System.out.println("Ingrese la opcion de la operacion a realizar");
		opcion = sc.nextInt();

		if (opcion != 0) {
			System.out.println("Ingrese valor 1");
			int numero1 = sc.nextInt();	
			datos.setNumero1(numero1);
			System.out.println("Ingrese valor 2");
			int numero2 = sc.nextInt();
			datos.setNumero2(numero2);			
			
			switch (opcion) {
			case 1:
				System.out.println(calculadora.sumar(datos));
				
				break;

			}
			switch (opcion) {
			case 2:
				System.out.println(calculadora.restar(datos));
				break;
			}
			switch (opcion) {
			case 3:
				System.out.println(calculadora.multiplicar(datos));
				break;
			}
			switch (opcion) {
			case 4:
				System.out.println(calculadora.dividir(datos));
				break;
			
			}
		}
	}
	public static void menu() {
		System.out.println("*** CALCULADORA ***");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplcar");
		System.out.println("4. Dividir");
		
		
 }
	
}
