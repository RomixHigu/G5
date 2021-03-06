package test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import modelo.CategoriaEnum;
import modelo.Cliente;
import servicio.ClienteServicio;

public class ClienteServicioTest {
	private ClienteServicio clienteServ = new ClienteServicio();
	

	@Test
	public void agregarClienteTest() {
		Cliente cliente1 = new Cliente("1234-1","Ana","Perez",2,CategoriaEnum.ACTIVO);
		String respuesta = clienteServ.agregarCliente(cliente1);
		assertEquals("Cliente creado", respuesta);		
	}
	
	@Test
	public void agregarClienteNullTest() {
		Cliente cliente = new Cliente();
		String respuesta = clienteServ.agregarCliente(cliente);
		assertNotNull(respuesta);
	}

}
