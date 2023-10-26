package tp_grupo2;

import static org.junit.Assert.fail;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Contratacion;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;

public class TestContratacionSinParametros {
	private Contratacion contratacion;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.contratacion = new Contratacion();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSetEmpleado() {
		EmpleadoPretenso empleado = new EmpleadoPretenso();
		this.contratacion.setEmpleado(empleado);
		Assert.assertEquals("Error en contratacion.setEmpleado()", empleado, this.contratacion.getEmpleado());
	}
	
	@Test
	public void testSetEmpleador() {
		Empleador empleador = new Empleador();
		this.contratacion.setEmpleador(empleador);
		Assert.assertEquals("Error en contratacion.setEmpleador()", empleador, this.contratacion.getEmpleador());
	}
	
	@Test
	public void testSetFecha() {
		GregorianCalendar fecha = new GregorianCalendar();
		this.contratacion.setFecha(fecha);
		Assert.assertEquals("Error en contratacion.setFecha()", fecha, this.contratacion.getFecha());
	}
	
}
