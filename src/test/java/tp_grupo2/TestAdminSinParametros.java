package tp_grupo2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Admin;
import modeloDatos.Usuario;

public class TestAdminSinParametros {
	Admin admin;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.admin=new Admin();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPassword() {
		this.admin.setPassword("078hd90");
		assertEquals("Error en setPassword()",this.admin.getPassword(),"078hd90");
	}
	
	@Test
	public void testUsserName() {
		this.admin.setUsserName("juanceto01");
		assertEquals("Error en setUsserName()",this.admin.getUsserName(),"juanceto01");
	}
	
	@Test
	public void testRealName() {
		this.admin.setRealName("Juan Aceto");
		assertEquals("Error en setRealName()",this.admin.getRealName(),"Juan Aceto");
	}
	
	@Test
	public void testTelefono() {
		this.admin.setTelefono("2234555645");
		assertEquals("Error en setTelefono()",this.admin.getTelefono(),"2234555645");
	}
	
	

}
