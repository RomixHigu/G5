package com.td.desafio.latam.f20220103.models;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class EjercicioMap {

	public static void main(String[] args) {
		Map<String, Double> temblores = new TreeMap<>();
		temblores.put("31 km al NO de Camina", 5.7);
		temblores.put("73 km al N de calama", 5.9);
		temblores.put("68 km al SO de Tongoy", 6.8);
		temblores.put("52 km al N de Mejillones", 6.6);
		temblores.put("68 km al SO de Tongoy", 6.9);
		System.out.println(temblores);
		System.out.println(" ");
		
		System.out.println("Mayor magnitud: "+Collections.max(temblores.values()));
		System.out.println("Menor magnitud: "+Collections.min(temblores.values()));
		System.out.println(" ");
		
		
		System.out.println("Temblores con Maginitud menor a 6.5: ");
		temblores.entrySet().stream().filter(magnitud -> magnitud.getValue()> 6.5f).forEach(System.out::println);

		System.out.println(" ");
		
		temblores.replace("52 km al N de Mejillones", 6.6, 6.8);
		System.out.println(temblores);
	}

}
