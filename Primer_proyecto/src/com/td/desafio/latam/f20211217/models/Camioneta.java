package com.td.desafio.latam.f20211217.models;

public class Camioneta extends Vehiculo {

	private String pickup;

	public Camioneta() {
		super();
	}

	public Camioneta(String pickup) {
		super();
		this.pickup = pickup;
	}

	public Camioneta(String color, Float velocidad, int ruedas, Float motor,String pickup) {
		super(color, velocidad, ruedas, motor);
		this.pickup = pickup;
	}

	@Override
	public String toString() {
		return "Camioneta [pickup=" + pickup + ", color=" + color + ", velocidad=" + velocidad + ", ruedas=" + ruedas
				+ ", motor=" + motor + "]";
	}

}
