package tp_grupo2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Cliente;
import modeloDatos.ClientePuntaje;
import modeloDatos.EmpleadoPretenso;

public class TestClientePuntajeSinParametros {
	ClientePuntaje cliente;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.cliente=new ClientePuntaje();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testSetCliente() {
		EmpleadoPretenso e = new EmpleadoPretenso();
		this.cliente.setCliente(e);
		assertEquals("Error en setCliente()",this.cliente.getCliente(),e);
	}
	
	@Test
	public void testSetPuntaje() {
		this.cliente.setPuntaje(30);
		assertEquals("Error en setPuntaje()",this.cliente.getPuntaje(),30);
	}
	
	@Test
	public void testGetPuntaje() {
		this.cliente.setPuntaje(28);
		assertEquals("Error en setPuntaje()",this.cliente.getPuntaje(),28);
	}
	
	

}
