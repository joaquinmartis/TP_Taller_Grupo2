package tp_grupo2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Usuario;

public class TestUsuarioSinParametros {
	Usuario usuario;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.usuario=new Usuario();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPassword() {
		this.usuario.setPassword("078hd90");
		assertEquals("Error en setPassword()",this.usuario.getPassword(),"078hd90");
	}
	
	@Test
	public void testUsserName() {
		this.usuario.setUsserName("juanceto01");
		assertEquals("Error en setUsserName()",this.usuario.getUsserName(),"juanceto01");
	}
	
	@Test
	public void testRealName() {
		this.usuario.setRealName("Juan Aceto");
		assertEquals("Error en setRealName()",this.usuario.getRealName(),"Juan Aceto");
	}
	
	@Test
	public void testTelefono() {
		this.usuario.setTelefono("2234555645");
		assertEquals("Error en setTelefono()",this.usuario.getTelefono(),"2234555645");
	}
	
	

}
