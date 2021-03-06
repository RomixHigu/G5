package servicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import modelo.CategoriaEnum;
import modelo.Cliente;

public class ArchivoServicio extends Exportador {

	public List<Cliente> cargarDatos(String fileName1) throws IOException {
		BufferedReader br = null;
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		String linea = " ";

		Scanner sc = new Scanner(System.in);
		String ruta = ("src");

		System.out.println("Cargar Datos");
		System.out.println("Ingresa la ruta donde se encuentra el archivo DBClientes.csv");
		String ruta2 = sc.next();
		System.out.println("");

		if (!ruta2.equals(ruta)) {
			System.out.println("La ruta ingresada no existe!");
		} else {
			try {
				FileReader archivo = new FileReader("src/" + fileName1);
				br = new BufferedReader(archivo);

				linea = br.readLine();
				while (linea != null) {
					List<String> cliente1 = new ArrayList<>(Arrays.asList(linea.split(",")));
					Cliente cliente = new Cliente();
					cliente.setRun(cliente1.get(0));
					cliente.setNombre(cliente1.get(1));
					cliente.setApellido(cliente1.get(2));
					cliente.setAntiguedad(Integer.parseInt(cliente1.get(3).substring(0, 1)));
					CategoriaEnum catEnum = CategoriaEnum.valueOf(cliente1.get(4).toUpperCase());
					cliente.setCategoria(catEnum);
					linea = br.readLine();
					listaClientes.add(cliente);
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			br.close();
			System.out.println("-- Datos cargados correctamente en la lista --");
		}
		return listaClientes;
	}

	@Override
	public void exportar(String fileName, List<Cliente> listaClientes) {
		// TODO Auto-generated method stub

	}

}
