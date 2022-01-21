package com.desafiolatam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*** MARCAS ***");
		marcas();
		
		System.out.println("*** Invitados ***");
		invitados();
		
		System.out.println("*** JUEGOS ***");
		juegos();
	}
	
	private static void marcas() {
		ArrayList<String> marcas = new ArrayList<>();
		marcas.add("Klenzo");
		marcas.add("Barcel");
		marcas.add("Salo");
		marcas.add("Village");
		marcas.add("Erbi");
		marcas.add("Sega");
		marcas.add("Bresler");
		marcas.add("Miti-Miti");
		marcas.add("Derbi");
		marcas.add("Otto Kraus");
		
		System.out.println(marcas+"\n");
		
		marcas.add("Blokbaster");
		marcas.add("Carrefour");
		marcas.add("Jetix");
		
		System.out.println(marcas+"\n");
		
		marcas.set(marcas.indexOf("Blokbaster"), "Blockbuster");
		
		//marcas.remove(11);
		System.out.println("Marca eliminada: "+(marcas.remove("Carrefour")?"Si":"No"));
		
		System.out.println(marcas+"\n");
		
		ArrayList<String> posiblesMarcas = new ArrayList<>();
		posiblesMarcas.add("Sapolio");
		posiblesMarcas.add("Noble");
		posiblesMarcas.add("Arens");
		
		marcas.addAll(posiblesMarcas);
		System.out.println("Marcas ingresadas: "+marcas.size()+"\n");
	}
	
	public static void invitados() {
		Set<String> invitados = new TreeSet<>();
		invitados.add("Daniel");
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro");		
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("Juan Pablo");
		
		Set<String> posiblesInvitados = new TreeSet<>(invitados);
		posiblesInvitados.add("Jorge");
		posiblesInvitados.add("Francisco");
		posiblesInvitados.add("Marcos");
		
		System.out.println(posiblesInvitados+"\n");
		
		posiblesInvitados.remove("Jorge");
		System.out.println(posiblesInvitados);
		
		System.out.println(" ");
		System.out.println("*** GOLOSINAS ***");
		System.out.println(" ");
		Map<String,Integer> golosinas = new TreeMap<>();
		golosinas.put("Chocman a ",100);
		golosinas.put("Trululu a ", 100);
		golosinas.put("Centella a ", 100);
		golosinas.put("Kilate a ", 50);
		golosinas.put("Miti-miti a ", 30);
		golosinas.put("Traga Traga a ", 150);
		golosinas.put("Tableton a ", 5);
		
		golosinas.entrySet().stream().filter(pesos ->pesos.getValue()<100).forEachOrdered(System.out::println);;
		//System.out.println(golosinas);		
		System.out.println(" ");
	}
	public static void juegos() {
		System.out.println(" ");
		Queue<String> juegos = new LinkedList<>();
		juegos.add("Tombo");
		juegos.add("Congelado");
		juegos.add("Quemaditas");
		juegos.add("Cachipun");
		juegos.add("Pillarse");
		
		System.out.println(juegos);
	}
}
