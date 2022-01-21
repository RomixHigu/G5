package cl.desfio.latam;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// LO INTENTE, PERO NO PUDE Y ME RENDI TToTT

		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean error = false;

		try {
			do {
				System.out.println("Ingrese un numero mayor a 0");
				n = sc.nextInt();
			} while (n < 1);
			error = false;
		} catch (Exception e) {
			System.out.println("Error de ingreso");
			error = true;
		}
		if (!error) {

		}
		if (n > 0) {

		}
		System.out.println("Patron 1");
		System.out.println();

		for (int k = 1; k <= n; k++) {
			for (int k2 = 1; k2 <= n; k2++) {
				if (k == 1 || k == n || k2 == 1 || k2 == n) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}

			}
			System.out.println();
		}
		System.out.println("Patron 2");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1) {
					System.out.printf("*");
				} else {

					if (j == (n - 1) - i) {
						System.out.printf("*");
					} else {
						System.out.printf(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println("Patron 3");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.printf("x");
				} else if (j == (n - 1) - i) {
					System.out.printf("x");
				} else {
					System.out.printf(" ");
				}
			}
			System.out.println();

		}
		System.out.println("Patron 4");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (i == 0 || i == n-1 ) {
					System.out.printf("*");
				} else {

					if (j >= 2) {
						System.out.printf("*");
					} else {
						if (j == 0 || j == n) {
							System.out.printf("*");
						} else {
							System.out.printf(" ");
						}
					}
				}

			}
			System.out.println();
		}

		sc.close();
	}

}