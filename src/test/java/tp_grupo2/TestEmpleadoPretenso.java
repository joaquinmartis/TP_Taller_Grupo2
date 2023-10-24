package tp_grupo2;

import static org.junit.Assert.*;
import junit.framework.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.EmpleadoPretenso;
import modeloDatos.Ticket;
import modeloDatos.Usuario;

public class TestEmpleadoPretenso {
	private EmpleadoPretenso empleadoPretenso;
	private Ticket ticket;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.empleadoPretenso = new EmpleadoPretenso("PedroRodriguez1", "boca2023", "Pedro Rodriguez", "223 594-3482","Rodriguez",36);
		this.ticket = new Ticket()
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEmpleadoPretenso() {
	}
	
	@Test
	//-------------HACER--------------
	public void testCalculaComision() {
		assertEquals("Error en el CalculaComision()", this.empleadoPretenso.calculaComision(), "hola123");
	}
	
	@Test
	public void testGetApellido() {
		assertEquals("Error en el getApellido()", this.empleadoPretenso.getApellido(), "Rodriguez");
	}
	
	@Test
	public void testSetApellido() {
		assertEquals("Error en el setApellido()", this.empleadoPretenso.getEdad(),36);
	}
	
	@Test
	public void testSetEdad() {
		assertEquals("Error en el setEdad()", this.usuario.getTelefono(), "223 594-3482");
	}
	
	


}
