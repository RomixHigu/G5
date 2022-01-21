package com.desafiolatam;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ExportarTxt extends ExportadorTxt{

	@Override
	public void exportar(ArrayList<Producto>productos) {
		File carpeta = new File("src/com/desafiolatam/ficheros");

		if (!carpeta.exists()) {
			carpeta.mkdir();
		}
		try {
			File archivo = new File("src/com/desafiolatam/ficheros/Producto.txt");
			if (!archivo.exists()) {
				archivo.createNewFile();				
				}
			FileWriter fileWriter = new FileWriter(archivo);
			BufferedWriter buff = new BufferedWriter(fileWriter);
			for (Producto producto : productos) {
				buff.write("Articulo: "+ producto.getArticulo());
				buff.newLine();
				buff.write("Precio: "+producto.getPrecio());
				buff.newLine();
				buff.write("Descripcion: "+producto.getDescripcion());
				buff.newLine();
				buff.write("Codigo: "+producto.getCodigo());
				buff.newLine();
				buff.write("Talla: "+producto.getTalla());
				buff.newLine();
				buff.write("Marca: "+producto.getMarca());
				buff.newLine();
				buff.write("Color: "+producto.getColor()+"\n");								
				buff.newLine();
								
			}
			System.out.println("Archivo exportado con exito!");
			buff.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
