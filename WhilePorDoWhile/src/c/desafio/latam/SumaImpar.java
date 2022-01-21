package c.desafio.latam;

import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sumaTotal =0;
		
		System.out.println("Ingrese numero");
		int n = sc.nextInt();
		
		
		for (int i =1; i <= n; i++) {
			if (i%2!=0) {
			sumaTotal = sumaTotal+ i;
		}
		}
		System.out.println(sumaTotal);

		sc.close();
}
}