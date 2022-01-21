package com.td.desafio.latam.f20211217.models;

public class Zoologico {
	private Ave ave;
	private Oso oso;
	private static int diasAbierto;
	private String direccion;

	public static int agregarDias() {
		if (diasAbierto < 7 && diasAbierto > 0)
			;
		return diasAbierto;

	}

	public Zoologico(Ave ave, Oso oso, String direccion) {
		super();
		this.ave = ave;
		this.oso = oso;
		this.direccion = direccion;
	}

	public Zoologico() {
		super();

	}

	public Ave getAve() {
		return ave;
	}

	public void setAve(Ave ave) {
		this.ave = ave;
	}

	public Oso getOso() {
		return oso;
	}

	public void setOso(Oso oso) {
		this.oso = oso;
	}

	public static int getDiasAbierto() {
		return diasAbierto;
	}

	public static void setDiasAbierto(int diasAbierto) {
		Zoologico.diasAbierto = diasAbierto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Zoologico [ave=" + ave + ", oso=" + oso + ", direccion=" + direccion + "]";
	}

	

}
