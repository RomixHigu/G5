package com.desafiolatam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArchivoServicio {

	public ArrayList<Producto> cargardatos() throws IOException {
		BufferedReader br = null;
		ArrayList<Producto> listaProductosExportados = new ArrayList<Producto>();
		String linea = " ";

		Scanner sc = new Scanner(System.in);
		String ruta = ("src/com/desafiolatam");

		System.out.println("Cargar Datos");
		System.out.println("Ingresa la ruta donde se encuentra el archivo ProductosImportados.csv");
		String ruta2 = sc.next();
		System.out.println("");

		if (!ruta2.equals(ruta)) {
			System.out.println("La ruta ingresada no existe!");
		} else {
			try {
				FileReader archivo = new FileReader("src/com/desafiolatam/ProductosImportados.csv");
				br = new BufferedReader(archivo);

				linea = br.readLine();
				while (linea != null) {
					ArrayList<String> productoDesglose = new ArrayList<String>(Arrays.asList(linea.split(",")));
					Producto productoT = new Producto(productoDesglose.get(0), productoDesglose.get(1),
							productoDesglose.get(2), productoDesglose.get(3), productoDesglose.get(4),
							productoDesglose.get(5), productoDesglose.get(6));

					linea = br.readLine();
					listaProductosExportados.add(productoT);
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(listaProductosExportados);
			br.close();
			System.out.println("-- Datos cargados correctamente en la lista --");
		}
		return listaProductosExportados;
	}

}
