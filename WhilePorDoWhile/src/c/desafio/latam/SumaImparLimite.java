package c.desafio.latam;

import java.util.Scanner;

public class SumaImparLimite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sumaTotal = 0;
		int min =0;
		int max = 0;
		int i = 0;

		System.out.println("Ingrese limite inferior del intervalo (minimo)");
		do {
			min = sc.nextInt();
			System.out.println("Ingrese limite superior del intervalo (maximo)");
			max = sc.nextInt();

			for (i = min; i <= max;i++) {
				if (i % 2 != 0) {
					
					sumaTotal = sumaTotal + i;
					
				} 
			}
			System.out.println(sumaTotal);
		} while (i == min);

		sc.close();
	}

}
