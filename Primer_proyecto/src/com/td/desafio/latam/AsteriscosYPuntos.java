package com.td.desafio.latam;

import java.util.Scanner;

public class AsteriscosYPuntos {

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
				for (int i = 1; i <= cantidad; i++) {
					if(i%2==0) {
						caracter += ".";
					}else {
						caracter += "*";
					}
					
					System.out.println(caracter);
				}
				System.out.println("fuera" + caracter);
			} else {
				System.out.println("Error ingreso");
			}
			
			

			sc.close();
	}

}
