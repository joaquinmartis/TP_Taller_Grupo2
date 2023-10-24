package tp_grupo2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.EmpleadoPretenso;
import modeloDatos.Ticket;

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
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	//-------------HACER--------------
	public void testCalculaComision() {
		assertEquals("Error en el CalculaComision()", this.empleadoPretenso.calculaComision(new Ticket(util.Constantes.HOME_OFFICE,80000,util.Constantes.JORNADA_COMPLETA,util.Constantes.JUNIOR,util.Constantes.EXP_MEDIA,util.Constantes.TERCIARIOS)),);
	}
	
	@Test
	public void testGetApellido() {
		assertEquals("Error en el getApellido()", this.empleadoPretenso.getApellido(), "Rodriguez");
	}
	
	@Test
	public void testGetEdad() {
		assertEquals("Error en el setApellido()", this.empleadoPretenso.getEdad(),36);
	}
	
	@Test
	public void testGetCantidato() {
		
	}
	
	@Test
	public void testSetCantidato() {
		
	}
	
	@Test
	public void testGetListaDePostulantes() {
		
	}
	
	@Test
	public void testGetPuntaje() {
		
	}

	@Test
	public void testGetTicket() {
		
	}
	
	@Test
	public void testSetListaDePostulantes() {
		
	}

	@Test
	public void testSetPuntaje() {
		
	}
	
	@Test
	public void testSetTicket() {
		
	}

}
