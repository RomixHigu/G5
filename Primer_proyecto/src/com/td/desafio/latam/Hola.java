package com.td.desafio.latam;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		// () parametros o argumentos
		//salidas
		System.out.printf(" o(*U w U*)o\n");
		System.out.println(" Hola Clase!\n");
		
		System.out.println("Bienvenidos a Java");
		System.out.println("Animo!");
		System.out.println("Tu puedes!\n\n");
		
		Scanner sc = new Scanner(System.in);
/*
		System.out.println("Ingrese su nombre");
		String nombre = sc.next();
		System.out.println("Ingrese su edad");
		Integer edad = sc.nextInt();
		
		System.out.println("Hola "+nombre);
		System.out.println("Tu edad es "+edad+", como pasa el tiempo.");
*/		
		String anio = "2021";
		
		String cUno ="1";
		String pUno ="uno";
		Integer iUno = 1;
		int iiUno=1;
		
		boolean verdadero = true;
		Boolean falso = false;
		//1 o 0, verdadero o falso, encendido o apagado
		
		//suma de String (Concatenacion) ""+""
		
		System.out.println("123"+"456");
		System.out.println("dasa"+456);
		//String + numero = String
		//String + boolean = String
		// numero + boolean No se puede hacer
		
		System.out.println(2+3);
		System.out.println(2*3);
		System.out.println(2/3);
		//la division siempre nos retorna un entero
		//casteamos (convertimos)
		Integer division1= 4/3;
		Double division2 = (double) (4/3);
		Float division3 = (float) (6/2);
		Long division4 = (long) (1/2);
		//imprimir el contenido de la variable
		System.out.println("Integer: "+division1);
		System.out.println("Double: "+division2);
		System.out.println("Float: "+division3);
		System.out.println("Long: "+division4);
		System.out.println("4/3 ="+4/3);
		System.out.println("4%3 + "+4%3);
		//dividir un String
		
		String palabra= "paralelepipedo";
		System.out.println(palabra.substring(0, 4));
		System.out.println(palabra.substring(4, 8));
		System.out.println(palabra.substring(8, 12));
		System.out.println(palabra.substring(12));
		
	}


	
//fin
}
