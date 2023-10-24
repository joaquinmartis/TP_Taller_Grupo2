package tp_grupo2;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import modeloDatos.Ticket;

public class TestTicketConParametros {
	Ticket ticket;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.ticket = new Ticket(util.Constantes.PRESENCIAL, 10000, util.Constantes.JORNADA_COMPLETA, util.Constantes.JUNIOR, util.Constantes.EXP_MEDIA, util.Constantes.PRIMARIOS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetEstudios() {
		Assert.assertEquals("Error en getEstudios()", this.ticket.getEstudios(), util.Constantes.PRIMARIOS);
	}
	
	@Test
	public void testGetExperiencia() {
		Assert.assertEquals("Error en getExperiencia()", this.ticket.getExperiencia(), util.Constantes.EXP_MEDIA);
	}
	
	@Test
	public void testGetJornada() {
		Assert.assertEquals("Error en getJornada()", this.ticket.getJornada(), util.Constantes.JORNADA_COMPLETA);
	}
	
	@Test
	public void testGetLocacion() {
		Assert.assertEquals("Error en getLocacion()", this.ticket.getLocacion(), util.Constantes.PRESENCIAL);
	}
	
	@Test
	public void testGetPuesto() {
		Assert.assertEquals("Error en getPuesto()", this.ticket.getPuesto(), util.Constantes.JUNIOR);
	}
	
	@Test
	public void testGetRemuneracion() {
		Assert.assertEquals("Error en getRemuneracion()", this.ticket.getRemuneracion(), 10000);
	}

}
