package tp_grupo2.TestAgencia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import excepciones.ContraException;
import excepciones.ImposibleCrearEmpleadoException;
import excepciones.ImposibleCrearEmpleadorException;
import excepciones.NewRegisterException;
import excepciones.NombreUsuarioException;
import modeloDatos.Cliente;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloNegocio.Agencia;

public class TestGatillarRondaEstadoVerdadero {
	Agencia agencia;
	EmpleadoPretenso Empleado1;
	Empleador Empleador1,Empleador2;
	
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
		this.Empleador1 = this.agencia.registroEmpleador("Tomasito","123456789","Tomas Trimboli","2239102319",util.Constantes.FISICA,util.Constantes.SALUD);
		this.agencia.crearTicketEmpleador(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.MUCHA, util.Constantes.TERCIARIO, this.Empleador1);
		
		this.Empleado1= this.agencia.registroEmpleado("Palo","987654321","Paloma","223291242","Diaz",21);
		this.agencia.crearTicketEmpleado(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.MUCHA, util.Constantes.TERCIARIO, this.Empleado1);
		
		this.Empleador2= this.agencia.registroEmpleador("Pepegamer", "contrasenia", "Pepe Gomes", "2234434312", util.Constantes.FISICA,  util.Constantes.SALUD);
		this.agencia.crearTicketEmpleador(util.Constantes.PRESENCIAL, 2500, util.Constantes.EXTENDIDA, util.Constantes.MANAGMENT, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.Empleador2);
		this.agencia.generaPostulantes();
		this.agencia.setEstadoContratacion(true);
		this.Empleado1.setCandidato(this.Empleador1);
		this.Empleador1.setCandidato(this.Empleado1);
		this.agencia.gatillarRonda(); //de paso de estado de V a F
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testActualizaPuntajeEmpleado1() {
		Assert.assertEquals("No se actualiza el puntaje del empleado correctamente (match)",10, this.Empleado1.getPuntaje());
	}
	
	@Test
	public void testActualizaPuntajeEmpleador1() {
		Assert.assertEquals("No se actualiza el puntaje del empleador correctamente (match)",50, this.Empleador1.getPuntaje());
	}
	
	@Test
	public void testActualizaPuntajeEmpleador2() {
		Assert.assertEquals("No se actualiza el puntaje del empleador correctamente (empleador no seleccionado)",-20, this.Empleador2.getPuntaje());
	}
	
	@Test
	public void testElimTicketEmpleado1() {
		Assert.assertEquals("Error: no se elimina el ticket del empleado al haber match",null,this.Empleado1.getTicket());
	}

	@Test
	public void testElimTicketEmpleador1() {
		Assert.assertEquals("Error: no se elimina el ticket del empleador al haber match",null,this.Empleador1.getTicket());
	}
	
	@Test
	public void testElimTicketEmpleador2() {
		Assert.assertEquals("Error: no se elimina el ticket del empleador al gatillar la ronda en estado Verdadero",null,this.Empleador2.getTicket());
	}

	@Test
	public void testContratacionEmpleado() {
		Assert.assertEquals("No se crea correctamente la contratacion entre empleado y empleador",this.Empleador1,this.agencia.getContratacionEmpleadoPretenso(this.Empleado1));
	}

	@Test
	public void testContratacionEmpleador() {
		Assert.assertEquals("No se crea correctamente la contratacion entre empleado y empleador",this.Empleado1, this.empleador.getContratacionEmpleador(this.Empleador1));
	}
	
	@Test
	public void testCambioEstadoContratacion() {
		Assert.assertEquals("Error al cambiar el Estado de la contratacion a verdadero", true, this.agencia.isEstadoContratacion());
	}
}
	