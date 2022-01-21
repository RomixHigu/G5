package com.td.desafio.latam.f20211210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListaAlimentos {

	public static void main(String[] args) {
		
		ordenar();

	}

	public static void ordenar() {
		ArrayList<String> platos = new ArrayList<String>();
		platos.add("Cazuela");
		platos.add("Porotos");
		platos.add("Pastel de Choclo");
		platos.add("Aji de gallina");
		platos.add("Ceviche");
		platos.add("Arepas");

		Collections.sort(platos);

		System.out.println("*****************");
		System.out.println("       MENU      ");
		System.out.println("*****************");
		System.out.println("");

		for (int i = 0; i < platos.size(); i++) {
			System.out.println(" - " + platos.get(i));

		}
		for (Iterator iterator = platos.iterator(); iterator.hasNext();)
		{
			String elemento = (String) iterator.next();
			//System.out.println("elemento "+iterator.next());
			System.out.println("elemento "+elemento);
		}
	}
	

	public static void promedio() {
		ArrayList<Float> notas = new ArrayList<Float>();
		notas.add((float) 4.2);
		notas.add((float) 2.2);
		notas.add((float) 5.4);
		notas.add((float) 6.9);
		notas.add((float) 4.4);
		notas.add((float) 2.6);

		for (Iterator iterator = notas.iterator(); iterator.hasNext();)
		{
			
			System.out.println("elemento "+iterator.next());
			//System.out.println("elemento "+elemento);
		}
		
		System.out.println(Collections.max(notas));
		System.out.println(Collections.min(notas));

	}
}
