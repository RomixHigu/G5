package servicios;

import java.util.List;
import java.util.Map;

import modelos.Alumno;
import modelos.Materia;

public interface AlumnoService {
	
	public void crearAlumno (Alumno alumno);	
	
	public void agregarMateria (String rut, Materia materia);
	
	public List<Materia> materiasPorAlumno(String rut);
	
	public Map<String,Alumno> listarAlumnos();
}
