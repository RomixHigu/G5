package vista;

import java.util.Scanner;

import modelo.Cliente;

public abstract class MenuTemplate {
	protected Scanner sc = new Scanner(System.in);
	
	public MenuTemplate() {
		super();
	}
		
	public MenuTemplate(Scanner sc) {
		super();
		this.sc = sc;
	}
	
	public Scanner getSc() {
		return sc;
	}


	public void setSc(Scanner sc) {
		this.sc = sc;
	}


	public abstract void listarCliente();
	
	public abstract void agregarCliente();
	
	public abstract void editarCliente();
	
	public abstract void importarDatos();
	
	public abstract void exportarDatos();
		
	public abstract void terminarPrograma();
	
	public final void iniciarMenu() {
		int opcion;
		do {
		System.out.println("----------------");
		System.out.println("-     MENU     -");
		System.out.println("----------------");
		System.out.println("1. Listar Cliente");
		System.out.println("2. Agregar Cliente");
		System.out.println("3. Editar Cliente");
		System.out.println("4. Cargar Datos");
		System.out.println("5. Exportar Datos");
		System.out.println("6. Salir ");
		System.out.println(" ");
		System.out.println("Ingrese opcion: ");
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			listarCliente();
			break;
		case 2:
			agregarCliente();
			break;
		case 3:
			editarCliente();
			break;
		case 4:
			importarDatos();
			break;
		case 5:
			exportarDatos();
			break;
		case 6:
			terminarPrograma();
			break;
		
			default:
				System.out.println("Opcion invalida");
		}
		}while (opcion != 6);
	}
	
}
