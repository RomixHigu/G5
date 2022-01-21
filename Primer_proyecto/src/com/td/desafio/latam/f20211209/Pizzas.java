package com.td.desafio.latam.f20211209;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizzas {

	public static void main(String[] args) {
		ingredientes();

	}

	public static void ingredientes() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> pizza = new ArrayList<String>();
		pizza.add("Masa");
		pizza.add("Salsa de tomate");
		pizza.add("Queso");

		int opcion = 0;

		do {
			System.out.println("Ingresa el ingrediente a agregar");
			String ingrediente = sc.next();

			if (pizza.size() == 0) {
				pizza.add(ingrediente);
			} else {
				boolean existe = false;
				// recorrer la pizza
				// comparar TODOS los ingredientes existentes con el nuevo ingresado
				// si existe, no es agregado, si no existe se agrega

				for (int i = 0; i < pizza.size(); i++) {
					String ingredienteExistente = pizza.get(i);
					if (ingredienteExistente.equalsIgnoreCase(ingrediente)) {
						existe = true;
						System.out.println("El Ingrediente ya existe!");
					}
				}
				if (!existe) {
					pizza.add(ingrediente);
				}
			}
			System.out.println(pizza);
			System.out.println("Desea consultar otro ingrediente?");
			System.out.println("(1) SI - (2) NO ");
			opcion = sc.nextInt();
			sc.nextLine();

		} while (opcion == 1);
		System.out.println("Su pedido de pizza es: " + pizza);
		System.out.println("Confirma su pedido?");
		System.out.println("(0) Cancela - (1) Confirma ");
		opcion = sc.nextInt();
		sc.next();
		if (opcion == 1) {
			pizza.clear();
			System.out.println("Pedido eliminado " + pizza);
		}
		System.out.println("Desea eliminar algun ingrediente?");
		System.out.println(" (0) NO - (1) SI ");
		opcion = sc.nextInt();
		sc.nextLine();
		if (opcion == 1) {
			System.out.println("Ingrese el elemento a eliminar");
			String ingrediente = sc.nextLine();
			for (int i = 0; i < pizza.size(); i++) {
				String ingredienteExistente = pizza.get(i);
				if (ingredienteExistente.equalsIgnoreCase(ingrediente)) {
					pizza.remove(i);
				}
			}

		}
		System.out.println(pizza + "\nPedido finalizado con exito");
		sc.close();
	}

}
