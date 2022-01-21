package com.td.desafio.latam;

import java.util.Scanner;

public class CuentaRegresiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int segundo =0;

		
			System.out.println("Ingrese un numero");
			do {

			try {
				numero = sc.nextInt();
			} catch (Exception e) {
				System.out.println(" error -> " + e);
			}
			
			for (int i = numero; i > 0; i--) {
				System.out.println("segundo " + i);
			} 
			}while (segundo >=0);
			
		
	
		

		/*
		 * }finally { System.out.println("Fin del programa");
		 * 
		 * 
		 * /* for(int i=5;i>0;i--) { System.out.println("segundo "+i); }
		 */
		/*
		 * for (int i = numero;i > 0; i--) { System.out.println("segundo " + i); }
		 * 
		 */
	
		
}
}