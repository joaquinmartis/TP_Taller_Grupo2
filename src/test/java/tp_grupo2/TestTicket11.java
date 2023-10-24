package tp_grupo2;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import modeloDatos.Ticket;

public class TestTicket11 {
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
		this.ticket = new Ticket(util.Constantes.HOME_OFFICE, 10000, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS);
		this.otro = new Ticket(util.Constantes.HOME_OFFICE, 10000, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetComparacionLocacion() {
		Assert.assertEquals("Error en getComparacionLocacion() 11", 1.0, this.ticket.getComparacionLocacion(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionRemuneracion() {
		//Assert.assertEquals("Error en getComparacionRemuneracion() 11", 1.0, this.ticket.getComparacionRemuneracion(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionJornada() {
		Assert.assertEquals("Error en getComparacionJornada() 11", 1.0, this.ticket.getComparacionJornada(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionPuesto() {
		Assert.assertEquals("Error en getComparacionPuesto() 11", 1.0, this.ticket.getComparacionPuesto(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionExperiencia() {
		Assert.assertEquals("Error en getComparacionExperiencia() 11", 1.0, this.ticket.getComparacionExperiencia(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionEstudios() {
		Assert.assertEquals("Error en getComparacionEstudios() 11", 1.0, this.ticket.getComparacionEstudios(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionTotal() {
		Assert.assertEquals("Error en getComparacionTotal() 11", 6.0, this.ticket.getComparacionTotal(this.otro), 0.0001);
	}
}
