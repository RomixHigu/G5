package com.desafiolatam.f20211214;

import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la palabra");
		String palabra = sc.nextLine();
		
		//llamado al metodo
		ejecutar();
		ejecutarConParametros("esto es un texto",547);
		//llamado con retorno
		System.out.println(metodoConRetorno());
		String retorno = metodoConRetorno();
		System.out.println(retorno);

	}
	public static void ejecutar() {
		System.out.println("Metodo ejecutar");
		
	}
	public static void ejecutarConParametros (String texto, Integer numero) {
		System.out.println(texto.length());	
		System.out.println(numero.toString());
	}
	public static String metodoConRetorno () {
		String retorno = "esto es un parametro de retorno";
		return retorno;
	}
}
