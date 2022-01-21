package c.desafio.latam;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int serie = 0;
		int f0 = 0;
		int f1 = 1;
		int suma = 1;

		System.out.println("Ingrese cantidad de elementos de la serie que desea ver");
		// Muestro el valor inicial
		do {
			serie = sc.nextInt();

			System.out.println(f0);

			for (int i = 1; i < serie; i++) {
				if (serie > 0) {
					// muestro la suma
					System.out.println(suma);

					// primero sumamos
					suma = f0 + f1;
					// Despues, cambiamos la segunda variable por la primera
					f0 = f1;
					// Por ultimo, cambiamos la suma por la segunda variable
					f1 = suma;

				} else {
					System.out.println("Ingrese un numero mayor a 0");
				}
			}

		} while (serie <= 0);
		sc.close();
	}
}