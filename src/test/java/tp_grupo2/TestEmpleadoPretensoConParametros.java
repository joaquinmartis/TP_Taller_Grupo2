package tp_grupo2;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.ClientePuntaje;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloDatos.Ticket;

public class TestEmpleadoPretensoConParametros {
	private EmpleadoPretenso empleadoPretenso;
	private Ticket ticket;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.empleadoPretenso = new EmpleadoPretenso("PedroRodriguez1", "boca2023", "Pedro Rodriguez", "+54 9 223 594-3482","Rodriguez", 36);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCalculaComision() {
		Ticket ticketComision = new Ticket(util.Constantes.HOME_OFFICE, 80000, util.Constantes.JORNADA_COMPLETA, util.Constantes.JUNIOR, util.Constantes.EXP_MEDIA, util.Constantes.TERCIARIOS);
		Assert.assertEquals("Error en el CalculaComision()", 64000.0, this.empleadoPretenso.calculaComision(ticketComision), 0.00001);
		// Empleado junior --> 80% * sueldoPretenso
	}
	
	//DE CLIENTE 
	@Test
	public void testGetCandidato() {
		Empleador empleador = new Empleador("juancito", "qwerty123", "Juan Cito", "+54 9 223 666-1234", util.Constantes.ADMINISTRADOR, util.Constantes.JURIDICA);
		this.empleadoPretenso.setCandidato(empleador);
		Assert.assertEquals("Error en el getCandidato()", empleador, this.empleadoPretenso.getCandidato());
		}

	@Test
	public void testGetListaDePostulantesConElemento() {
		ArrayList<ClientePuntaje> listaDePostulantes = new ArrayList<ClientePuntaje>();
		Empleador empleador = new Empleador("juancito", "qwerty123", "Juan Cito", "+54 9 223 666-1234", util.Constantes.SALUD, util.Constantes.JURIDICA);
		ClientePuntaje clientePuntaje = new ClientePuntaje(10, empleador);
		listaDePostulantes.add(clientePuntaje);
		this.empleadoPretenso.setListaDePostulantes(listaDePostulantes);
		listaDePostulantes = null;
		listaDePostulantes = this.empleadoPretenso.getListaDePostulantes();
		
		Assert.assertEquals("Error en testGetListaDePostulantesConElemento()", 1, listaDePostulantes.size());
	}
	
	@Test
	public void testGetListaDePostulantesVacia() {
		this.empleadoPretenso.setListaDePostulantes(new ArrayList<ClientePuntaje>());
		ArrayList<ClientePuntaje> listaDePostulantes = this.empleadoPretenso.getListaDePostulantes();
		Assert.assertTrue("Error en testGetListaDePostulantesVacia()", listaDePostulantes.isEmpty());
	}
	
	@Test
	public void testGetPuntaje() {
		this.empleadoPretenso.setPuntaje(28);
		Assert.assertEquals("Error en el getPuntaje()",this.empleadoPretenso.getPuntaje(),28);
	}
	
	@Test
	public void testGetTicket() {
		this.empleadoPretenso.setTicket(this.ticket);
		Assert.assertEquals("Error en el getTicket()", this.empleadoPretenso.getTicket(), this.ticket);
	}	
	
	//USUARIO
	@Test
	public void testGetUsserName() {
		Assert.assertEquals("Error en el getUsserName()", "PedroRodriguez1", this.empleadoPretenso.getUsserName());
	}
	
	@Test
	public void testGetPassword() {
		Assert.assertEquals("Error en el getPassword()", "boca2023", this.empleadoPretenso.getPassword());
	}

	@Test
	public void testGetRealName() {
		Assert.assertEquals("Error en el getRealName()", "Pedro Rodriguez", this.empleadoPretenso.getRealName());
	}

	@Test
	public void testGetTelefono() {
		Assert.assertEquals("Error en el getTelefono()", "+54 9 223 594-3482", this.empleadoPretenso.getTelefono());
	}
	
	@Test
	public void testGetApellido() {
		Assert.assertEquals("Error en el getApellido()", "Rodriguez", this.empleadoPretenso.getApellido());
	}
	
	@Test
	public void testGetEdad() {
		Assert.assertEquals("Error en el getApellido()", 36, this.empleadoPretenso.getEdad());
	}
	
	

}
