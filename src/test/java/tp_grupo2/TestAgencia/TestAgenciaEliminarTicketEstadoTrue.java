package tp_grupo2.TestAgencia;

import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import excepciones.ImposibleModificarTicketsException;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloNegocio.Agencia;

public class TestAgenciaEliminarTicketEstadoTrue {
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
		this.agencia.setEmpleadores(new HashMap<String,Empleador>());
		this.agencia.setEmpleados(new HashMap<String, EmpleadoPretenso>());
		this.empleado = (EmpleadoPretenso) this.agencia.registroEmpleado("PepePretenso", "contrasenia", "Pepe", "Gomez", "2234434312", 21);
		this.agencia.setEstadoContratacion(false);
		this.agencia.crearTicketEmpleado(util.Constantes.HOME_OFFICE, 999, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.empleado);
		this.agencia.setEstadoContratacion(true);
		this.agencia.login("PepePretenso","contrasenia");
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testEliminarTicket() {
		try {
			this.agencia.eliminarTicket();
			fail("Deberia lanzar excepcion");
		} catch (ImposibleModificarTicketsException e) {
		}
	}
}
