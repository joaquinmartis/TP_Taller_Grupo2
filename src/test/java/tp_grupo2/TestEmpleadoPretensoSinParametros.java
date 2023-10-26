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

public class TestEmpleadoPretensoSinParametros {
	EmpleadoPretenso empleadoPretenso;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.empleadoPretenso = new EmpleadoPretenso();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSetApellido() {
		this.empleadoPretenso.setApellido("Rodriguez");
		assertEquals("Error en el seteo de apellido", "Rodriguez", this.empleadoPretenso.getApellido());
	}
	
	@Test
	public void testSetEdad() {
		this.empleadoPretenso.setEdad(36);
		assertEquals("Error en el seteo de la edad", 36, this.empleadoPretenso.getEdad());
	}
	
	@Test
	public void testCalculaComision() {
		fail("Not yet implemented");
	}

}
