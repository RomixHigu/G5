package com.td.desafio.latam.f20211213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EscrituraYLectura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String carpeta = "";
		String fichero = "";
		String ruta = ("src/com/td/desafio/latam/");

		System.out.println("Ingresar nombre de la carpeta");
		carpeta = sc.nextLine();
		File directorio = new File(ruta + "/" + carpeta);

		if (!directorio.exists()) {
			directorio.mkdir();
			System.out.println("Ingresar nombre del fichero");
			fichero = sc.nextLine();
			File archivo = new File(ruta + "/" + carpeta + "/" + fichero + ".txt");
			if (!archivo.exists()) {
				try {
					archivo.createNewFile();
				} catch (IOException e) {

					e.printStackTrace();
				}
				System.out.println("Fichero creado con exito!");
			}

			crearArchivo(archivo);

			System.out.println("Ingrese nombre del fichero que buscar");
			String nombreFichero = sc.nextLine();

			if (nombreFichero.equals(fichero)) {
				System.out.println("Ingrese palabra a buscar");
				String texto = sc.nextLine();

				buscarTexto(archivo, texto);

			} else {
				System.out.println("El fichero ingresado no existe");
			}
		} else {
			System.out.println("Error al crear directorio");

		}
		sc.close();
	}

	public static void crearArchivo(File archivo) {

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Perro");
		lista.add("Gato");
		lista.add("Juan");
		lista.add("Daniel");
		lista.add("Juan");
		lista.add("Gato");
		lista.add("Perro");
		lista.add("Camila");
		lista.add("Daniel");
		lista.add("Camila");

		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(archivo);
			BufferedWriter buff = new BufferedWriter(fileWriter);
			for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
				String elemento = (String) iterator.next();
				buff.write(elemento);
				buff.newLine();
			}
			buff.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * for (int i = 0; i < lista.size(); i++) { buff.write(lista.get(i));
		 * buff.newLine(); }
		 */
		// ambas formas funcionan

	}

	public static void buscarTexto(File archivo, String texto) {
		int contador = 0;
		
		try {

			FileReader fr = new FileReader(archivo);
			BufferedReader buffR = new BufferedReader(fr);
			String palabra = buffR.readLine();

			while (palabra != null) {
				if (palabra.equalsIgnoreCase(texto)) {

					contador = contador + 1;
				}
				palabra = buffR.readLine();
			}
			buffR.close();
			if (contador == 0) {
				System.out.println("La palabra no existe");
			} else {
				System.out.println(contador);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
