package tp_grupo2.TestAgencia;

import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import excepciones.ImposibleCrearEmpleadoException;
import excepciones.ImposibleCrearEmpleadorException;
import excepciones.ImposibleModificarTicketsException;
import excepciones.NewRegisterException;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloDatos.Ticket;
import modeloNegocio.Agencia;

public class TestAgenciaListasConElementosEstadoContratacionFalse {
	Agencia agencia;
	EmpleadoPretenso empleado;
	Empleador empleador;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		/* Escenario donde hay un empleado y un empleador
		 * estadoContratacion = false
		 *  */
		this.agencia = Agencia.getInstance();
		this.agencia.setEmpleadores(new HashMap<String,Empleador>());
		this.agencia.setEmpleados(new HashMap<String, EmpleadoPretenso>());
		this.empleado = (EmpleadoPretenso) this.agencia.registroEmpleado("PepePretenso", "contrasenia", "Pepe", "Gomez", "2234434312", 21);
		this.empleador = (Empleador) this.agencia.registroEmpleador("PepeEmpleador", "contrasenia", "Pepe", "Gomez", util.Constantes.FISICA, util.Constantes.SALUD);
		this.agencia.setEstadoContratacion(false);
		this.agencia.crearTicketEmpleado(util.Constantes.HOME_OFFICE, 999, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.empleado);
		this.agencia.crearTicketEmpleador(util.Constantes.HOME_OFFICE, 999, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_MEDIA, util.Constantes.PRIMARIOS, this.empleador);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCrearTicketEmpleadoEstudios() {
		Assert.assertEquals("Error en crearTicketEmpleado.getEstudios", util.Constantes.PRIMARIOS, this.empleado.getTicket().getEstudios());
	}
	
	@Test
	public void testCrearTicketEmpleadoExperiencia() {
		Assert.assertEquals("Error en crearTicketEmpleado.getExperiencia", util.Constantes.EXP_NADA, this.empleado.getTicket().getExperiencia());
	}
	
	@Test
	public void testCrearTicketEmpleadoJornada() {
		Assert.assertEquals("Error en crearTicketEmpleado.getJornada", util.Constantes.JORNADA_MEDIA, this.empleado.getTicket().getJornada());
	}
	
	@Test
	public void testCrearTicketEmpleadoLocacion() {
		Assert.assertEquals("Error en crearTicketEmpleado.getLocacion", util.Constantes.HOME_OFFICE, this.empleado.getTicket().getLocacion());
	}
	
	@Test
	public void testCrearTicketEmpleadoPuesto() {
		Assert.assertEquals("Error en crearTicketEmpleado.getPuesto", util.Constantes.JUNIOR, this.empleado.getTicket().getPuesto());
	}
	
	@Test
	public void testCrearTicketEmpleadoRemuneracion() {
		Assert.assertEquals("Error en crearTicketEmpleado.getRemuneracion", 999, this.empleado.getTicket().getRemuneracion());
	}

	// Empleador
	
	@Test
	public void testCrearTicketEmpleadorEstudios() {
		Assert.assertEquals("Error en crearTicketEmpleador.getEstudios", util.Constantes.PRIMARIOS, this.empleador.getTicket().getEstudios());
	}
	
	@Test
	public void testCrearTicketEmpleadorExperiencia() {
		Assert.assertEquals("Error en crearTicketEmpleador.getExperiencia", util.Constantes.EXP_MEDIA, this.empleador.getTicket().getExperiencia());
	}
	
	@Test
	public void testCrearTicketEmpleadorJornada() {
		Assert.assertEquals("Error en crearTicketEmpleador.getJornada", util.Constantes.JORNADA_MEDIA, this.empleador.getTicket().getJornada());
	}
	
	@Test
	public void testCrearTicketEmpleadorLocacion() {
		Assert.assertEquals("Error en crearTicketEmpleador.getLocacion", util.Constantes.HOME_OFFICE, this.empleador.getTicket().getLocacion());
	}
	
	@Test
	public void testCrearTicketEmpleadorPuesto() {
		Assert.assertEquals("Error en crearTicketEmpleador.getPuesto", util.Constantes.JUNIOR, this.empleador.getTicket().getPuesto());
	}
	
	@Test
	public void testCrearTicketEmpleadorRemuneracion() {
		Assert.assertEquals("Error en crearTicketEmpleado.getRemuneracion", 999, this.empleador.getTicket().getRemuneracion());
	}	
}
