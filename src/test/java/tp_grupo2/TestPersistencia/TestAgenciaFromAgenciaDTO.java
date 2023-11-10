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

public class TestAgenciaFromAgenciaDTO {
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
		this.agenciaDTO = new AgenciaDTO(); 
		
		this.contrataciones = new ArrayList<Contratacion>();
		this.empleadores = new HashMap<String,Empleador>();
		this.empleados = new HashMap<String,EmpleadoPretenso>();
		this.comisionesUsuarios = new HashMap<Cliente,Double>();
		this.limiteInferior = 999;
		this.limiteSuperior = 9999;
		this.estadoContratacion = true;
		
		this.agenciaDTO.setContrataciones(this.contrataciones);
		this.agenciaDTO.setComisionesUsuarios(this.comisionesUsuarios);
		this.agenciaDTO.setEmpleadores(this.empleadores);
		this.agenciaDTO.setEmpleados(this.empleados);
		this.agenciaDTO.setLimiteInferior(this.limiteInferior);
		this.agenciaDTO.setLimiteSuperior(this.limiteSuperior);
		this.agenciaDTO.setEstadoContratacion(this.estadoContratacion);

		UtilPersistencia.agenciaFromAgenciaDTO(this.agenciaDTO);
		this.agencia = Agencia.getInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAgenciaComisionesUsuarios() {
		HashMap<Cliente,Double> comisionesUsuarios = this.agencia.getComisionesUsuarios();
		Assert.assertEquals("Error en comisionesUsuarios", this.comisionesUsuarios, comisionesUsuarios);
	}

	@Test
	public void testAgenciaContrataciones() {
		ArrayList<Contratacion> contrataciones = this.agencia.getContrataciones();
		Assert.assertEquals("Error en contrataciones", this.contrataciones, contrataciones);
	}

	@Test
	public void testAgenciaEmpleadores() {
		HashMap<String,Empleador> empleadores = this.agencia.getEmpleadores();
		Assert.assertEquals("Error en empleadores", this.empleadores, empleadores);
	}

	@Test
	public void testAgenciaEmpleados() {
		HashMap<String,EmpleadoPretenso> empleados = this.agencia.getEmpleados();
		Assert.assertEquals("Error en empleados", this.empleados, empleados);
	}

	@Test
	public void testAgenciaLimiteInferior() {
		int limiteInferior = this.agencia.getLimiteInferior();
		Assert.assertEquals("Error en empleados", this.limiteInferior, limiteInferior);
	}

	@Test
	public void testAgenciaLimiteSuperior() {
		int limiteSuperior = this.agencia.getLimiteSuperior();
		Assert.assertEquals("Error en empleados", this.limiteSuperior, limiteSuperior);
	}

	@Test
	public void testAgenciaEstadoContratacion() {
		boolean estadoContratacion = this.agencia.isEstadoContratacion();
		Assert.assertEquals("Error en empleados", this.estadoContratacion, estadoContratacion);
	}

}
