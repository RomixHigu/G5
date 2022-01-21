package cl.desafio.latam;

import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("______________________");
		System.out.println("");
		System.out.println("Calculando resistencia");
		System.out.println("______________________");

		System.out.println("Ingrese resistencia 1:");
		float r1 = sc.nextFloat();
		System.out.println("Ingrese resistencia 2:");
		float r2 = sc.nextFloat();
		System.out.println("Ingrese resistencia 3:");
		float r3 = sc.nextFloat();


 		if (r1 < 0) {
			System.out.println("Ingrese Valor mayor que 0:");

		} else if (r2 < 0) {
			System.out.println("Ingrese Valor mayor que 0");
			sc.nextInt();
		} else if (r3 < 0) {
			System.out.println(" Ingrese Valor mayor que 0 ");

		} else {
			System.out.println(" El valor de la Resistencia Total es de ");
			float rt = 1/((1/r1)+(1/r2)+(1/r3));
			System.out.println(" " + rt);
			
		}
       sc.close();
	} 
}
