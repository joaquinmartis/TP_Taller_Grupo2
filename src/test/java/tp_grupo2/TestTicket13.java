package tp_grupo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Ticket;
import modeloNegocio.Agencia;

public class TestTicket13 {
	Ticket ticket;
	Ticket otro;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Agencia.getInstance().setLimitesRemuneracion(1000, 2000);
		this.ticket = new Ticket(util.Constantes.HOME_OFFICE, 999, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS);
		this.otro = new Ticket(util.Constantes.INDISTINTO, 2001, util.Constantes.JORNADA_EXTENDIDA, util.Constantes.MANAGMENT, util.Constantes.EXP_MUCHA, util.Constantes.TERCIARIOS);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetComparacionLocacion() {
		Assert.assertEquals("Error en getComparacionLocacion() 13", 1.0, this.ticket.getComparacionLocacion(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionRemuneracion() {
		Assert.assertEquals("Error en getComparacionRemuneracion() 13", -1.0, this.ticket.getComparacionRemuneracion(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionJornada() {
		Assert.assertEquals("Error en getComparacionJornada() 13", -1.0, this.ticket.getComparacionJornada(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionPuesto() {
		Assert.assertEquals("Error en getComparacionPuesto() 13", -1.0, this.ticket.getComparacionPuesto(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionExperiencia() {
		Assert.assertEquals("Error en getComparacionExperiencia() 13", 2.0, this.ticket.getComparacionExperiencia(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionEstudios() {
		Assert.assertEquals("Error en getComparacionEstudios() 13", 2.0, this.ticket.getComparacionEstudios(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionTotal() {
		Assert.assertEquals("Error en getComparacionTotal() 13",2, this.ticket.getComparacionTotal(this.otro), 0.0001);
	}
}
