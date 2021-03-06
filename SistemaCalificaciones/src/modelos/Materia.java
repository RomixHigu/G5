package modelos;

import java.util.List;

public class Materia {
	private MateriaEnum nombre;
	private List<Double> listaNotas;
	
	public Materia() {
		super();
	}
		

	public Materia(MateriaEnum nombre, List<Double> listaNotas) {
		super();
		this.nombre = nombre;
		this.listaNotas = listaNotas;
	}



	public MateriaEnum getNombre() {
		return nombre;
	}

	public void setNombre(MateriaEnum nombre) {
		this.nombre = nombre;
	}

	public List<Double> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Double> listaNotas) {
		this.listaNotas = listaNotas;
	}
	
	

}
