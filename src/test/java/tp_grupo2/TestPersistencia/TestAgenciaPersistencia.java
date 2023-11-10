package tp_grupo2.TestPersistencia;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Contratacion;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloNegocio.Agencia;
import persistencia.IPersistencia;
import persistencia.PersistenciaXML;

public class TestAgenciaPersistencia {
	Agencia agencia;
	IPersistencia persistencia;
	
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
		
		this.persistencia = new PersistenciaXML();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	public void testSetPersistencia() {
		this.agencia.setPersistencia(this.persistencia);
		Assert.assertEquals("Error en setPersistencia", this.persistencia, this.agencia.getPersistencia());
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
	public void testGuardarAgenciaPersistenciaNull() {
		this.agencia.setPersistencia(null);
		try {
			Assert.assertFalse("Error en guardarAgenciaPersistencia", this.agencia.guardarAgencia("Nombre"));
		} catch (Exception e) {
			fail("No debería lanzar excepcion en testGuardarAgenciaPersistenciaNull()");			
		}
	}
}
