package tp_grupo2;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Empleador;
import modeloDatos.Ticket;

public class TestEmpleadorSinParametros {
	Empleador empleador;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.empleador = new Empleador();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSetUsserName() {
		this.empleador.setUsserName("juancito");
		Assert.assertEquals("Error en empleador.setUsserName()", "juancito", this.empleador.getUsserName());
	}

	@Test
	public void testSetPassword() {
		this.empleador.setPassword("qwerty123");
		Assert.assertEquals("Error en empleador.setPassword()", "qwerty123", this.empleador.getPassword());
	}

	@Test
	public void testSetRealName() {
		this.empleador.setRealName("Juan Cito");
		Assert.assertEquals("Error en empleador.setRealName()", "Juan Cito", this.empleador.getRealName());
	}

	@Test
	public void testSetTelefono() {
		this.empleador.setTelefono("+54 9 223 666-1234");
		Assert.assertEquals("Error en empleador.setTelefono()", "+54 9 223 666-1234", this.empleador.getTelefono());
	}

	@Test
	public void testSetRubro() {
		this.empleador.setRubro(util.Constantes.SALUD);
		Assert.assertEquals("Error en empleador.setRubro()", util.Constantes.SALUD, this.empleador.getRubro());
	}

	@Test
	public void testSetTipoPersona() {
		this.empleador.setTipoPersona(util.Constantes.JURIDICA);
		Assert.assertEquals("Error en empleador.setTipoPersona()", util.Constantes.JURIDICA, this.empleador.getTipoPersona());
	}
	
	@Test
	public void testCalculaComision() {
		Ticket ticketComision = new Ticket(util.Constantes.HOME_OFFICE, 80000, util.Constantes.JORNADA_COMPLETA, util.Constantes.JUNIOR, util.Constantes.EXP_MEDIA, util.Constantes.TERCIARIOS);
		Assert.assertEquals("Error en el CalculaComision()", 48000.0, this.empleador.calculaComision(ticketComision), 0.00001);
	}

}
