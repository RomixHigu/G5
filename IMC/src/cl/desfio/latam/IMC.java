package cl.desfio.latam;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		edad();
		Float estatura = estatura();
		Float kilos = kilos();
		calculoIMC (kilos, estatura);

		System.out.println(kilos + " - " + estatura);

		sc.close();
	}

	public static int edad() {
		Scanner sc = new Scanner(System.in);
		Integer edad = 0;

		do {
			System.out.println("Ingrese su edad");
			edad = sc.nextInt();
		} while (edad < 18);
		return edad;
	}

	public static Float estatura() {
		Scanner sc = new Scanner(System.in);
		Float estatura = 0f;

		do {
			System.out.println("Ingrese estatura en metros");
			estatura = sc.nextFloat();
		} while (estatura < 0.5);
		return estatura;
	}

	public static Float kilos() {
		Scanner sc = new Scanner(System.in);
		Float kilos = 0f;
		do {
			System.out.println("Ingrese peso en kilogramos");
			kilos = sc.nextFloat();
		} while (kilos <= 1);

		return kilos;
	}

	public static void calculoIMC(float estatura, float kilos) {
		Float iMC = kilos / (estatura * estatura);

		if (iMC < 18.5) {
			System.out.println("Bajo peso");
		} else if (iMC >= 18.5 && iMC < 25) {
			System.out.println("Normal");
		} else if (iMC >= 25 && iMC < 30) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obeso");
		}

	}
}