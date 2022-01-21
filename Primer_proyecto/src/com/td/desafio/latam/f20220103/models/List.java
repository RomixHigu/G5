package com.td.desafio.latam.f20220103.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class List {

	public static void main(String[] args) {
		ArrayList<Float> notas = new ArrayList<>();
		notas.add(6.9f);
		notas.add(6.7f);
		notas.add(4.5f);
		notas.add(5.5f);
		notas.add(5.8f);
		notas.add(6.1f);
		notas.add(7.0f);
		
		System.out.println(notas);
		
		notas.remove(Collections.min(notas));
		
		System.out.println(notas);
		/*float sumaNota = 0;
		int contador = 0;
		
		for (Iterator<Float> iteratorNotas = notas.iterator(); iteratorNotas.hasNext();) {
			Float nota = (Float) iteratorNotas.next();*/
		
			Float sumaNota = notas.get(0)+notas.get(1)+notas.get(2)+notas.get(3)+notas.get(4)+notas.get(5);
			//contador = contador + 1;
			float promedio = sumaNota/notas.size();
			System.out.println(promedio);
		}
		
			
		}

	


