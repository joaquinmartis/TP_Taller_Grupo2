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

public class TestAgenciaUsuarioLogeado {
	Agencia agencia;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		String userName = "Pepegamer";
		String contrasena = "qwertyuiop";
		
		this.agencia = agencia.getInstance();
		this.agencia.setEmpleadores(new HashMap<String, Empleador>());
		this.agencia.setEmpleados(new HashMap<String,EmpleadoPretenso>());
		
		this.agencia.registroEmpleador(userName, contrasena, "Pepe Gomes", "2234434312", util.Constantes.FISICA, util.Constantes.SALUD);
		this.agencia.login(userName, contrasena);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCerrarSesion() {
		this.agencia.cerrarSesion();
		Assert.assertEquals("Error en cerrarSesion()", -1, this.agencia.getTipoUsuario());
	}
	
	@Test
	public void testGetTipoUsuario() {
		Assert.assertEquals("Error en getTipoUsuario()", 1, this.agencia.getTipoUsuario());
	}
}
