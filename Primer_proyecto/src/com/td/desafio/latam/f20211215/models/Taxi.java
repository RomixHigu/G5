package com.td.desafio.latam.f20211215.models;

public class Taxi {

	private String color;
	private String patente;
	private int valorPasaje;
	
	public Taxi() {
		super();
	}
	
	
	public Taxi(String color, String patente, int valorPasaje) {
		super();
		this.color = color;
		this.patente = patente;
		this.valorPasaje = valorPasaje;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public int getValorPasaje() {
		return valorPasaje;
	}


	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}


	public static void pagarPasaje (int pasaje) {
}


	@Override
	public String toString() {
		return "Taxi [color=" + color + ", patente=" + patente + ", valorPasaje=" + valorPasaje + "]";
	}
	
}