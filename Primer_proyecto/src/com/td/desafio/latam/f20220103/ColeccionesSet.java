package com.td.desafio.latam.f20220103;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColeccionesSet {

	public static void main(String[] args) {
		
		//Lista desordenada que no guarda elementos duplicados
		Set<String> languages = new HashSet<>();
		languages.add("Java");
		languages.add("Go");
		languages.add("Erlang");
		languages.add("Java");
		languages.add("Elixir");
		languages.add("Fortran");
		
		System.out.println(languages);
		
		Set<String> programmers = new LinkedHashSet<>();
		programmers.add("James Gosling");
		programmers.add("Martin Odersky");
		programmers.add("Rich Hickey");
		programmers.add("Larry Wall");
		programmers.add("Graydon Hoare");
		System.out.println(programmers);
		
		Set<String> capitales = new TreeSet<>();
		capitales.add("Buenos Aires");
		capitales.add("Brasilia");
		capitales.add("Asuncion");
		capitales.add("Lima");
		
		Set<String> capitales2 = new HashSet<>(Arrays.asList("Caracas","Bogota","Montevideo","Quito","Brasilia"));
		
		//Agrega elementos y los ordena
		Set<String> capitalesUnidas = new TreeSet<>(capitales);
		capitalesUnidas.addAll(capitales2);
		System.out.println(capitalesUnidas+"*");
		
		Set<String> removerCapitales = new HashSet<>(capitales);
		removerCapitales.removeAll(capitales2);
		System.out.println(removerCapitales);
		
		Set<String> interseccionCapitales = new HashSet<>(capitales);
		interseccionCapitales.retainAll(capitales2);
		System.out.println(interseccionCapitales);

	}

}
