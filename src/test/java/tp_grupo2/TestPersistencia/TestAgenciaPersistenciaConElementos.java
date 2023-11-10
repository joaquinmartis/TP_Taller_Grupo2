package tp_grupo2.TestPersistencia;

import static org.junit.Assert.fail;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Contratacion;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloNegocio.Agencia;
import persistencia.AgenciaDTO;
import persistencia.IPersistencia;
import persistencia.PersistenciaXML;
import persistencia.UtilPersistencia;

public class TestAgenciaPersistenciaConElementos {
	Agencia agencia;
	IPersistencia persistencia;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.agencia = Agencia.getInstance();
		this.agencia.getEmpleados().clear();
		this.agencia.getEmpleadores().clear();
		this.agencia.getContrataciones().clear();
		this.agencia.getComisionesUsuarios().clear();
		
		Empleador empleador = new Empleador("juancito", "qwerty123", "Juan Cito", "+54 9 223 666-1234", util.Constantes.SALUD, util.Constantes.JURIDICA);
		EmpleadoPretenso empleadoPretenso = new EmpleadoPretenso("PedroRodriguez1", "boca2023", "Pedro Rodriguez", "+54 9 223 594-3482","Rodriguez", 36);
		Contratacion contratacion = new Contratacion(empleador, empleadoPretenso);
		
		this.agencia.getEmpleadores().put(empleador.getTelefono(), empleador);
		this.agencia.getEmpleados().put(empleadoPretenso.getTelefono(), empleadoPretenso);
		this.agencia.getContrataciones().add(contratacion);
		this.agencia.getComisionesUsuarios().put(empleadoPretenso, 10.0);
		this.agencia.setLimitesRemuneracion(999, 9999);
		this.persistencia = new PersistenciaXML();
		this.agencia.setPersistencia(this.persistencia);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testPersistir() {
		try {
			AgenciaDTO agenciaDTO = UtilPersistencia.AgenciaDtoFromAgencia();
			this.persistencia.abrirOutput("AgenciaPersistir.xml");
			this.persistencia.escribir(agenciaDTO);
			this.persistencia.cerrarOutput();
			File file = new File("AgenciaPersistir.xml");
			if(!file.exists())
				fail("Error en testPersistir");
		} catch (Exception e) {
			fail("Error en testPersistir");
		}
	}
}
