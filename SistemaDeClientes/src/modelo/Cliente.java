package modelo;

public class Cliente {
	private String run;
	private String nombre;
	private String apellido;
	private Integer antiguedad;
	private CategoriaEnum categoria;
	
	public Cliente() {
		super();
	}

	public Cliente(String run, String nombre, String apellido, Integer antiguedad, CategoriaEnum categoria) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
		this.categoria = categoria;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public CategoriaEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "-------------------Datos del Cliente-------------------\n"+"RUN: " + run + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nA?os como Cliente: " + antiguedad
				+ "\nCategoria del Cliente: " + categoria + "\n";
	}
	
	
	

}
