package tp_grupo2;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.Assert;
import modeloDatos.Ticket;
import modeloNegocio.Agencia;

public class TestTicket32 {
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
		//Agencia.getInstance().setLimitesRemuneracion(100, 200);
		this.ticket = new Ticket(util.Constantes.INDISTINTO, 201, util.Constantes.JORNADA_EXTENDIDA, util.Constantes.MANAGMENT, util.Constantes.EXP_MUCHA, util.Constantes.TERCIARIOS);
		this.otro = new Ticket(util.Constantes.PRESENCIAL, 101, util.Constantes.JORNADA_COMPLETA, util.Constantes.SENIOR, util.Constantes.EXP_MEDIA, util.Constantes.SECUNDARIOS);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetComparacionLocacion() {
		Assert.assertEquals("Error en getComparacionLocacion() 32", -1.0, this.ticket.getComparacionLocacion(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionRemuneracion() {
		Assert.assertEquals("Error en getComparacionRemuneracion() 32", 1.0, this.ticket.getComparacionRemuneracion(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionJornada() {
		Assert.assertEquals("Error en getComparacionJornada() 32", 1.0, this.ticket.getComparacionJornada(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionPuesto() {
		Assert.assertEquals("Error en getComparacionPuesto() 32", 1.0, this.ticket.getComparacionPuesto(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionExperiencia() {
		Assert.assertEquals("Error en getComparacionExperiencia() 32", -1.5, this.ticket.getComparacionExperiencia(this.otro), 0.0001);
	}
	
	@Test
	public void testGetComparacionEstudios() {
		Assert.assertEquals("Error en getComparacionEstudios() 32", -1.5, this.ticket.getComparacionEstudios(this.otro), 0.0001);
	}
}
