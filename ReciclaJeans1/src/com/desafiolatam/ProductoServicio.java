package com.desafiolatam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductoServicio extends ArchivoServicio {

	private ArrayList<Producto> listaProductos;

	public ProductoServicio() {
		super();
		listaProductos = new ArrayList<Producto>();
	}

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		listaProductos = new ArrayList<Producto>();

	}

	public ArrayList<Producto> getProductos() {

		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public void listarProductos(Producto producto) throws IOException {
		System.out.println(listaProductos);
	}

	public void editarProductos() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese codigo del producto a editar");
		String codigo = sc.nextLine();
		for (Producto producto : listaProductos) {

			if (producto.getCodigo().equals(codigo)) {
				System.out.println(producto.toString());
				System.out.println("Ingrese item a editar");
				String editar = sc.nextLine();
				System.out.println("Ingrese nuevo detalle");
				String detalle = sc.nextLine();

				switch (editar.toLowerCase()) {
				case "articulo":
					producto.setArticulo(detalle);
					break;
				case "precio":
					producto.setPrecio(detalle);
					break;
				case "descripcion":
					producto.setDescripcion(detalle);
					break;
				case "codigo":
					producto.setCodigo(detalle);
					break;
				case "talla":
					producto.setTalla(detalle);
					break;
				case "marca":
					producto.setMarca(detalle);
					break;
				case "color":
					producto.setColor(detalle);
					break;
				}
				System.out.println("Producto editado con exito!");
			}

		}

	}
}
