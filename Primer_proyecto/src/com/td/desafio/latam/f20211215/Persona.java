package com.td.desafio.latam.f20211215;

import java.util.Date;

public class Persona {
		//atributos
		private String nombre;
		private int edad;
		private Date fechaNaciemiento;
		
		//constructor vacio
		public Persona() {
			
		}
		//constructor con parametros
		public Persona(String nombre, int edad, Date fechaNaciemiento) {
			super();
			this.nombre = nombre;
			this.edad = edad;
			this.fechaNaciemiento = fechaNaciemiento;
		}
		//get y set
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public Date getFechaNaciemiento() {
			return fechaNaciemiento;
		}
		public void setFechaNaciemiento(Date fechaNaciemiento) {
			this.fechaNaciemiento = fechaNaciemiento;
		}
	
		//metodos
	public static void caminar () {
		
	}
	public static void comer () {
		
	}
	public static void dormir () {
		
	}
}