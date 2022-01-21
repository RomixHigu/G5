package com.td.desafio.latam.f20220103.models;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjercicioSet {

	public static void main(String[] args) {
		Set<Integer> preciosDulces = new HashSet<>();
		preciosDulces.add(100);
		preciosDulces.add(200);
		preciosDulces.add(100);
		preciosDulces.add(500);
		preciosDulces.add(400);
		System.out.println(preciosDulces);
		
		Set<Integer> precioBebidas = new HashSet<>();
		precioBebidas.add(200);
		precioBebidas.add(400);
		precioBebidas.add(30000);
		System.out.println(precioBebidas);
		
		Set<Integer> preciosTotal = new TreeSet<>(preciosDulces);
		preciosTotal.addAll(precioBebidas);
		preciosTotal.remove(30000);
		
		System.out.println(preciosTotal);
			}

}
