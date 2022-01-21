package c.desafio.latam;

import java.util.Scanner;

public class SoloPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		int contador = 0;

		try {
			do {
				System.out.println("Ingrese cantidad de pares a mostrar");
				num = sc.nextInt();
			} while (num <= 1);

		} catch (Exception e) {
			System.out.println("Ingrese solo numeros");
		}

		for (i = 0; contador != num; i = i + 2) {

			if (i % 2 == 0) {

				System.out.println(i);
				contador++;

			}

		}
		sc.close();
	}
	
}