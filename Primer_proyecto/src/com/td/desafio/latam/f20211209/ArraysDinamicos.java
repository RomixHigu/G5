package com.td.desafio.latam.f20211209;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArraysDinamicos {

	public static void main(String[] args) {
		ArrayList<String> alumnos = new ArrayList<String>();
		// List<String> alumnosList = new ArrayList <String>();

		System.out.println(alumnos.size()); // numero de elementos en la lista
		// add(); agrega un elemento al final de la lista
		alumnos.add("Alexandra");
		alumnos.add("Andres");
		alumnos.add("Desiree");
		System.out.println(alumnos.size());

		ArrayList<String> campeones = new ArrayList<String>();

		campeones.add("Chang'e");
		campeones.add("Hanabi");
		campeones.add("Matildha");

		for (Iterator<String> iterator = campeones.iterator(); iterator.hasNext();) {

			String elemento = (String) iterator.next();
			System.out.println("El elemento es " + elemento);
		}

		System.out.println(campeones.size());// cantidad de elementos en el listado
		System.out.println(campeones);

		campeones.add(2, "Valentina");// agregar dato
		System.out.println(campeones);

		String cambioCampeon = campeones.set(3, "Vale"); // reemplazar y guardar dato anterior
		System.out.println(campeones);
		System.out.println(cambioCampeon);

		Collections.sort(campeones);// orden alfabetico
		System.out.println(campeones);

		Collections.reverse(campeones);// orden alfabetico inverso
		System.out.println(campeones);

		ArrayList<String> campeones2 = new ArrayList<String>();
		campeones2.add("Hanabi");
		campeones2.add("Valentina");
		campeones.removeAll(campeones2);

		System.out.println(campeones);
		System.out.println(Collections.max(campeones));
		System.out.println(Collections.min(campeones));

		System.out.println("*********************");

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(1);
		numeros.add(4);
		numeros.add(1);
		numeros.add(2);
		numeros.add(6);
		System.out.println(numeros);

		System.out.println(Collections.min(numeros));
		System.out.println(Collections.frequency(numeros, (1)));

		System.out.println(Collections.frequency(numeros, Collections.min(numeros)));

	}

}
