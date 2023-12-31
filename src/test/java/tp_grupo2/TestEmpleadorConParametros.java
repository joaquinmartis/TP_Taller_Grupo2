package tp_grupo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Empleador;
import modeloDatos.Ticket;


public class TestEmpleadorConParametros {
	Empleador empleador;
	Ticket ticket;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.empleador = new Empleador("juancito", "qwerty123", "Juan Cito", "+54 9 223 666-1234", util.Constantes.SALUD, util.Constantes.JURIDICA);
		this.ticket = new Ticket(util.Constantes.HOME_OFFICE, 999, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCalculaComision() {
		Ticket ticketComision = new Ticket(util.Constantes.HOME_OFFICE, 80000, util.Constantes.JORNADA_COMPLETA, util.Constantes.JUNIOR, util.Constantes.EXP_MEDIA, util.Constantes.TERCIARIOS);
		Assert.assertEquals("Error en el CalculaComision()", 48000.0, this.empleador.calculaComision(ticketComision), 0.00001);
	}

	
	// DE USUARIO
	@Test
	public void testGetUsserName() {
		Assert.assertEquals("Error en empleador.getUsserName()", "juancito", this.empleador.getUsserName());
	}

	@Test
	public void testGetPassword() {
		Assert.assertEquals("Error en empleador.getPassword()", "qwerty123", this.empleador.getPassword());
	}

	@Test
	public void testGetRealName() {
		Assert.assertEquals("Error en empleador.getRealName()", "Juan Cito", this.empleador.getRealName());
	}

	@Test
	public void testGetTelefono() {
		Assert.assertEquals("Error en empleador.getTelefono()", "+54 9 223 666-1234", this.empleador.getTelefono());
	}

	@Test
	public void testGetRubro() {
		Assert.assertEquals("Error en empleador.getRubro()", util.Constantes.SALUD, this.empleador.getRubro());
	}

	@Test
	public void testgetTipoPersona() {
		Assert.assertEquals("Error en empleador.getTipoPersona()", util.Constantes.JURIDICA, this.empleador.getTipoPersona());
	}
	

}
