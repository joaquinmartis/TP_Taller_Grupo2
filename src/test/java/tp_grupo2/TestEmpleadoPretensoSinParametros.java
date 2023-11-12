package tp_grupo2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.EmpleadoPretenso;
import modeloDatos.Ticket;

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
	
	//DE EMPLEADO PRETENSO
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
		Ticket ticketComision = new Ticket(util.Constantes.HOME_OFFICE, 80000, util.Constantes.JORNADA_COMPLETA, util.Constantes.JUNIOR, util.Constantes.EXP_MEDIA, util.Constantes.TERCIARIOS);
		Assert.assertEquals("Error en el CalculaComision()", 64000.0, this.empleadoPretenso.calculaComision(ticketComision), 0.00001);
		// Empleado junior --> 80% * sueldoPretenso
	}
	

}
