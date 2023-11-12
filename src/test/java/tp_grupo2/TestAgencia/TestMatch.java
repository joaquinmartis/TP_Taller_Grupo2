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

public class TestMatch {
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
		this.agencia = agencia.getInstance();
		HashMap<String, Empleador> empleadores= new HashMap<String, Empleador>();
		HashMap<String,EmpleadoPretenso> empleados=new HashMap<String,EmpleadoPretenso>();
		this.agencia.setEmpleadores(empleadores);
		this.agencia.setEmpleados(empleados);
		this.agencia.setEstadoContratacion(false);
		this.empleador = (Empleador) this.agencia.registroEmpleador("Tomasito","123456789","Tomas Trimboli","2239102319",util.Constantes.FISICA,util.Constantes.SALUD);
		this.agencia.crearTicketEmpleador(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_MUCHA, util.Constantes.TERCIARIOS, this.empleador);
		
		this.empleado= (EmpleadoPretenso) this.agencia.registroEmpleado("Palo","987654321","Paloma","223291242","Diaz",21);
		this.agencia.crearTicketEmpleado(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_MUCHA, util.Constantes.TERCIARIOS, this.empleado);
		
		this.agencia.match(empleador, empleado);
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testElimTicketEmpleado() {
		Assert.assertEquals("Error: no se elimina el ticket del empleado al haber match",null,this.empleado.getTicket());
	}

	@Test
	public void testElimTicketEmpleador() {
		Assert.assertEquals("Error: no se elimina el ticket del empleador al haber match",null,this.empleador.getTicket());
	}

	@Test
	public void testContratacionEmpleado() {
		Assert.assertEquals("No se crea correctamente la contratacion entre empleado y empleador",this.empleador, this.agencia.getContratacionEmpleadoPretenso(this.empleado));
	}

	@Test
	public void testContratacionEmpleador() {
		Assert.assertEquals("No se crea correctamente la contratacion entre empleado y empleador",this.empleado, this.agencia.getContratacionEmpleador(this.empleador));
	}
	
	@Test
	public void testActualizaPuntajeEmpleado() {
		Assert.assertEquals("No se actualiza el puntaje del empleado correctamente",10, this.empleado.getPuntaje());
	}
	
	@Test
	public void testActualizaPuntajeEmpleador() {
		Assert.assertEquals("No se actualiza el puntaje del empleador correctamente",50, this.empleador.getPuntaje());
	}
}
	