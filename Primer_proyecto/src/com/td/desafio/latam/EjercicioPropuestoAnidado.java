package com.td.desafio.latam;

import java.util.Scanner;

public class EjercicioPropuestoAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;
		boolean error = false;

		try {
			do {
				System.out.println("Ingresar la cantidad de veces a mostrar *");
				cantidad = sc.nextInt();
			} while (cantidad < 1);
			error = false;
		} catch (Exception e) {

			System.out.println("Error de ingreso");
			error = true;
		}
		if (!error)

			if (cantidad > 0) {
				for (int i = 1; i <= cantidad; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.printf("%d", j);
					}

					System.out.printf("\n");
				}

			} else {
				System.out.println("Error ingreso");
			}
		sc.close();
	}

}
