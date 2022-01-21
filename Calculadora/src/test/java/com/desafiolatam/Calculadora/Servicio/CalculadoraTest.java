package com.desafiolatam.Calculadora.Servicio;



import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Modelo.Datos;
import Servicio.Calculadora;

@DisplayName("Tests Clase Calculadora")
public class CalculadoraTest {
	private Calculadora calculadora = new Calculadora();
	private static Logger logger = Logger.getLogger("com.desafiolatam.Calculadora.servicio.CalculadoraTest");

	@BeforeAll
	static void setup() {
		logger.info("Inicio clase de prueba");
	}
	
	@Test
	public void testSumar() {
		logger.info("info test sumar");
		Datos datos = new Datos(50,10);
		int respuesta = calculadora.sumar(datos);
		assertEquals(60,respuesta);
	}
	
	@Test
	public void testRestar() {
		logger.info("info test restar");
		Datos datos = new Datos(50,10);
		int respuesta = calculadora.restar(datos);
		assertEquals(40, respuesta);
	}
	@Test
	public void testMultiplicar() {
		logger.info("info test multiplicar");
		Datos datos = new Datos(50,10);
		int respuesta = calculadora.multiplicar(datos);
		assertEquals(500,respuesta);
	}
	@Test
	public void testDividir() {
		logger.info("info test dividir");
		Datos datos = new Datos(50,10);
		double respuesta = calculadora.dividir(datos);		
		assertEquals(respuesta, 5);
	}

}
