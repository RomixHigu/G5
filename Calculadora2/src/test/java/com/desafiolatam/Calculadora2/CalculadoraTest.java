package com.desafiolatam.Calculadora2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import Modelo.Calculadora;


public class CalculadoraTest {
	private Calculadora calculadora = new Calculadora();
	
	@Test
	public void testSumar() {		
		int respuesta = calculadora.sumar(5,1);
		assertEquals(6,respuesta);
	}
	
	@Test
	public void testRestar() {		
		int respuesta = calculadora.restar(5,1);
		assertEquals(4,respuesta);
	}
	
	@Test
	public void testMultiplicar() {		
		int respuesta = calculadora.multiplicar(5,1);
		assertEquals(5,respuesta  );	
	}
	
	@Test
	public void testDividir() {		
		float respuesta = calculadora.dividir(5,1);
		assertEquals(5,respuesta,0);		
	}

}
