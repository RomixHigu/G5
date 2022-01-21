package com.td.desafio.latam.f20220103;

import java.util.ArrayList;
import java.util.ListIterator;

public class ColeccionesList {

   public static void main(String[] args) {

	   //Incorporacion de elementos al ArrayList
	   ArrayList<String> ciudades = new ArrayList<>();
	   
	   ciudades.add("Santiago");
	   ciudades.add("Iquique");
	   ciudades.add("Arica");
	   ciudades.add("Concepcion");
	   ciudades.add("La serena");
	   ciudades.add("Puerto Montt");
	   System.out.println(ciudades);
	   
	   //Incorporacion de mas elementos desde una coleccion distinta
	   ArrayList<String> otrasCiudades = new ArrayList();
	   otrasCiudades.add("Rancagua");
	   otrasCiudades.add("Punta Arenas");
	   ciudades.addAll(otrasCiudades);
	   System.out.println(ciudades);
	   
	   //Obtener elementos de una posicion especifica
	   System.out.println(ciudades.get(0));
	   System.out.println(ciudades.get(5));
	   
	   //Eliminar elemento de una posicion
	   ciudades.remove(5);
	   System.out.println(ciudades);
	   
	   ciudades.set(2, "Talca");
	   System.out.println(ciudades);
	   
	   System.out.println(ciudades.size());
	   
	   //Posicion del elemento
	   System.out.println(ciudades.indexOf("Puerto Montt"));
	   System.out.println(ciudades.indexOf("Santiago"));
	   
	   System.out.println(ciudades.lastIndexOf("Puerto Montt"));
	   System.out.println(ciudades.lastIndexOf("Talca"));
	   
	   System.out.println(" ");
	   
	   ListIterator<String> ciudadesIterator = ciudades.listIterator();
	   System.out.println(ciudadesIterator.hasNext());
	   
	   System.out.println(ciudadesIterator.hasPrevious());
   }

}