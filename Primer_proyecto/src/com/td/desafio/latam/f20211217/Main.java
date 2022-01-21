package com.td.desafio.latam.f20211217;

import com.td.desafio.latam.f20211217.models.Alimento;
import com.td.desafio.latam.f20211217.models.Animal;
import com.td.desafio.latam.f20211217.models.Auto;
import com.td.desafio.latam.f20211217.models.Camioneta;
import com.td.desafio.latam.f20211217.models.Sedan;

public class Main {

	public static void main(String[] args) {

		Auto auto = new Auto();
		System.out.println(auto.toString());
		auto.miMetodo();
		// asignar valor al atributo
		auto.setRuedas(4);
		auto.setMotor(1.2f);
		auto.setColor("Blanco");
		auto.setVelocidad(250f);
		System.out.println(auto.toString());
		// obtener el valor de un atributo para la variable auto
		System.out.println(auto.getRuedas());
		System.out.println(auto.getVelocidad());
		System.out.println(auto.getColor());
		System.out.println(auto.getMotor());

		/** NUEVA VARIABLE **/
		// nueva instancia, usamos el contructor con parametros

		Auto autito = new Auto("Gris", null, 5, 1.6f);

		System.out.println(autito.toString());

		Auto auto2 = new Auto("Negro", 4);
		auto2.setMotor(2.1f);
		auto2.setVelocidad(258f);
		System.out.println(auto2.toString());
		auto2.setColor("Rojo");// no solo asigna, tambien sobreescribe
		System.out.println(auto2.toString());
		System.out.println();

		Alimento alimento = new Alimento("MasterDog", "Adulto, Sabor Carne");
		Animal gato = new Animal();
		gato.setNombre("Sofia");
		gato.setRaza("Americano");
		gato.setColor("Gris");

		System.out.println(gato.toString());

		alimento.setComida("Catchow");
		alimento.setDescripcion("Adulto, sabor Carne");

		Alimento alimento2 = new Alimento("Felix", "Atun");
		gato.setAlimento(alimento2);
		Animal perro = new Animal("Maite", "Kiltro", "Negro", alimento);

		System.out.println(perro.toString());
		System.out.println();
		System.out.println("Nombre del animal: " + gato.getNombre() + ", Raza: " + gato.getRaza() + ", Color: "
				+ gato.getColor() + ", Alimento: " + gato.getAlimento().getComida() + " - "
				+ gato.getAlimento().getDescripcion());
		System.out.println();
		System.out.println("Nombre del animal: " + perro.getNombre());
		System.out.println("Raza: " + perro.getRaza());
		System.out.println("Color: " + perro.getColor());
		System.out.println(
				"Su alimento es: " + perro.getAlimento().getComida() + " - " + perro.getAlimento().getDescripcion());
		System.out.println();

		auto.imprimirAlimento(alimento);
		
		/**HERENCIA**/
		
		System.out.println();
		Sedan autoSedan = new Sedan();
		Camioneta camioneta = new Camioneta("Blanco",250f,4,2.8f,"3000lts");
		
		autoSedan.color="blanco";
		autoSedan.motor=1.8f;
		
		
		System.out.println(camioneta.toString());
	}

}