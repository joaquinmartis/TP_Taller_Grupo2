package tp_grupo2.TestAgencia;

import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
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

public class TestAgenciaListasConElementosEstadoContratacionTrue {
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
		this.agencia = agencia.getInstance();
		this.agencia.setEmpleadores(new HashMap<String,Empleador>());
		this.agencia.setEmpleados(new HashMap<String, EmpleadoPretenso>());
		this.empleado = (EmpleadoPretenso) this.agencia.registroEmpleado("PepePretenso", "contrasenia", "Pepe", "Gomez", "2234434312", 21);
		this.empleador = (Empleador) this.agencia.registroEmpleador("PepeEmpleador", "contrasenia", "Pepe", "Gomez", util.Constantes.FISICA, util.Constantes.SALUD);
		this.agencia.setEstadoContratacion(true);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCrearTicketEmpleado() {
		try {
			this.agencia.crearTicketEmpleado(util.Constantes.HOME_OFFICE, 999, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.empleado);
			fail("Deberia lanzar excepcion");
		} catch (ImposibleModificarTicketsException e) {
		}
	}
	
	@Test
	public void testCrearTicketEmpleador() {
		try {
			this.agencia.crearTicketEmpleador(util.Constantes.HOME_OFFICE, 999, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_MEDIA, util.Constantes.PRIMARIOS, this.empleador);
			fail("Deberia lanzar excepcion");
		} catch (ImposibleModificarTicketsException e) {
		}
	}
}
