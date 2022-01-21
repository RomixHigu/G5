package com.td.desafio.latam.f20211209;

import java.util.ArrayList;
import java.util.Scanner;

public class AgregaElemento {

	public static void main(String[] args) {
		/*
		 * Crear un método llamado agregaElemento el cual nos permite agregar un
		 * elemento de una casa a un ArrayList , este elemento se ingresa como un
		 * parámetro de entrada.
		 * 
		 * Se requiere validar si el elemento que se ingresará no existe en el arreglo.
		 * ● Si no existe se agregará. ● Si existe se mostrará el mensaje “Elemento ya
		 * existe”.
		 */
		agregaElemento();

	}

	public static void agregaElemento() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> elementoCasa = new ArrayList<String>();
		int opcion = 0;
		String elemento = "";

		do {
			System.out.println("Ingresa elemento de la casa");
			 elemento = sc.next();

			if (elementoCasa.size() == 0) {
				elementoCasa.add(elemento);
			} else {
				boolean existe = false;				

				for (int i = 0; i < elementoCasa.size(); i++) {
					String existente = elementoCasa.get(i);
					if (existente.equalsIgnoreCase(elemento)) {
						existe = true;
						System.out.println("Elemento ya existe");
					}
				}
				if (!existe) {
					elementoCasa.add(elemento);
				}
			}
			System.out.println(elementoCasa);
			System.out.println("Desea consultar por otro elemento?");
			System.out.println("(1) SI - (2) NO ");
			opcion = sc.nextInt();
			sc.nextLine();

		} while (opcion == 1);
		System.out.println("Los elementos de su casa son: " + elementoCasa);

		sc.close();
	}
}
