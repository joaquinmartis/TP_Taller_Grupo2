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

public class TestAgenciaEliminarTicketEstadoFalse {
	Agencia agencia;
	EmpleadoPretenso empleado;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.agencia = Agencia.getInstance();
		this.agencia.setEmpleadores(new HashMap<String,Empleador>());
		this.agencia.setEmpleados(new HashMap<String, EmpleadoPretenso>());
		this.empleado = (EmpleadoPretenso) this.agencia.registroEmpleado("PepePretenso", "contrasenia", "Pepe", "Gomez", "2234434312", 21);
		this.agencia.setEstadoContratacion(false);
		this.agencia.crearTicketEmpleado(util.Constantes.HOME_OFFICE, 999, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.empleado);
		this.agencia.login("PepePretenso","contrasenia");
	}
	
	@Test
	public void testEliminarTicket() {
		try {
			this.agencia.eliminarTicket();
			Assert.assertEquals("Error al eliminar el ticket", null, this.empleado.getTicket());
		} catch (ImposibleModificarTicketsException e) {
			fail("No deberia lanzar excepcion");
		}
	}
	
	@Test
	public void testEliminarTicket() {
		try {
			this.agencia.eliminarTicket();
			Assert.assertEquals("Error al descontar puntaje por eliminar ticket", -1, this.empleado.getPuntaje());
		} catch (ImposibleModificarTicketsException e) {
			fail("No deberia lanzar excepcion");
		}
	}
}
