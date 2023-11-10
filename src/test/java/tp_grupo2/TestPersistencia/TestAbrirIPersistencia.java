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

public class TestAbrirIPersistencia {
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
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAbrirInput() {
		try {
			this.persistencia.abrirInput("Agencia.xml");
		} catch (IOException e) {
			fail("Error en IPersistencia.abrirInput");
		}
	}


	@Test
	public void testAbrirOutput() {
		try {
			this.persistencia.abrirOutput("Agencia.xml");
		} catch (IOException e) {
			fail("Error en IPersistencia.abrirOutput");
		}
	}

}
