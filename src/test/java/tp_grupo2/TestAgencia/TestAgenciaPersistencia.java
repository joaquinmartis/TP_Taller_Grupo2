package tp_grupo2.TestAgencia;

import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloNegocio.Agencia;

public class TestAgenciaPersistencia {
	Agencia agencia;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		/* Escenario donde no hay ni empleados ni empleadores */
		this.agencia = Agencia.getInstance();
		this.agencia.getEmpleados().clear();
		this.agencia.getEmpleadores().clear();
		this.agencia.getContrataciones().clear();
		this.agencia.getComisionesUsuarios().clear();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCargarAgenciaPersistenciaNull() {
		this.agencia.setPersistencia(null);
		try {
			Assert.assertFalse("Hola!", this.agencia.cargarAgencia("Nombre"));
		} catch (Exception e) {
			fail("No debería lanzar excepcion en testCargarAgenciaPersistenciaNull()");
		}
	}
	
	@Test
	public void testGuardarAgenciaPersistenciaNull() {
		this.agencia.setPersistencia(null);
		try {
			Assert.assertFalse("Hola!", this.agencia.guardarAgencia("Nombre"));
		} catch (Exception e) {
			fail("No debería lanzar excepcion en testGuardarAgenciaPersistenciaNull()");			
		}
	}
}
