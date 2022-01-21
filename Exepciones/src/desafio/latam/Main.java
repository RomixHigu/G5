package desafio.latam;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Vehiculo vehiculo = new Vehiculo();
		int edad = 0;
		
		
		
		System.out.println("Ingrese nombre de la venta");
		String nombreVenta = sc.nextLine();
		
		System.out.println("Ingrese fecha de la venta");
		String fechaVenta = sc.nextLine();
		System.out.println("Ingresar patente del vehiculo");
		String patente = sc.nextLine();
		
		System.out.println("Ingresar edad del cliente");
		edad = sc.nextInt();
		
		
		LibroVenta libro = new LibroVenta(nombreVenta,fechaVenta,cliente,vehiculo);
		cliente.setEdad(edad);
		vehiculo.setPatente(patente);				
		libro.guardarVenta(cliente, vehiculo);
		
			
		
		
		
		
		
		
		
		
		
		
		
		

	}


	
}