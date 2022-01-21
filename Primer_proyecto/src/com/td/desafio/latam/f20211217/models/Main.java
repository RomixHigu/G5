package com.td.desafio.latam.f20211217.models;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Alimento alimento=new Alimento();
		alimento.setComida("Hojas");
		alimento.setDescripcion(" de Bamboo");
		//String nombre, String raza, String color, Alimento alimento,String tipo
		Ave ave = new Ave();
		
		Oso oso = new Oso("Panpan","pardo","Cafe",alimento,"Pequenio");
		
		ave.setColor("Blanco");
		oso.setTipo("Pardo");
		System.out.println(ave.toString());

		Zoologico zoo = new Zoologico();
		zoo.setAve(ave);
		zoo.setOso(oso);
		
	
		System.out.println(zoo);
	}

}
