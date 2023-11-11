package tp_grupo2.TestAgencia;

import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import excepciones.ContraException;
import excepciones.NombreUsuarioException;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloDatos.Usuario;
import modeloNegocio.Agencia;

public class TestAgenciaLogin{
	Agencia agencia;
	String userName;
	String contrasena;
	Usuario usuario;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.agencia = Agencia.getInstance();
		this.agencia.setEmpleadores(new HashMap<String, Empleador>());
		this.agencia.setEmpleados(new HashMap<String,EmpleadoPretenso>());
		this.userName = "Pepegamer";
		this.contrasena = "qwertyuiop";
		this.usuario = this.agencia.registroEmpleador(this.userName, this.contrasena, "Pepe Gomes", "2234434312", util.Constantes.FISICA, util.Constantes.SALUD);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testLoginCorrecto() {
		try {
			Usuario usuario = this.agencia.login(this.userName, this.contrasena);
			Assert.assertEquals("El usuario logeado deberia ser devuelto por this.agencia.login()", this.usuario, usuario);
		} catch (ContraException | NombreUsuarioException e) {
			fail("Deberia logear correctamente sin tirar errores");
		}
	}
	
	@Test
	public void testLoginAdmin() {
		try {
			this.agencia.login("admin", "admin");
			Assert.assertEquals("No se loguea correctamente el administrador",2, this.agencia.getTipoUsuario());
		} catch (ContraException | NombreUsuarioException e) {
			fail("Deberia logear correctamente sin tirar errores");
		}
	}
	
	@Test
	public void testLoginContraException() {
		try {
			this.agencia.login(this.userName, "contraException");
			fail("Deberia tirar ContraException");
		} catch (ContraException e) {
		} catch (NombreUsuarioException e) {
			fail("Deberia tirar ContraException");
		}
	}
	
	@Test
	public void testLoginNombreUsuarioException() {
		try {
			this.agencia.login("UsuarioException", this.contrasena);
			fail("Deberia tirar UsuarioException");
		} catch (ContraException e) {
			fail("Deberia tirar UsuarioException");
		} catch (NombreUsuarioException e) {
		}
	}
}
