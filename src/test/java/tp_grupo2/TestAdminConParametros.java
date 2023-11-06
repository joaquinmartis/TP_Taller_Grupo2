package tp_grupo2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Usuario;

public class TestAdminConParametros {
	Admin admin;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.admin = new Admin("JuancitoPerez02", "hola123", "Juan Perez", "223 594-3482");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetPassword() {
		assertEquals("Error en getPassword()", this.admin.getPassword(), "hola123");
	}
	
	@Test
	public void testGetRealName() {
		assertEquals("Error en getRealName()", this.admin.getRealName(), "Juan Perez");
	}
	
	@Test
	public void testGetUsserName() {
		assertEquals("Error en getUsserName()", this.admin.getUsserName(), "JuancitoPerez02");
	}
	
	@Test
	public void testGetTelefono() {
		assertEquals("Error en getTelefono()", this.admin.getTelefono(), "223 594-3482");
	}
	
	
}
