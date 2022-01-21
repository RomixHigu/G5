package com.td.desafio.latam;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("_______________________");
		System.out.println("");
		System.out.println("Envio de encomienda\n");
		System.out.println("_______________________");
		System.out.println("");
		System.out.println("Por favor, ingrese los datos del destinatario:\n");
		System.out.println("Nombre:");
		String nombre = sc.next();
		System.out.println("Apellido:");
		String apellido = sc.next();
		System.out.println("Direccion:");
		String direccion = sc.next();
		System.out.println("Numero:");
		Integer numero = sc.nextInt();
		System.out.println("Ciudad:");
		String ciudad = sc.next();
		System.out.println("Telefono:");
		String telefono = sc.next();
		System.out.println("");
		
		System.out.println("***************");
		System.out.println("Los datos del destinatario son:");
		System.out.println("");
		System.out.println("Nombre completo: "+nombre+" "+apellido);
		System.out.println("Direccion: "+direccion+" "+numero);
		System.out.println("Ciudad: "+ciudad);
		System.out.println("Telefono: "+telefono);
		System.out.println("***************");
		System.out.println("");

	}

}
