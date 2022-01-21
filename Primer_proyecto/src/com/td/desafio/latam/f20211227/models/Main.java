package com.td.desafio.latam.f20211227.models;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		Conejo conejo = new Conejo ();
		Caballo caballo = new Caballo();
		
		ArrayList<Animal> listaAnimales = new ArrayList<>(); //Lista polimorfica. De tipo padre se agrega un hijo		
		listaAnimales.add(conejo);
		listaAnimales.add(caballo);
		
		ArrayList<Herbivoro> listaHerbivoros = new ArrayList<>();
		listaHerbivoros.add(conejo);
		listaHerbivoros.add(caballo);
		
		ArrayList<Conejo> listaConejo = new ArrayList<>();
		listaConejo.add(conejo);
		
		for (Animal animal2 : listaAnimales) {
			System.out.println(animal2);
			
		}
	}

}
