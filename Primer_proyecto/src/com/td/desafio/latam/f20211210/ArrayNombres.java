package com.td.desafio.latam.f20211210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class ArrayNombres {

	public static void main(String[] args) {
		nombres();
	}

	public static void nombres() {
		Scanner sc = new Scanner(System.in);		
		String buscar = "";
		int opcion = 0;	

		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Luis");
		nombres.add("Ana");

		ArrayList<String> nombresBuscados = new ArrayList<String>();
		ArrayList<String> nombresNoEncontrados = new ArrayList<String>();

		nombresNoEncontrados.addAll(nombres);
		do {
			System.out.println("Ingrese nombre a buscar");
			buscar = sc.next();

			for (Iterator iterator = nombresNoEncontrados.iterator(); iterator.hasNext();) {
				String elemento = (String) iterator.next();
				if (elemento.equals(buscar)) {

					nombresBuscados.add(elemento);
					iterator.remove();
					System.out.println("Encontrado " + elemento);
				}
			}

			System.out.println(nombresBuscados);
			System.out.println("Desea consultar otro nombre?");
			System.out.println("(1) SI - (2) NO ");
			opcion = sc.nextInt();
			sc.nextLine();
		} while (opcion == 1);

		System.out.println(nombresNoEncontrados+ " eliminados.");
		
		System.out.println("Lista "+nombresBuscados);
		if (opcion == 2) {
			System.out.println("Fin programa");
		}

	}
}