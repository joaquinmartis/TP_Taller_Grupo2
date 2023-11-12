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

public class TestCalculaPremiosYCastigos {
	Agencia agencia;
	EmpleadoPretenso Empleado1,Empleado2;
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
		this.agencia.setEmpleadores(empleadores);
		this.agencia.setEmpleados(empleados);
		this.agencia.setEstadoContratacion(false);
		this.Empleador1 = (Empleador) this.agencia.registroEmpleador("Tomasito","123456789","Tomas Trimboli","2239102319",util.Constantes.FISICA,util.Constantes.SALUD);
		this.agencia.crearTicketEmpleador(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_MUCHA, util.Constantes.TERCIARIOS, this.Empleador1);
		
		this.Empleado1= (EmpleadoPretenso) this.agencia.registroEmpleado("Palo","987654321","Paloma","223291242","Diaz",21);
		this.agencia.crearTicketEmpleado(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.EXP_MUCHA, util.Constantes.TERCIARIOS, this.Empleado1);
		
		this.Empleador2= (Empleador) this.agencia.registroEmpleador("Pepegamer", "contrasenia", "Pepe Gomes", "2234434312", util.Constantes.FISICA,  util.Constantes.SALUD);
		this.agencia.crearTicketEmpleador(util.Constantes.PRESENCIAL, 2500, util.Constantes.JORNADA_EXTENDIDA, util.Constantes.MANAGMENT, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.Empleador2);
		
		this.Empleado2=(EmpleadoPretenso) this.agencia.registroEmpleado("Mica","123","Micaela Gonzalez","2230839122", "Gonzalez", 23);
		this.agencia.crearTicketEmpleado(util.Constantes.PRESENCIAL, 2500, util.Constantes.JORNADA_EXTENDIDA, util.Constantes.MANAGMENT, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.Empleado2);
	
		this.agencia.generaPostulantes();//ordena las listas de postulantes, precondicion de calculaPremiosYAsignaciones
		this.agencia.calculaPremiosCastigosAsignaciones();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testpuntajeEmpleado1() {
		Assert.assertEquals("El premio y/o castigo del empleado1 no es correctamente calculado",0,this.Empleado1.getPuntaje());
	}

	@Test
	public void testpuntajeEmpleado2() {
		Assert.assertEquals("El premio y/o castigo del empleado2 no es correctamente calculado",0, this.Empleado2.getPuntaje());
	}

	@Test
	public void testpuntajeEmpleador1() {
		Assert.assertEquals("La lista de postulantes de empleador1 no se genera correctamente",10,this.Empleador1.getPuntaje());
	}

	@Test
	public void testpuntajeEmpleador2() {
		Assert.assertEquals("La lista de postulantes de empleador1 no se genera correctamente",10, this.Empleador1.getPuntaje());
	}
}
	