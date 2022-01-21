package com.desafiolatam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductoServicio productoS = new ProductoServicio();
		int opcion = 0;
		Producto producto = new Producto();
		ExportarTxt exportador = new ExportarTxt();

		do {
			menu();

			System.out.println("Ingrese opcion");
			opcion = sc.nextInt();

			if (opcion == 1) {
				productoS.listarProductos();
				System.out.println("\n");

			} else if (opcion == 2) {
				productoS.agregarProductos(producto);
				Utilidades.limpiarPantalla();
				
			} else if (opcion == 3) {
				exportador.exportar(productoS.getProductos());
				System.out.println("\n");
				
			} else if (opcion == 4) {
				System.out.println("Abandonando el sistema de productos...");
				System.out.println("");
				System.out.println("Acaba de salir del sistema.");
				Utilidades.limpiarPantalla();
			} else {
				System.out.println(" ** Opcion incorrecta **");
				System.out.println("\n");
			}		
		} while (opcion != 4);
	}

	public static void menu() {

		System.out.println("----------------");
		System.out.println("-     MENU     -");
		System.out.println("----------------");
		System.out.println("1. Listar Producto");
		System.out.println("2. Agregar Producto");
		System.out.println("3. Exportar Datos");
		System.out.println("4. Salir");
		System.out.println(" ");
	}

}
