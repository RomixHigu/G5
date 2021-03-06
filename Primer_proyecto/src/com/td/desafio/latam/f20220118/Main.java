package com.td.desafio.latam.f20220118;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		/** SET */

		/** HashSet */
		// Lista desordenada que no permite datos duplicados

		Set<String> estudiantes = new HashSet<String>();

		estudiantes.add("Desiree Sotillo");
		estudiantes.add("Victor Soto");
		estudiantes.add("Luis Sanhueza");
		estudiantes.add("Roberto Vasquez");
		estudiantes.add("Soledad Silva");
		estudiantes.add("Luis Sanhueza");

		System.out.println(estudiantes);

		/** LinkedHashSet */
		//Lista ordenada segun ingreso que no guarda datos duplicados
		
		Set<String> estudiantesLHS = new LinkedHashSet<String>();

		estudiantesLHS.add("Desiree Sotillo");
		estudiantesLHS.add("Victor Soto");
		estudiantesLHS.add("Luis Sanhueza");
		estudiantesLHS.add("Roberto Vasquez");
		estudiantesLHS.add("Soledad Silva");
		estudiantesLHS.add("Luis Sanhueza");

		System.out.println(estudiantesLHS);
		
		/** TreeSet */
		//Lista ordenada alfabeticamente que no guarda elementos duplicados
		
		Set<String> estudiantesT = new TreeSet<String>();

		estudiantesT.add("Desiree Sotillo");
		estudiantesT.add("Victor Soto");
		estudiantesT.add("Luis Sanhueza");
		estudiantesT.add("Roberto Vasquez");
		estudiantesT.add("Soledad Silva");
		estudiantesT.add("Luis Sanhueza");

		System.out.println(estudiantesT);
	}

}