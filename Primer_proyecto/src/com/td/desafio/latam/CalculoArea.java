package com.td.desafio.latam;

import java.util.Scanner;

public class CalculoArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calculo de area para un triagulo, cuadrado, rectangulo, haciendo metodos y sobrecarga de metodos.
		Scanner sc = new Scanner(System.in);
		Float alto = alto();
		Float largo = largo();
		calculoArea(alto,largo);
		Float ladosFigura = ladosFigura();
		
		ladosFigura();
		alto();
		largo();
		sc.close();
		/*
		do {
			System.out.println("Ingrese valor del Alto");
			alto = sc.nextFloat();
		
		} while (alto < 0) ;
		
		do {
			System.out.println("Ingrese valor del Largo");
			largo = sc.nextFloat();
		
		}while (largo < 0);
		
		area = alto * largo;
		System.out.println("El area de la figura es: " + area);
		*/
		
		
		
	

}
	public static float ladosFigura() {
		Scanner sc = new Scanner(System.in);
		float ladoFiguras=0;
		do {
		System.out.println("Ingrese cantidad de lados de la figura (de 2 a 4)");
		ladoFiguras = sc.nextFloat();
		
	} while (ladoFiguras>=4);
		return ladoFiguras;
	}		
	public static float alto() {
		Scanner sc = new Scanner(System.in);
		float alto = 0;
		do {
			System.out.println("Ingrese valor del Alto");
			alto = sc.nextFloat();
		
		} while (alto < 0) ;
		return alto;
	}
	
	public static float largo() {
		Scanner sc = new Scanner(System.in);
		float largo = 0;
		do {
			System.out.println("Ingrese valor del Largo");
			largo = sc.nextFloat();
		
		}while (largo < 0);
		return largo;
	}
	public static void calculoArea (float alto,float largo) {
		Float area = alto * largo;
		System.out.println("El area de la figura es: " + area);
	}
}
