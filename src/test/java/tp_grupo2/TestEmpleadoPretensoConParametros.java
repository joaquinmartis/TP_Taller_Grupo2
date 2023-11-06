package tp_grupo2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.EmpleadoPretenso;
import modeloDatos.Ticket;

public class TestEmpleadoPretensoConParametros {
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
		this.empleadoPretenso = new EmpleadoPretenso("PedroRodriguez1", "boca2023", "Pedro Rodriguez", "+54 9 223 594-3482","Rodriguez",36);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCalculaComision() {
		fail("Not yet implemented");
		Assert.assertEquals("Error en el CalculaComision()", this.empleadoPretenso.calculaComision(new Ticket(util.Constantes.HOME_OFFICE,80000,util.Constantes.JORNADA_COMPLETA,util.Constantes.JUNIOR,util.Constantes.EXP_MEDIA,util.Constantes.TERCIARIOS)));
	}

	@Test
	public void testGetUsserName() {
		Assert.assertEquals("Error en el getUsserName()", "PedroRodriguez1", this.empleadoPretenso.getUsserName());
	}
	
	@Test
	public void testGetPassword() {
		Assert.assertEquals("Error en el getPassword()", "boca2023", this.empleadoPretenso.getPassword());
	}

	@Test
	public void testGetRealName() {
		Assert.assertEquals("Error en el getRealName()", "Pedro Rodriguez", this.empleadoPretenso.getRealName());
	}

	@Test
	public void testGetTelefono() {
		Assert.assertEquals("Error en el getTelefono()", "+54 9 223 594-3482", this.empleadoPretenso.getTelefono());
	}
	
	@Test
	public void testGetApellido() {
		Assert.assertEquals("Error en el getApellido()", "Rodriguez", this.empleadoPretenso.getApellido());
	}
	
	@Test
	public void testGetEdad() {
		Assert.assertEquals("Error en el getApellido()", 36, this.empleadoPretenso.getEdad());
	}

}
