package tp_grupo2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.ClientePuntaje;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;

public class TestClientePuntajeConParametros {
	ClientePuntaje clientePuntaje;
	EmpleadoPretenso empleado;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.empleado = new EmpleadoPretenso();
		this.clientePuntaje = new ClientePuntaje(30.0, this.empleado);
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testGetCliente() {
		assertEquals("Error en getCliente()", this.empleado, this.clientePuntaje.getCliente());
	}
	
	@Test
	public void testGetPuntaje() {
		assertEquals("Error en getPuntaje()", 30.0, this.clientePuntaje.getPuntaje(), 0.0001);
	}
	
	
	@Test 
	public void testSetPuntaje() {
		this.clientePuntaje.setPuntaje(-100);
		assertEquals("Error en setPuntaje()",-100,this.clientePuntaje.getPuntaje(),0.0001);
	}
	
	@Test
	public void testSetCliente() {
		Empleador empleador=new Empleador();
		this.clientePuntaje.setCliente(empleador);
		assertEquals("Error en SetCliente()", empleador,this.clientePuntaje.getCliente());
	}
	
	@Test
	public void testCompareTo1() {
		try {
				assertEquals ("Error CompareTo(), no coincide el resultado de comparacion", -1, this.clientePuntaje.compareTo(new ClientePuntaje(40.0, new Empleador())));
		}
		catch(NullPointerException | ClassCastException e) {
			fail("Se lanza una excepcion no esperada");
		}
	}
	
	@Test
	public void testCompareTo2() {
		try {
			assertEquals ("Error CompareTo(),no coincide el resultado de comparacion", 0, this.clientePuntaje.compareTo(new ClientePuntaje(30.0, new Empleador())));
		}
		catch(NullPointerException | ClassCastException e) {
			fail("Se lanza una excepcion no esperada");
		}
	}
	
	@Test
	public void testCompareTo3() {
		try {
			assertEquals ("Error CompareTo(),no coincide el resultado de comparacion", 1, this.clientePuntaje.compareTo(new ClientePuntaje(20.0, new Empleador())));
		}
		catch(NullPointerException | ClassCastException e) {
			fail("Se lanza una excepcion no esperada");
		}
	}
	
	@Test
	public void testCompareTo4() {
		try {
			int rta= this.clientePuntaje.compareTo(null);
			fail("No se lanza la excepcion esperada (NullPointerException)");
		}
		catch(ClassCastException o) {
			fail("Se lanza una excepcion no esperada");
		}
		catch (NullPointerException e) {
		}
	}
	
	@Test
	public void testCompareTo5() {
		try {
			int rta= this.clientePuntaje.compareTo(new Empleador());
			fail("No se lanza la excepcion esperada (ClassCastException)");
		}
		catch(ClassCastException o) {
			
		}
		catch (NullPointerException e) {
			fail("Se lanza una excepcion no esperada");
		}
	}
}
