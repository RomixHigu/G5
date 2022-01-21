package com.desafiolatam;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {

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

	public void listarProductos() {

		System.out.println(listaProductos);
	}

	public void agregarProductos(Producto producto) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese articulo");
		String articulo = sc.nextLine();

		System.out.println("Ingrese precio");
		String precio = sc.nextLine();

		System.out.println("Ingrese descripcion del articulo");
		String descripcion = sc.nextLine();

		System.out.println("Ingrese codigo");
		String codigo = sc.nextLine();

		System.out.println("Ingrese talla");
		String talla = sc.nextLine();

		System.out.println("Ingrese marca");
		String marca = sc.nextLine();

		System.out.println("Ingrese color");
		String color = sc.nextLine();

		producto.setArticulo(articulo);
		producto.setPrecio(precio);
		producto.setDescripcion(descripcion);
		producto.setCodigo(codigo);
		producto.setTalla(talla);
		producto.setMarca(marca);
		producto.setColor(color);

		listaProductos.add(producto);

		System.out.println("Producto agregado con exito!");
		
		
		
	}
	
}