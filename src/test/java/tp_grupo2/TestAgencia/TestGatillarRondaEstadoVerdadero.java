package tp_grupo2.TestAgencia;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloNegocio.Agencia;

public class TestGatillarRondaEstadoVerdadero {
	Agencia agencia;
	EmpleadoPretenso empleado1;
	Empleador empleador1, empleador2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.agencia = agencia.getInstance();
		HashMap<String, Empleador> empleadores= new HashMap<String, Empleador>();
		HashMap<String,EmpleadoPretenso> empleados=new HashMap<String,EmpleadoPretenso>();
		this.agencia.setEstadoContratacion(false);
		this.agencia.setEmpleadores(empleadores);
		this.agencia.setEmpleados(empleados);
		this.empleador1 = (Empleador) this.agencia.registroEmpleador("Tomasito","123456789","Tomas Trimboli","2239102319",util.Constantes.FISICA,util.Constantes.SALUD);
		this.agencia.crearTicketEmpleador(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_MUCHA, util.Constantes.TERCIARIOS, this.empleador1);
		
		this.empleado1= (EmpleadoPretenso) this.agencia.registroEmpleado("Palo","987654321","Paloma","223291242","Diaz",21);
		this.agencia.crearTicketEmpleado(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_MUCHA, util.Constantes.TERCIARIOS, this.empleado1);
		
		this.empleador2= (Empleador) this.agencia.registroEmpleador("Pepegamer", "contrasenia", "Pepe Gomes", "2234434312", util.Constantes.FISICA,  util.Constantes.SALUD);
		this.agencia.crearTicketEmpleador(util.Constantes.PRESENCIAL, 2500, util.Constantes.JORNADA_EXTENDIDA, util.Constantes.MANAGMENT, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.empleador2);
		this.agencia.generaPostulantes();
		this.agencia.setEstadoContratacion(true);
		this.empleado1.setCandidato(this.empleador1);
		this.empleador1.setCandidato(this.empleado1);
		this.agencia.gatillarRonda(); //de paso de estado de V a F
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testActualizaPuntajeEmpleado1() {
		Assert.assertEquals("No se actualiza el puntaje del empleado correctamente (match)",10, this.empleado1.getPuntaje());
	}
	
	@Test
	public void testActualizaPuntajeEmpleador1() {
		Assert.assertEquals("No se actualiza el puntaje del empleador correctamente (match)",50, this.empleador1.getPuntaje());
	}
	
	@Test
	public void testActualizaPuntajeEmpleador2() {
		Assert.assertEquals("No se actualiza el puntaje del empleador correctamente (empleador no seleccionado)",-20, this.empleador2.getPuntaje());
	}
	
	@Test
	public void testElimTicketEmpleado1() {
		Assert.assertEquals("Error: no se elimina el ticket del empleado al haber match",null,this.empleado1.getTicket());
	}

	@Test
	public void testElimTicketEmpleador1() {
		Assert.assertEquals("Error: no se elimina el ticket del empleador al haber match",null,this.empleador1.getTicket());
	}
	
	@Test
	public void testElimTicketEmpleador2() {
		Assert.assertEquals("Error: no se elimina el ticket del empleador al gatillar la ronda en estado Verdadero",null,this.empleador2.getTicket());
	}

	@Test
	public void testContratacionEmpleado() {
		Assert.assertEquals("No se crea correctamente la contratacion entre empleado y empleador",this.empleador1,this.agencia.getContratacionEmpleadoPretenso(this.empleado1));
	}

	@Test
	public void testContratacionEmpleador() {
		Assert.assertEquals("No se crea correctamente la contratacion entre empleado y empleador",this.empleado1, this.agencia.getContratacionEmpleador(this.empleador1));
	}
	
	@Test
	public void testCambioEstadoContratacion() {
		Assert.assertEquals("Error al cambiar el Estado de la contratacion a verdadero", true, this.agencia.isEstadoContratacion());
	}
}
	