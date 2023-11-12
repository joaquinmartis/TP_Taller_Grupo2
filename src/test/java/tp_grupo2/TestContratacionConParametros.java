package tp_grupo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Contratacion;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;

public class TestContratacionConParametros {
	private Contratacion contratacion;
	private EmpleadoPretenso empleado;
	private Empleador empleador;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.empleado = new EmpleadoPretenso();
		this.empleador = new Empleador();
		this.contratacion = new Contratacion(empleador, empleado);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetEmpleado() {
		Assert.assertEquals("Error en contratacion.getEmpleado()", this.empleado, this.contratacion.getEmpleado());
	}
	
	@Test
	public void testGetEmpleador() {
		Assert.assertEquals("Error en contratacion.getEmpleador()", this.empleador, this.contratacion.getEmpleador());
	}
	
	@Test
	public void testGetFecha() {
		Assert.assertFalse(null == this.contratacion.getFecha());
	}
	
	
}
