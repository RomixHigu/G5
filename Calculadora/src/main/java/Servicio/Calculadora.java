package Servicio;

import Modelo.Datos;

public class Calculadora {
	
	public int sumar(Datos datos) {
		
		int suma = datos.getNumero1() + datos.getNumero2();
		return suma;
	}
	
	public int restar(Datos datos) {
		int resta = 0;
		if (datos.getNumero1() > datos.getNumero2()) {
			resta = datos.getNumero1() - datos.getNumero2();
			
		} else {
			resta = datos.getNumero2() - datos.getNumero1();
		}
		return resta;
	}
	
	public int multiplicar(Datos datos) {
		int multi = datos.getNumero1() * datos.getNumero2();
		return multi;
	}
	
	public double dividir (Datos datos) {
		double div = (double) (datos.getNumero1() / datos.getNumero2());
		return div;
	}

}
