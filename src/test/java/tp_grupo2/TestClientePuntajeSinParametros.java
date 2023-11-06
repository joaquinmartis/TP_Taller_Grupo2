package tp_grupo2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
		this.cliente = new ClientePuntaje();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testSetCliente() {
		EmpleadoPretenso empleado = new EmpleadoPretenso();
		this.cliente.setCliente(empleado);
		Assert.assertEquals("Error en setCliente()", empleado, this.cliente.getCliente());
	}
	
	@Test
	public void testSetPuntaje() {
		this.cliente.setPuntaje(30);
		Assert.assertEquals("Error en setPuntaje()", 30.0, this.cliente.getPuntaje(), 0.00001);
	}
	
	

}
