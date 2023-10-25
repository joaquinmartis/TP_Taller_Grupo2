package tp_grupo2;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.Assert;
import modeloDatos.Ticket;

public class TestTicketSinParametros {
	Ticket ticket;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.ticket = new Ticket();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetEstudios() {
		this.ticket.setEstudios(util.Constantes.PRIMARIOS);
		Assert.assertEquals("Error en setEstudios()", this.ticket.getEstudios(), util.Constantes.PRIMARIOS);
	}
	
	@Test
	public void testSetExperiencia() {
		this.ticket.setExperiencia(util.Constantes.EXP_MEDIA);
		Assert.assertEquals("Error en setExperiencia()", this.ticket.getExperiencia(), util.Constantes.EXP_MEDIA);
	}
	
	@Test
	public void testSetJornada() {
		this.ticket.setJornada(util.Constantes.JORNADA_COMPLETA);
		Assert.assertEquals("Error en setJornada()", this.ticket.getJornada(), util.Constantes.JORNADA_COMPLETA);
	}
	
	@Test
	public void testSetLocacion() {
		this.ticket.setLocacion(util.Constantes.PRESENCIAL);
		Assert.assertEquals("Error en setLocacion()", this.ticket.getLocacion(), util.Constantes.PRESENCIAL);
	}
	
	@Test
	public void testSetPuesto() {
		this.ticket.setPuesto(util.Constantes.JUNIOR);
		Assert.assertEquals("Error en setPuesto()", this.ticket.getPuesto(), util.Constantes.JUNIOR);
	}
	
	@Test
	public void testSetRemuneracion() {
		this.ticket.setRemuneracion(10000);
		Assert.assertEquals("Error en setRemuneracion()", this.ticket.getRemuneracion(), 10000);
	}

}
