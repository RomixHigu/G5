package com.td.desafio.latam;

import java.util.Scanner;

public class SumaPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sumaTotal =0;
		
		System.out.println("Ingrese numero");
		int numerofin = sc.nextInt();
		
		
		for (int i =1; i <= numerofin; i++) {
			if (i%2!=0) {
			sumaTotal = sumaTotal+ i;
		}
		}
		System.out.println("La suma de los impares es " + sumaTotal);

		sc.close();
}
}