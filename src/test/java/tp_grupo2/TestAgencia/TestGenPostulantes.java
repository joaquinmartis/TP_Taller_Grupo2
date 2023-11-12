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

public class TestGenPostulantes {
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
		this.agencia = Agencia.getInstance();
		HashMap<String, Empleador> empleadores= new HashMap<String, Empleador>();
		HashMap<String,EmpleadoPretenso> empleados=new HashMap<String,EmpleadoPretenso>();
		
		this.Empleador1 = this.agencia.registroEmpleador("Tomasito","123456789","Tomas Trimboli","2239102319",util.Constantes.FISICA,util.Constantes.SALUD);
		this.agencia.crearTicketEmpleador(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.MUCHA, util.Constantes.TERCIARIO, this.Empleador1);
		
		this.Empleado1= this.agencia.registroEmpleado("Palo","987654321","Paloma","223291242","Diaz",21);
		this.agencia.crearTicketEmpleado(util.Constantes.HOME_OFFICE, 500, util.Constantes.JORNADA_MEDIA, util.Constantes.JUNIOR, util.Constantes.MUCHA, util.Constantes.TERCIARIO, this.Empleado1);
		
		this.Empleador2= this.agencia.registroEmpleador("Pepegamer", "contrasenia", "Pepe Gomes", "2234434312", util.Constantes.FISICA,  util.Constantes.SALUD);
		this.agencia.crearTicketEmpleador(util.Constantes.PRESENCIAL, 2500, util.Constantes.EXTENDIDA, util.Constantes.MANAGMENT, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.Empleador2);
		
		this.Empleado2=this.agencia.registroEmpleado("Mica","123","Micaela Gonzalez","2230839122",23);
		this.agencia.crearTicketEmpleado(util.Constantes.PRESENCIAL, 2500, util.Constantes.EXTENDIDA, util.Constantes.MANAGMENT, util.Constantes.EXP_NADA, util.Constantes.PRIMARIOS, this.Empleado2);
	
		this.agencia.generaPostulantes();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testListaEmpleadoNoVacia() {
		Assert.assertEquals("La lista de postulantes de empleado no se genera correctamente",2,this.Empleado1.getListaDePostulantes.size());
	}

	@Test
	public void testListaEmpleado1erElemento() {
		Assert.assertEquals("El primer elemento de la lista de postulantes de empleado, no coincide con el empleador esperado segun el puntaje del ticket",this.Empleado1, this.Empleado1.getListaDePostulantes().get(0).getCliente());
	}

	@Test
	public void testListaEmpleadorNoVacia() {
		Assert.assertEquals("La lista de postulantes de empleador no se genera correctamente",2,this.Empleador1.getListaDePostulantes.size());
	}

	@Test
	public void testListaEmpleador1erElemento() {
		Assert.assertEquals("El primer elemento de la lista de postulantes de empleador, no coincide con el empleador esperado segun el puntaje del ticket",this.Empleador1, this.Empleador1.getListaDePostulantes().get(0).getCliente());
	}
}
	