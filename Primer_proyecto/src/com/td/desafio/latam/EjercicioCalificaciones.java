package com.td.desafio.latam;

import java.util.Scanner;

public class EjercicioCalificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("___________________");
		System.out.println("*Hoja de Calificaciones*");
		System.out.println("___________________");
		System.out.println("");
		System.out.println("Por favor, ingrese los datos del estudiante:");
		System.out.println("");
		
		System.out.println("Nombre completo:");
		String nombre = sc.nextLine();

		System.out.println("Asignatura:");
		String asignatura = sc.nextLine();
		
		System.out.println("Nombre del Docente:");
		String nombreDocente = sc.nextLine();
		Float nota1 = 0f;
		Float nota2 = 0f;
		Float nota3 = 0f;
		Float promedio = 0f;
		
		do {
		System.out.println("Nota 1:");
		nota1 = sc.nextFloat();
		} while(nota1 <= 0 || nota1 >7);
		
		do {
		System.out.println("Nota 2:");
		nota2 = sc.nextFloat(); 
		} while(nota2 <= 0 || nota2 >7);
		
		do {
		System.out.println("Nota 3:");
	    nota3 = sc.nextFloat();
		} while(nota3 <= 0 || nota3 >7);
		
		promedio = ((nota1 + nota2 + nota3)/3);
		
		System.out.println(" ");
		System.out.println("***************");
		System.out.println("");
		System.out.println("Nombre alumno: "+nombre);
		System.out.println("Asignatura: "+asignatura);
		System.out.println("Nombre del Docente: "+nombreDocente);
		System.out.println("Nota 1: "+nota1);
		System.out.println("Nota 2: "+nota2);
		System.out.println("Nota 3: "+nota3);
		System.out.println("Promedio: "+promedio);
		System.out.println("");
		System.out.println("***************");
		System.out.println("");
		
		
		
	}

}
