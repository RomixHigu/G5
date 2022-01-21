package NuevaClase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class NuevaClase {

	public static void main(String[] args) {
		
		crearMain();

	}
	public static void crearMain() {
		Scanner sc = new Scanner(System.in);			
		Date fecha = new Date ();
		DateFormat nuevoDia = new SimpleDateFormat ("yyyyMMdd");
		String hoy = (nuevoDia.format(fecha));
		
		System.out.println(hoy);
		
		String rutaBase = "src/com/td/desafio/latam/f"+hoy;
		
		File carpeta = new File(rutaBase);
		if (!carpeta.exists()) {
			carpeta.mkdir();
		}

		try {
			File archivo = new File(rutaBase + "/Main.java");
			if (!archivo.exists()) {
				archivo.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(archivo);
			
			BufferedWriter buff = new BufferedWriter(fileWriter);
			buff.write("package com.td.desafio.latam.f"+hoy+";");
			buff.newLine ();
			buff.write("public class Main {");
			buff.newLine ();
			buff.newLine ();
			buff.write("   public static void main(String[] args) {");
			buff.newLine ();
			buff.newLine ();
			buff.write("   }");
			buff.newLine ();
			buff.newLine ();
			buff.write("}");
			
			buff.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		sc.close();
	}
	
}
