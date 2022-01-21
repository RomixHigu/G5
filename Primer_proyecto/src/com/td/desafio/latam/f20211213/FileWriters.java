package com.td.desafio.latam.f20211213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriters {

	public static void main(String[] args) throws IOException {
		escribir();
		leer();
		System.out.println("Agregado con exito");
	}

	public static void leer() throws IOException {
		String rutaBase = "src/com/td/desafio/latam/f20211213";
		File archivo = new File(rutaBase + "/index.txt");
		BufferedReader buffReader = null;
		try {
			FileReader fr = new FileReader(archivo);
			buffReader = new BufferedReader(fr);

			String textoFila = buffReader.readLine();
			while (textoFila != null) {

				System.out.println(textoFila);
				textoFila = buffReader.readLine();
			}
			buffReader.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public static void escribir() {
		Scanner sc = new Scanner(System.in);

		String rutaBase = "src/com/td/desafio/latam/f20211213";

		// ruta de mi carpeta
		File carpeta = new File(rutaBase);
		if (!carpeta.exists()) {
			carpeta.mkdir();
		}

		try {
			File archivo = new File(rutaBase + "/index.txt");
			if (!archivo.exists()) {
				archivo.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(archivo);
			fileWriter.write("Prueba");
			fileWriter.write("\nPrueba2");
			// fileWriter.close();

			BufferedWriter buff = new BufferedWriter(fileWriter);
			buff.write("\nOtro string");

			System.out.println("Ingrese texto");
			String texto = sc.nextLine();
			buff.write("\n" + texto);
			buff.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		sc.close();
	}

}
