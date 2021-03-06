package com.td.desafio.latam.f20220118;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.td.desafio.latam.f20220118.models.Estudiante;

public class ObjetosMain {

	public static void main(String[] args) {
		
		/* HashSet */
		Set<Estudiante> estudiantes = new HashSet<Estudiante>();

		Estudiante estudiante1 = new Estudiante("Patricio", "Tenorio");
		Estudiante estudiante2 = new Estudiante("Desiree", "Sotillo");
		Estudiante estudiante3 = new Estudiante("Francisco", "Sepulveda");
		Estudiante estudiante4 = new Estudiante("Soledad", "Silva");
		Estudiante estudiante5 = new Estudiante("Pablo", "Romero");

		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		estudiantes.add(estudiante3);
		estudiantes.add(estudiante4);
		estudiantes.add(estudiante5);
		estudiantes.add(estudiante3);

		System.out.println(estudiantes);
		
		/* LinkedHashSet */

		Set<Estudiante> estudiantesLHS = new LinkedHashSet<Estudiante>();

		Estudiante estudianteL1 = new Estudiante("Patricio", "Tenorio");
		Estudiante estudianteL2 = new Estudiante("Desiree", "Sotillo");
		Estudiante estudianteL3 = new Estudiante("Francisco", "Sepulveda");
		Estudiante estudianteL4 = new Estudiante("Soledad", "Silva");
		Estudiante estudianteL5 = new Estudiante("Pablo", "Romero");

		estudiantesLHS.add(estudianteL1);
		estudiantesLHS.add(estudianteL2);
		estudiantesLHS.add(estudianteL3);
		estudiantesLHS.add(estudianteL4);
		estudiantesLHS.add(estudianteL5);
		estudiantesLHS.add(estudianteL3);

		System.out.println(estudiantesLHS);

		/* TreeSet */
		/** No se puede utilizar en lista de objetos **/
		
		/*Set<Estudiante> estudiantesT = new TreeSet<Estudiante>();

		Estudiante estudianteT1 = new Estudiante("Patricio", "Tenorio");
		Estudiante estudianteT2 = new Estudiante("Desiree", "Sotillo");
		Estudiante estudianteT3 = new Estudiante("Francisco", "Sepulveda");
		Estudiante estudianteT4 = new Estudiante("Soledad", "Silva");
		Estudiante estudianteT5 = new Estudiante("Pablo", "Romero");

		estudiantesT.add(estudianteT1);
		estudiantesT.add(estudianteT2);
		estudiantesT.add(estudianteT3);
		estudiantesT.add(estudianteT4);
		estudiantesT.add(estudianteT5);
		estudiantesT.add(estudianteT3);

		System.out.println(estudiantesT);*/
	}

}
