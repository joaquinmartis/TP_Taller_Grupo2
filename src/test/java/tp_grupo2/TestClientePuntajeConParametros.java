package tp_grupo2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.ClientePuntaje;
import modeloDatos.EmpleadoPretenso;

public class TestClientePuntajeConParametros {
	ClientePuntaje cliente;
	EmpleadoPretenso empleado;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.empleado = new EmpleadoPretenso();
		this.cliente = new ClientePuntaje(30.0, this.empleado);
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testGetCliente() {
		assertEquals("Error en getCliente()", this.empleado, this.cliente.getCliente());
	}
	
	@Test
	public void testGetPuntaje() {
		assertEquals("Error en getPuntaje()", 30.0, this.cliente.getPuntaje(), 0.0001);
	}
	
	@Test 
	public void testSetPuntaje() {
		this.cliente.setPuntaje(-100);
		assertEquals(-100,this.cliente.getPuntaje());
	}
	
	@Test
	public void testSetCliente() {
		Empleador empleador=new Empleador();
		this.cliente.setCliente(empleador);
		assertEquals(empleador,this.cliente.getCliente());
	}
}
