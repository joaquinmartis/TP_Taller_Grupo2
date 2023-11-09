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
import modeloDatos.Empleador;

public class TestClientePuntajeSinParametros {
	ClientePuntaje cliente;
	Empleador empleador;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.empleador = new Empleador();
		this.cliente = new ClientePuntaje();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testSetCliente() {
		Empleador empleador = new Empleador();
		this.cliente.setCliente(empleador);
		Assert.assertEquals("Error en setCliente()", empleador, this.cliente.getCliente());
	}
	
	@Test
	public void testSetPuntaje() {
		this.cliente.setPuntaje(30);
		Assert.assertEquals("Error en setPuntaje()", 30.0, this.cliente.getPuntaje(), 0.00001);
	}
	
	

}
