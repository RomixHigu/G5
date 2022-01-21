package vista;

import java.io.IOException;
import java.util.Scanner;

import modelo.CategoriaEnum;
import modelo.Cliente;
import servicio.ArchivoServicio;
import servicio.ClienteServicio;
import servicio.ExportadorCsv;
import servicio.ExportadorTxt;
import utilidades.Util;

public class Menu extends MenuTemplate {
	private ClienteServicio clienteServicio = new ClienteServicio();
	private ArchivoServicio archivoServicio = new ArchivoServicio();
	private ExportadorCsv csv = new ExportadorCsv();
	private ExportadorTxt txt = new ExportadorTxt();
	private String fileName = "Clientes";
	private String fileName1 = "DBClientes.csv";

	@Override
	public void listarCliente() {

		System.out.println(" ");
		clienteServicio.listarCliente();

		Util.limpiarPantalla();
	}

	@Override
	public void agregarCliente() {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();

		System.out.println("Ingrese RUN del cliente");
		String run = sc.nextLine();
		System.out.println("Ingrese nombre del cliente");
		String nombre = sc.nextLine();
		System.out.println("Ingrese apellido del cliente");
		String apellido = sc.nextLine();
		System.out.println("Ingrese años como cliente");
		Integer antiguedad = sc.nextInt();
		
		cliente.setRun(run);
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setAntiguedad(antiguedad);
		cliente.setCategoria(CategoriaEnum.ACTIVO);

		clienteServicio.agregarCliente(cliente);

		System.out.println("Cliente creado con exito!");
		System.out.println(" ");
	}

	@Override
	public void editarCliente() {
		clienteServicio.editarCliente();
		Util.limpiarPantalla();
	}

	@Override
	public void importarDatos() {
		try {
			clienteServicio.setListaCliente(archivoServicio.cargarDatos(fileName1));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Util.limpiarPantalla();
	}

	@Override
	public void exportarDatos() {

		System.out.println("Seleccione el formato a exportar: \n1.- Formato csv\n2.- Formato txt");
		System.out.println("Ingrese opcion deseada");
		int export = sc.nextInt();
		switch (export) {
		case 1:
			csv.exportar(fileName, clienteServicio.getListaCliente());
			break;
		case 2:
			txt.exportar(fileName, clienteServicio.getListaCliente());
			break;
		}
		Util.limpiarPantalla();

	}

	@Override
	public void terminarPrograma() {
		System.out.println("Saliendo del programa...");
		Util.limpiarPantalla();

	}

}
