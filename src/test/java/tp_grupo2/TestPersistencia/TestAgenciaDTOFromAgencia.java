package tp_grupo2.TestPersistencia;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.Cliente;
import modeloDatos.Contratacion;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloNegocio.Agencia;
import persistencia.AgenciaDTO;
import persistencia.UtilPersistencia;

public class TestAgenciaDTOFromAgencia {
	Agencia agencia;
	ArrayList<Contratacion> contrataciones;
	HashMap<String,Empleador> empleadores;
	HashMap<String,EmpleadoPretenso> empleados;
	HashMap<Cliente,Double> comisionesUsuarios;
	AgenciaDTO agenciaDTO;
	int limiteInferior;
	int limiteSuperior;
	boolean estadoContratacion;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.agencia = Agencia.getInstance();
		this.contrataciones = new ArrayList<Contratacion>();
		this.empleadores = new HashMap<String,Empleador>();
		this.empleados = new HashMap<String,EmpleadoPretenso>();
		this.comisionesUsuarios = new HashMap<Cliente,Double>();
		this.limiteInferior = 999;
		this.limiteSuperior = 9999;
		this.estadoContratacion = true;
		
		this.agencia.setContrataciones(this.contrataciones);
		this.agencia.setComisionesUsuarios(this.comisionesUsuarios);
		this.agencia.setEmpleadores(this.empleadores);
		this.agencia.setEmpleados(this.empleados);
		this.agencia.setLimitesRemuneracion(this.limiteInferior, this.limiteSuperior);
		this.agencia.setEstadoContratacion(this.estadoContratacion);
		
		this.agenciaDTO = UtilPersistencia.AgenciaDtoFromAgencia(); 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAgenciaDTOComisionesUsuarios() {
		HashMap<Cliente,Double> comisionesUsuariosDTO = this.agenciaDTO.getComisionesUsuarios();
		Assert.assertEquals("Error en comisionesUsuariosDTO", this.comisionesUsuarios, comisionesUsuariosDTO);
	}

	@Test
	public void testAgenciaDTOContrataciones() {
		ArrayList<Contratacion> contratacionesDTO = this.agenciaDTO.getContrataciones();
		Assert.assertEquals("Error en contratacionesDTO", this.contrataciones, contratacionesDTO);
	}

	@Test
	public void testAgenciaDTOEmpleadores() {
		HashMap<String,Empleador> empleadoresDTO = this.agenciaDTO.getEmpleadores();
		Assert.assertEquals("Error en empleadoresDTO", this.empleadores, empleadoresDTO);
	}

	@Test
	public void testAgenciaDTOEmpleados() {
		HashMap<String,EmpleadoPretenso> empleadosDTO = this.agenciaDTO.getEmpleados();
		Assert.assertEquals("Error en empleadosDTO", this.empleados, empleadosDTO);
	}

	@Test
	public void testAgenciaDTOLimiteInferior() {
		int limiteInferiorDTO = this.agenciaDTO.getLimiteInferior();
		Assert.assertEquals("Error en empleadosDTO", this.limiteInferior, limiteInferiorDTO);
	}

	@Test
	public void testAgenciaDTOLimiteSuperior() {
		int limiteSuperiorDTO = this.agenciaDTO.getLimiteSuperior();
		Assert.assertEquals("Error en empleadosDTO", this.limiteSuperior, limiteSuperiorDTO);
	}

	@Test
	public void testAgenciaDTOEstadoContratacion() {
		boolean estadoContratacionDTO = this.agenciaDTO.isEstadoContratacion();
		Assert.assertEquals("Error en empleadosDTO", this.estadoContratacion, estadoContratacionDTO);
	}

}
