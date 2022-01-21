package servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.Alumno;
import modelos.Materia;

public class AlumnoServicioImp implements AlumnoService {
	private Map<String, Alumno> listaAlumnos = new HashMap<>();
	
	public AlumnoServicioImp() {
		super();
	}
	
		
	public AlumnoServicioImp(Map<String, Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}

	
	public Map<String, Alumno> getListaAlumnos() {
		return listaAlumnos;
	}


	public void setListaAlumnos(Map<String, Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}


	@Override
	public void crearAlumno(Alumno alumno) {
		if(alumno != null) {
			listaAlumnos.put(alumno.getRut(), alumno);
		}
		
	}
	
	@Override
	public Map<String, Alumno> listarAlumnos() {		
		return listaAlumnos;
	}

	

	@Override
	public void agregarMateria(String rut, Materia materia) {
		if (listaAlumnos.containsKey(rut)) {
			Alumno alumno = listaAlumnos.get(rut);
			if (alumno.getMaterias() != null) {
				Materia mat = alumno.getMaterias().stream().filter(m -> m.getNombre().equals(materia.getNombre())).findAny().orElse(null);
				if (mat == null) {
					alumno.getMaterias().add(materia);
					System.out.println("Materia agregada con exito!");
				} else {
					System.out.println("El alumno ya contiene la materia");
				}
			} else {
				List<Materia> materias = new ArrayList<>();
				materias.add(materia);
				alumno.setMaterias(materias);
				System.out.println("Materia agregada con exito!");
			}
		} else {
			System.out.println("El alumno no existe");
		}

	}

	@Override
	public List<Materia> materiasPorAlumno(String rut) {
		List<Materia> materias = new ArrayList<>();
		if (listaAlumnos.containsKey(rut)) {
			Alumno alumno = listaAlumnos.get(rut);
			if(alumno.getMaterias() != null) {
				materias = alumno.getMaterias();
			}
		}
		return materias;
	}



	

	

	

}
