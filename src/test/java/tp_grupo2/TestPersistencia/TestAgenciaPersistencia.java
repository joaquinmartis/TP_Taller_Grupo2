package tp_grupo2.TestPersistencia;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloNegocio.Agencia;
import persistencia.IPersistencia;
import persistencia.PersistenciaXML;

public class TestAgenciaPersistencia {
	Agencia agencia;
	IPersistencia persistencia;
	
	@BeforeClass

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
		
		this.persistencia = new PersistenciaXML();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGuardarAgenciaPersistenciaNull() {
		this.agencia.setPersistencia(null);
		try {
			Assert.assertFalse("Error en guardarAgenciaPersistencia", this.agencia.guardarAgencia("Nombre"));
		} catch (Exception e) {
			fail("No debería lanzar excepcion en testGuardarAgenciaPersistenciaNull()");			
		}
	}
	
	@Test
	public void testGuardarAgenciaPersistenciaCorrecto() {
		this.agencia.setPersistencia(this.persistencia);
		try {
			Assert.assertTrue("Error en guardarAgenciaPersistencia", this.agencia.guardarAgencia("AgenciaPersistencia.xml"));
		} catch (Exception e) {
			fail("No debería lanzar excepcion en testGuardarAgenciaPersistenciaNull()");			
		}
	}
	
	@Test
	public void testCargarAgenciaPersistenciaNull() {
		this.agencia.setPersistencia(null);
		try {
			Assert.assertFalse("Error en cargarAgenciaPersistencia", this.agencia.cargarAgencia("Nombre"));
		} catch (Exception e) {
			fail("No debería lanzar excepcion en testCargarAgenciaPersistenciaNull()");
		}
	}

	@Test
	public void testCargarAgenciaCorrecto() {
		this.agencia.setPersistencia(this.persistencia);
		try {
			Assert.assertTrue("Error en cargarAgenciaPersistencia", this.agencia.cargarAgencia("AgenciaPersistencia.xml"));
		} catch (Exception e) {
			fail("No debería lanzar excepcion en testCargarAgenciaCorrecto()");
		}
	}
}
