package servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import modelo.Cliente;

public class ExportadorCsv extends Exportador {

	@Override
	public void exportar(String fileName, List<Cliente> listaClientes) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la ruta donde desea exportar el archivo:");
		String ruta = sc.nextLine();

		File carpeta = new File(ruta);

		if (!carpeta.exists()) {
			carpeta.mkdir();
		}

		File archivo = new File(ruta + "/" + fileName + ".csv");
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(archivo);
			BufferedWriter buff = new BufferedWriter(fileWriter);
			for (Cliente cliente : listaClientes) {
				buff.write(cliente.toString());
				buff.newLine();
			}
			System.out.println("Archivo txt exportado con exito!");
			buff.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
