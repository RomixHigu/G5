package cl.desfio.latam;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;
		boolean error = false;
		String caracter = "";
		String caracter2 = "";
		int contador = 0;
		int j = 0;
		int patron = 0;
		int i = 0;

		try {
			do {
				System.out.println("Ingresar la cantidad de caracteres a mostrar");
				cantidad = sc.nextInt();
			} while (cantidad < 1);
			error = false;
		} catch (Exception e) {
			System.out.println("Error de ingreso");
			error = true;
		}
		if (!error)
			if (cantidad > 0) {

				for (i = 1; i <= cantidad; i++) {
					if (i % 2 == 0) {
						caracter += ".";
					} else {
						caracter += "*";
					}
				}
				System.out.println(caracter);
			}
		do {
			if (cantidad > 0) {
				for (i = 1; i <= cantidad; i++) {
					contador = contador + 1;
					for (j = 1; j <= 4; j++) {
						System.out.printf("" + j);
						contador = contador + 1;
						patron = patron + cantidad;
					}
				}
			}
		} while (contador == cantidad);

		System.out.println();

		if (cantidad > 0) {

			for (int j2 = 1; j2 <= cantidad; j2++) {
				if (j2 % 2 == 0) {
					caracter2 += "*";
				} else {
					caracter2 += "||";
				}
			}
			System.out.println(caracter2);
		}
		sc.close();
		
	}

}
