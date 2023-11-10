package tp_grupo2.TestPersistencia;

import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import persistencia.IPersistencia;
import persistencia.PersistenciaXML;

public class TestCerrarIPersistencia {
	IPersistencia persistencia;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.persistencia = new PersistenciaXML();
		this.persistencia.abrirInput("Agencia.xml");
		this.persistencia.abrirOutput("Agencia.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCerrarInput() {
		try {
			this.persistencia.cerrarInput();
		} catch (IOException e) {
			fail("Error en IPersistencia.cerrarInput");
		}
	}


	@Test
	public void testCerrarOutput() {
		try {
			this.persistencia.cerrarOutput();
		} catch (IOException e) {
			fail("Error en IPersistencia.cerrarOutput");
		}
	}

}
