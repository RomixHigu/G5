package vistas;

import java.util.Scanner;

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

	public abstract void crearAlumno();
	
	public abstract void listarAlumno();
	
	public abstract void agregarMateria();
	
	public abstract void agregarNota();
	
	public abstract void cargarDatos();
	
	public abstract void exportarDatos();
	
	public abstract void terminarPrograma();
	
	public final void iniciarMenu() {
		
		System.out.println("----------------");
		System.out.println("-     MENU     -");
		System.out.println("----------------");
		System.out.println("1. Crear Alumno");
		System.out.println("2. Listar Alumno");
		System.out.println("3. Agregar Materia");
		System.out.println("4. Agregar Notas");
		System.out.println("5. Cargar Datos");
		System.out.println("6. Exportar datos ");
		System.out.println("7. Salir ");
		System.out.println(" ");
		System.out.println("Ingrese opcion: ");
		String opcion = sc.nextLine();
		
		switch (opcion) {
		case "1":
			crearAlumno();
			break;
		case "2":
			listarAlumno();
			break;
		case "3":
			agregarMateria();
			break;
		case "4":
			agregarNota();
			break;
		case "5":
			cargarDatos();
			break;
		case "6":
			exportarDatos();
			break;
		case "7":
			terminarPrograma();
			break;
			default:
				System.out.println("Opcion invalida");
		}
	}
	
}
