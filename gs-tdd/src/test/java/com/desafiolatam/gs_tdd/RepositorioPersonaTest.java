package com.desafiolatam.gs_tdd;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

//en caso de error, cambiar a importacion

import modelos.Persona;
import repositorio.RepositorioPersona;

public class RepositorioPersonaTest {
	private RepositorioPersona repositorioPersona = mock(RepositorioPersona.class);
	
	@Test
	public void testCrearPersona() {
		Persona pepe = new Persona("1234-1","Pepe");
		when(repositorioPersona.crearPersona(pepe)).thenReturn("OK");
		//when(repositorioPersona.crearPersona(null)).thenThrow(new NullPointerException());
		String crearPersonaRes = repositorioPersona.crearPersona(pepe);
		assertEquals("OK", crearPersonaRes);
		verify(repositorioPersona).crearPersona(pepe);
	}
	
	@Test
	public void testActualizarPersona() {
		Persona juanito = new Persona("1234-1","Juanito");
		when(repositorioPersona.actualizarPersona(juanito)).thenReturn("OK");
		String actualizarPersonaRes = repositorioPersona.actualizarPersona(juanito);
		assertEquals("OK",actualizarPersonaRes);
		verify(repositorioPersona).actualizarPersona(juanito);
	}
	@Test
	public void testListarPersona() {		 	
		Map<String, String> mockRespuesta = new HashMap<>();
		when(repositorioPersona.listarPersona()).thenReturn(mockRespuesta);
		Map<String, String> listarPersonaRes = repositorioPersona.listarPersona();
		assertEquals(mockRespuesta,listarPersonaRes);
		verify(repositorioPersona).listarPersona();
		
	}
	@Test
	public void testEliminarPersona() {
		Persona hugo = new Persona("1234-1","Hugo");
		when(repositorioPersona.eliminarPersona(hugo)).thenReturn("OK");
		String eliminarPersonaRes = repositorioPersona.eliminarPersona(hugo);
		assertEquals("OK",eliminarPersonaRes);
		verify(repositorioPersona).eliminarPersona(hugo);
	}
	

}
