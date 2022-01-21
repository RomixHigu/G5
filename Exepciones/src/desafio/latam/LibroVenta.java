package desafio.latam;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {

	private String nombreVenta;
	private String fechaVenta;


	public LibroVenta() {
		super();
	}

	public LibroVenta(String nombreVenta, String fechaVenta, Cliente cliente, Vehiculo vehiculo) {
		super();
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;

	}

	public String getNombreVenta() {
		return nombreVenta;
	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}


	public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
		File carpeta = new File("src/desafio/latam/ficheros");

		if (!carpeta.exists()) {
			carpeta.mkdir();
		}
				try {
					File archivo = new File("src/desafio/latam/ficheros/" + nombreVenta + ".txt");
					if (!archivo.exists()) {
					archivo.createNewFile();
					
					FileWriter fileWriter = new FileWriter(archivo);
					BufferedWriter buff = new BufferedWriter(fileWriter);
					buff.write("Patente del vehiculo: " + vehiculo.getPatente());
					buff.newLine();
					buff.write("Edad del cliente: " + cliente.getEdad());
					buff.newLine();
					buff.write("Fecha de la venta: " + fechaVenta);
					buff.newLine();
					buff.write("Nombre de la venta: " + nombreVenta);
					
					buff.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Venta guardada con exito!");
			}
			
		

	}

