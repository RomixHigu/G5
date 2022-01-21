package com.td.desafio.latam.f20211217.models;

public class Auto {
	//atributos
	private String color;
	private Float velocidad;//Float con mayuscula de tipo objeto, valor = null
	private int ruedas; //int primitivo, valor = 0;
	private Float motor;
	
	//constructores
	public Auto() {
		super();
	}
	
	public Auto(String color, int ruedas) {
		super();
		this.color = color;
		this.ruedas = ruedas;
	}

	public Auto(String color, Float velocidad, int ruedas, Float motor) {
		super();
		this.color = color;
		this.velocidad = velocidad;
		this.ruedas = ruedas;
		this.motor = motor;
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public Float getMotor() {
		return motor;
	}

	public void setMotor(Float motor) {
		this.motor = motor;
	}
	//metodos
	@Override
	public String toString() {
		return "Caracteristicas del Auto: Color=" + color + ", Velocidad=" + velocidad + ", Ruedas=" + ruedas + ", Motor=" + motor + "]";
	}
	
	public void miMetodo() {
		System.out.println("Este es mi metodo del auto");
	}
	
	public void imprimirAlimento (Alimento alimento) {
		System.out.println(alimento.getComida()+" - "+alimento.getDescripcion());
	}
}
