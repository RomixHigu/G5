package vistas;



import java.util.ArrayList;
import java.util.List;

import modelos.Alumno;
import modelos.Materia;
import modelos.MateriaEnum;
import servicios.AlumnoServicioImp;

public class Menu extends MenuTemplate{
		
	private AlumnoServicioImp alumnoServicio;
		
	public Menu() {
		super();
	}
	
	
	public Menu(AlumnoServicioImp alumnoServicio) {
		super();
		this.alumnoServicio = alumnoServicio;
	}

	

	public AlumnoServicioImp getAlumnoServicio() {
		return alumnoServicio;
	}


	public void setAlumnoServicio(AlumnoServicioImp alumnoServicio) {
		this.alumnoServicio = alumnoServicio;
	}


	@Override
	public void crearAlumno() {
		
		System.out.println("Ingrese Rut del alumno");
		String rut = sc.nextLine();
		System.out.println("Ingrese Nombre del Alumno");
		String nombre = sc.nextLine();
		System.out.println("Ingrese Apellido del Alumno");
		String apellido = sc.nextLine();
		System.out.println("Ingrese Direccion del Alumno");
		String direccion = sc.nextLine();
		
		Alumno alumno = new Alumno(rut,nombre,apellido,direccion,null);
		alumnoServicio.crearAlumno(alumno);
		
	}
	
	@Override
	public void listarAlumno() {
		alumnoServicio.listarAlumnos().entrySet().forEach(entry -> {
		Alumno alumno = entry.getValue();
		System.out.println("Rut: "+ alumno.getRut());
		System.out.println("Nombre: "+ alumno.getNombre());
		System.out.println("Apellido: "+ alumno.getApellido());
		System.out.println("Direccion: "+ alumno.getDireccion());
		
		if (alumno.getMaterias()!= null) {
			System.out.println("Materias");
			alumno.getMaterias().forEach(materia -> {			
			System.out.println(materia.getNombre().name());
			System.out.println(materia.getListaNotas().toString());
		});
		}
	});
}

	@Override
	public void agregarMateria() {
		System.out.println("Ingrese Rut del alumno");
		String rut = sc.nextLine();
		
		Materia materia = new Materia();
		System.out.println("1.- Matematicas");
		System.out.println("2.- Lenguaje");
		System.out.println("3.- Ciencia");
		System.out.println("4.- Historia");
		System.out.println("Seleccione una materia");
		String seleccion = sc.nextLine();
		
		switch(seleccion) {
		case "1": materia.setNombre(MateriaEnum.MATEMATICAS);
		break;
		
		case "2": materia.setNombre(MateriaEnum.LENGUAJE);
		break;
		
		case "3": materia.setNombre(MateriaEnum.CIENCIA);
		break;
		
		case "4": materia.setNombre(MateriaEnum.HISTORIA);
		break;
		}
		alumnoServicio.agregarMateria(rut, materia);
	}

	@Override
	public void agregarNota() {
		System.out.println("Ingrese Rut del alumno");
		String rut = sc.nextLine();
		
		List<Materia> materias = alumnoServicio.materiasPorAlumno(rut);
		materias.forEach(materia -> System.out.println(materias.indexOf(materia)+" - "+materia.getNombre()));
		System.out.println("Seleccionar una materia");
		String seleccion = sc.nextLine();
		Materia mate = materias.get(Integer.valueOf(seleccion));
		if(mate!=null) {
			List<Double> notas = new ArrayList<Double>();
			Double nota = sc.nextDouble();
			if(mate.getListaNotas()!= null) {
				mate.getListaNotas().add(nota);
			}else {
				notas.add(nota);
				mate.setListaNotas(notas);
			}
			System.out.println("Nota ingresada con exito");
		}else {
			System.out.println("Error en la seleccion");
		}
		
	}
	
	@Override
	public void cargarDatos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exportarDatos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terminarPrograma() {
		// TODO Auto-generated method stub
		
	}



}
