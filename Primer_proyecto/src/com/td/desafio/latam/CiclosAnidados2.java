package com.td.desafio.latam;

import java.util.Scanner;

public class CiclosAnidados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int cantidad = 0;
		boolean error = false;
		//solicitamos el dato
		
	
		
		try { //error controlado
			do {//capturar el dato
				System.out.println("Ingresar la cantidad de veces a mostrar *");
				cantidad = sc.nextInt();
			} while (cantidad < 1);
			error = false;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error de ingreso");
			error = true;
		}
		if (!error)
			//validar el dato, no negativo y mayor a cero
			if (cantidad > 0) {
				//realizar la accion
				String caracter = "";
				for (int i = 0; i <= cantidad; i++) {
					for (int j = 0; j <=i; j++) {
						System.out.printf("*");
					}
					System.out.printf("\n");
				/*		caracter += "*";
						System.out.println(caracter);
						*/
					}
					
					
				
			} else {
				System.out.println("Error ingreso");
			}
			sc.close();
	}

}
