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

public class TestGenPostulantes {
	Agencia agencia;
	EmpleadoPretenso empleado1,empleado2;
	Empleador empleador1,empleador2;
	
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
		this.empleador1 = (Empleador) this.agencia.registroEmpleador("Tomasito","123456789","Tomas Trimboli","2239102319",util.Constantes.FISICA,util.Constantes.SALUD);
		this.agencia.crearTicketEmpleador(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_MUCHA, util.Constantes.TERCIARIOS, this.empleador1);
		
		this.empleado1= (EmpleadoPretenso) this.agencia.registroEmpleado("Palo","987654321","Paloma","223291242","Diaz",21);
		this.agencia.crearTicketEmpleado(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_MUCHA, util.Constantes.TERCIARIOS, this.empleado1);
		
		this.empleador2= (Empleador) this.agencia.registroEmpleador("Pepegamer", "contrasenia", "Pepe Gomes", "2234434312", util.Constantes.FISICA,  util.Constantes.SALUD);
		this.agencia.crearTicketEmpleador(util.Constantes.PRESENCIAL, 2500, util.Constantes.JORNADA_EXTENDIDA, util.Constantes.MANAGMENT, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.empleador2);
		
		this.empleado2=(EmpleadoPretenso) this.agencia.registroEmpleado("Mica","123","Micaela Gonzalez","2230839122", "Gonzalez", 23);
		this.agencia.crearTicketEmpleado(util.Constantes.PRESENCIAL, 2500, util.Constantes.JORNADA_EXTENDIDA, util.Constantes.MANAGMENT, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.empleado2);
	
		this.agencia.generaPostulantes();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testListEmpleado1ANoVacia() {
		Assert.assertEquals("La lista de postulantes de empleado no se genera correctamente",2,this.empleado1.getListaDePostulantes().size());
	}

	@Test
	public void testListEmpleado1AprimerElemento() {
		Assert.assertEquals("El primer elemento de la lista de postulantes de empleado, no coincide con el empleador esperado segun el puntaje del ticket",this.empleado1, this.empleado1.getListaDePostulantes().get(0).getCliente());
	}

	@Test
	public void testListaEmpleador1NoVacia() {
		Assert.assertEquals("La lista de postulantes de empleador no se genera correctamente",2,this.empleador1.getListaDePostulantes().size());
	}

	@Test
	public void testListaEmpleador1primerElemento() {
		Assert.assertEquals("El primer elemento de la lista de postulantes de empleador, no coincide con el empleador esperado segun el puntaje del ticket",this.empleador1, this.empleador1.getListaDePostulantes().get(0).getCliente());
	}
}
	