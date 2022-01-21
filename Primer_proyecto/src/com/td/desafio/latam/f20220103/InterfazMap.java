package com.td.desafio.latam.f20220103;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class InterfazMap {

	public static void main(String[] args) {
		Map<String, Integer> planetas = new TreeMap<>();
		//Agregar elementos y su valor
		planetas.put("Mercurio", 10);
		planetas.put("Venus",20);
		planetas.put("Marte",15);
		planetas.put("Jupiter",50);
		System.out.println(planetas);
		
		//Remover elementos
		planetas.remove("Venus");
		System.out.println(planetas);
		
		//Obtener el valor de un elemento
		System.out.println(planetas.get("Jupiter"));
		
		//Buscar si el elemento existe
		System.out.println(planetas.containsKey("Tierra"));
		System.out.println(planetas.containsKey("Jupiter"));
		
		//Obtener todas las claves/elementos
		planetas.keySet().forEach(System.out::println);
		System.out.println(" ");
		
		//imprimir los elementos cuyo valor sea menor a 16
		planetas.entrySet().stream().filter(aniosLuz->aniosLuz.getValue()<16).forEach(System.out::println);
		
	
		
		}

}
