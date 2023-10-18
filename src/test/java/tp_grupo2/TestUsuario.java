package tp_grupo2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Usuario;

public class TestUsuario {
	Usuario usuario;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.usuario = new Usuario("JuancitoPerez02", "hola123", "Juan Perez", "223 594-3482");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUsuario() {
	}
	
	@Test
	public void testGetPassword() {
		assertEquals("Error en el getPassword()", this.usuario.getPassword(), "hola123");
	}
	
	@Test
	public void testGetRealName() {
		assertEquals("Error en el getRealName()", this.usuario.getRealName(), "Juan Perez");
	}
	
	@Test
	public void testGetUsserName() {
		assertEquals("Error en el getUsserName()", this.usuario.getUsserName(), "JuancitoPerez02");
	}
	
	@Test
	public void testGetTelefono() {
		assertEquals("Error en el getTelefono()", this.usuario.getTelefono(), "223 594-3482");
	}
	
	
}
