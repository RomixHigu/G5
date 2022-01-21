package com.td.desafio.latam.f20211213;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Archivos {

	public static void main(String[] args) {
		
		crearFichero();
		/*Scanner sc = new Scanner (System.in);	
		
		System.out.println("Ingrese el nombre de la carpeta a crear");
		String nombreCarpeta = sc.next();
		String rutaBase = "src/com/td/desafio/latam/";
		
		// ruta de mi carpeta
		File carpeta = new File(rutaBase+nombreCarpeta);
		if (!carpeta.exists()) {
			carpeta.mkdir();
		}
		
		
		try {
			File archivo = new File (rutaBase+nombreCarpeta+"/index.html");
			archivo.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Fin File");
	*/
	}
		
	public static void crearFichero () {
	Scanner sc = new Scanner (System.in);
	System.out.println("Ingrese el nombre de la carpeta o fichero a crear");
	String nombreCarpeta = sc.next();
	System.out.println("Ingrese el nombre de la ruta o directorio");
	String nombreRuta = sc.next();
	
	File nuevaCarpeta = new File("src/"+nombreRuta+"/"+nombreCarpeta);
	if (!nuevaCarpeta.exists()) {
		nuevaCarpeta.mkdir();
	}
		
	try {
		File archivo = new File ("src/"+nombreRuta+"/"+nombreCarpeta+"/index.html");
		archivo.createNewFile();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	System.out.println("Directorio creado con exito!");
}
}
