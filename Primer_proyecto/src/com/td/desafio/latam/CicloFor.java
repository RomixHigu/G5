package com.td.desafio.latam;

import java.util.Scanner;

public class CicloFor {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		/**
		 * FOR
		 **/
		
		/*Realizar la tabla de multiplicar de 2 a 5*/
		
		/*
		int dos = 0;
		int tres = 0;
		int cuatro = 0;
		int cinco = 0;
		*/
		
		/*
		for (int i = 0;i <=10;i= i+1) {
			System.out.println("2 x " + i + " = " +(2*i));			
		}
		
		for (int i = 0;i <=10;i= i+1) {
			System.out.println("3 x " + i + " = " +(3*i));
			
		}
		for (int i = 0;i <=10;i= i+1) {
			System.out.println("4 x " + i + " = " +(4*i));
			
		}
		for (int i = 0;i <=10;i= i+1) {
			System.out.println("5 x " + i + " = " +(5*i));
			
		}
		*/
		
		System.out.println("Ingres el numero de la tabla a mostrar: ");
		int numero = sc.nextInt();
		for (int i = 0;i <=10;i= i+1) {
			System.out.println(numero+" x " + i + " = " +(numero*i));			
		}
		

	}

}
