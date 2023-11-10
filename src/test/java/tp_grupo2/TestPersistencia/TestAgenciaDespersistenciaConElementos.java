package tp_grupo2.TestPersistencia;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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

public class TestAgenciaDespersistenciaConElementos {
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
		
		// setUp de la agencia
		this.agencia = Agencia.getInstance();
		this.agencia.getEmpleados().clear();
		this.agencia.getEmpleadores().clear();
		this.agencia.getContrataciones().clear();
		this.agencia.getComisionesUsuarios().clear();
		
		
		EmpleadoPretenso empleadoPretenso = (EmpleadoPretenso) this.agencia.registroEmpleado("PepePretenso", "contrasenia", "Pepe", "Gomez", "2234434312", 21);
		Empleador empleador = (Empleador) this.agencia.registroEmpleador("PepeEmpleador", "contrasenia", "Pepe", "Gomez", util.Constantes.FISICA, util.Constantes.SALUD);

		Contratacion contratacion = new Contratacion(empleador, empleadoPretenso);
		this.agencia.login("PepePretenso", "contrasenia");	// usuarioLogeado = 0
		this.agencia.getEmpleadores().put(empleador.getTelefono(), empleador);
		this.agencia.getEmpleados().put(empleadoPretenso.getTelefono(), empleadoPretenso);
		this.agencia.getContrataciones().add(contratacion);
		this.agencia.getComisionesUsuarios().put(empleadoPretenso, 10.0);
		this.agencia.getCoincidencias().add(contratacion);
		this.agencia.setLimitesRemuneracion(999, 9999);
		this.agencia.setEstadoContratacion(false);
		this.persistencia = new PersistenciaXML();
		this.agencia.setPersistencia(this.persistencia);
		
		// Persistir la agencia
		AgenciaDTO agenciaDTO = UtilPersistencia.AgenciaDtoFromAgencia();
		this.persistencia.abrirOutput("AgenciaDespersistir.xml");
		this.persistencia.escribir(agenciaDTO);
		this.persistencia.cerrarOutput();
		
		// Cambiar valores de la agencia
		this.agencia.setLimitesRemuneracion(1000, 2000);
		this.agencia.getEmpleadores().clear();
		this.agencia.getEmpleados().clear();
		this.agencia.getContrataciones().clear();
		this.agencia.getComisionesUsuarios().clear();
		this.agencia.setEstadoContratacion(true);
		this.agencia.cerrarSesion();
		
		// Despersistir la agencia
		this.persistencia.abrirInput("AgenciaDespersistir.xml");
		agenciaDTO = (AgenciaDTO) this.persistencia.leer();
		UtilPersistencia.agenciaFromAgenciaDTO(agenciaDTO);
		this.persistencia.cerrarInput();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testDespersistenciaLimiteInferior() {
		int limiteInferior = this.agencia.getLimiteInferior();
		Assert.assertEquals("Error en despersistenciaGetLimiteInferior", 999, limiteInferior);
	}
	
	@Test
	public void testDespersistenciaLimiteSuperior() {
		int limiteSuperior= this.agencia.getLimiteSuperior();
		Assert.assertEquals("Error en despersistenciaGetLimiteSuperior", 9999, limiteSuperior);
	}
	
	@Test
	public void testDespersistenciaEmpleadores() {
		Assert.assertFalse("La lista de empleadores esta vacia", this.agencia.getEmpleadores().isEmpty());
	}
	
	@Test
	public void testDespersistenciaEmpleados() {
		Assert.assertFalse("La lista de empleados esta vacia", this.agencia.getEmpleados().isEmpty());
	}
	
	@Test
	public void testDespersistenciaEstadoContratacion() {
		Assert.assertFalse("El estado de contratacion deberia ser falso", this.agencia.isEstadoContratacion());
	}
	
	@Test
	public void testDespersistenciaEstadoContrataciones() {
		Assert.assertFalse("La lista de contrataciones esta vacia", this.agencia.getContrataciones().isEmpty());
	}
	
	@Test
	public void testDespersistenciaComisionesUsuarios() {
		Assert.assertFalse("La lista de comisionesUsuarios esta vacia", this.agencia.getComisionesUsuarios().isEmpty());
	}
	
	@Test
	public void testDespersistenciaCoincidencias() {
		Assert.assertFalse("La lista de comisionesUsuarios esta vacia", this.agencia.getCoincidencias().isEmpty());
	}
	
	@Test
	public void testDespersistenciaTipoUsuario() {
		Assert.assertEquals("Al despersistir, no deberia haber una sesion iniciada", -1, this.agencia.getTipoUsuario());
	}
}
