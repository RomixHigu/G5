package com.desafiolatam.gs_testing;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.logging.Logger;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import modelos.Persona;
import servicios.ServicioPersona;

@DisplayName("Tests Clase ServicioPersona")
public class ServicioPersonaTest {

	private ServicioPersona servicioPersona = new ServicioPersona();
	private static Logger logger = Logger.getLogger("com.desafiolatam.gs-testing.servicios.ServicioPersonaTest");

	@BeforeAll
	static void setup() {
		logger.info("Inicio clase de prueba");
	}

	@BeforeEach
	void init() {
		logger.info("Inicio metodo de prueba");
	}

	@AfterEach
	void tearDown() {
		logger.info("Metodo de prueba finalizado");
	}

	@AfterAll
	static void done() {
		logger.info("Fin clase de prueba");
	}

	@Test
	public void testCrearPersona() {
		logger.info("info test crear persona");
		Persona juanito = new Persona("1234-1", "Juanito");
		String respuestaServicio = servicioPersona.crearPersona(juanito);
		assertEquals("Creada", respuestaServicio);
		assertTrue(true);
	}

	@Test
	public void testActualizarPersona() {
		logger.info("info test actualizar persona");
		Persona pepe = new Persona("1234-2", "Pepe");
		String respuestaServicio = servicioPersona.actualizarPersona(pepe);
		assertEquals("Actualizada", respuestaServicio);
	}
	
	@Test
	public void testEliminarPersona() {
		logger.info("info test eliminar persona");
		Persona juanito = new Persona ("1234-1","Juanito");
		String respuestaServicio = servicioPersona.eliminarPersona(juanito);
		assertEquals("Eliminada", respuestaServicio);
	}
	
	@Test
	public void testListarPersona() {
		logger.info("info test listar persona");		
		Map<String, String> respuestaServicio = servicioPersona.listarPersonas();
		assertNotNull(respuestaServicio);
	}
	

}
