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
import persistencia.AgenciaDTO;

public class TestAgenciaDTO {
	AgenciaDTO agenciaDTO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.agenciaDTO = new AgenciaDTO();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLimiteInferior() {
		this.agenciaDTO.setLimiteInferior(999);
		Assert.assertEquals("Error en agenciaDTO LimiteInferior", 999, this.agenciaDTO.getLimiteInferior());
	}

	@Test
	public void testLimiteSuperior() {
		this.agenciaDTO.setLimiteSuperior(9999);
		Assert.assertEquals("Error en agenciaDTO LimiteSuperior", 9999, this.agenciaDTO.getLimiteSuperior());
	}

	@Test
	public void testEstadoContratacion() {
		this.agenciaDTO.setEstadoContratacion(true);
		Assert.assertTrue("Error en agenciaDTO estadoContratacion", this.agenciaDTO.isEstadoContratacion());
	}

	@Test
	public void testEmpleados() {
		HashMap<String, EmpleadoPretenso> empleados = new HashMap<String, EmpleadoPretenso>();
		this.agenciaDTO.setEmpleados(empleados);
		Assert.assertEquals("Error en agenciaDTO empleados", empleados, this.agenciaDTO.getEmpleados());
	}

	@Test
	public void testEmpleadores() {
		HashMap<String, Empleador> empleadores = new HashMap<String, Empleador>();
		this.agenciaDTO.setEmpleadores(empleadores);
		Assert.assertEquals("Error en agenciaDTO empleadores", empleadores, this.agenciaDTO.getEmpleadores());
	}
	
	@Test
	public void testContrataciones() {
		ArrayList<Contratacion>	contrataciones = new ArrayList<Contratacion>();
		this.agenciaDTO.setContrataciones(contrataciones);
		Assert.assertEquals("Error en agenciaDTO empleadores", contrataciones, this.agenciaDTO.getContrataciones());
	}
	
	@Test
	public void testComisionesUsuarios() {
		HashMap<Cliente, Double> comisionesUsuarios= new HashMap<Cliente, Double>();
		this.agenciaDTO.setComisionesUsuarios(comisionesUsuarios);
		Assert.assertEquals("Error en agenciaDTO comisionesUsuarios", comisionesUsuarios, this.agenciaDTO.getComisionesUsuarios());
	}	
}
