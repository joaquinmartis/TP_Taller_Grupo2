package tp_grupo2.TestAgencia;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import excepciones.LimiteInferiorRemuneracionInvalidaException;
import excepciones.LimiteSuperiorRemuneracionInvalidaException;
import modeloDatos.Cliente;
import modeloDatos.Contratacion;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloNegocio.Agencia;
import persistencia.IPersistencia;
import persistencia.PersistenciaXML;

public class TestAgenciaGettersSettersVacios {
	Agencia agencia;
	ArrayList<Contratacion> contrataciones;
	HashMap<String,EmpleadoPretenso> empleados;
	HashMap<String,Empleador> empleadores;
	HashMap<Cliente,Double> comisionesUsuarios;
	ArrayList<Contratacion> coincidencias;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.agencia = agencia.getInstance();
		this.empleados = new HashMap<String,EmpleadoPretenso>();
		this.empleadores = new HashMap<String,Empleador>();
		this.contrataciones = new ArrayList<Contratacion>();
		this.comisionesUsuarios = new HashMap<Cliente,Double>();
		this.coincidencias = new ArrayList<Contratacion>();
		
		this.agencia.setEmpleados(empleados);
		this.agencia.setEmpleadores(empleadores);
		this.agencia.setContrataciones(contrataciones);
		this.agencia.setComisionesUsuarios(comisionesUsuarios);
		this.agencia.setCoincidencias(coincidencias);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetEstadoTrue() {
		this.agencia.setEstadoContratacion(true);
		Assert.assertEquals("Error en getEstado()", util.Mensajes.AGENCIA_EN_CONTRATACION.getValor(), this.agencia.getEstado());
	}
	
	@Test
	public void testGetEstadoFalse() {
		this.agencia.setEstadoContratacion(false);
		Assert.assertEquals("Error en getEstado()", util.Mensajes.AGENCIA_EN_BUSQUEDA.getValor(), this.agencia.getEstado());
	}
	
	@Test
	public void testGetInstance() {
		Assert.assertEquals("Error en Agencia.getInstance()", this.agencia, Agencia.getInstance());
	}
	
	@Test
	public void testSetCoincidencias() {
		this.agencia.setCoincidencias(this.coincidencias);
		Assert.assertEquals("Error en setContrataciones", this.coincidencias, this.agencia.getCoincidencias());
	}
	
	@Test
	public void testSetComisionesUsuarios() {
		this.agencia.setComisionesUsuarios(this.comisionesUsuarios);
		Assert.assertEquals("Error en testSetComisionesUsuarios", this.comisionesUsuarios, this.agencia.getComisionesUsuarios());
	}
	
	@Test
	public void testSetContrataciones() {
		this.agencia.setContrataciones(this.contrataciones);
		Assert.assertEquals("Error en testSetContrataciones", this.contrataciones, this.agencia.getContrataciones());
	}
	
	@Test
	public void testSetEmpleadores() {
		this.agencia.setEmpleadores(this.empleadores);
		Assert.assertEquals("Error en testSetEmpleadores", this.empleadores, this.agencia.getEmpleadores());
	}
	
	@Test
	public void testSetEmpleados() {
		this.agencia.setEmpleados(this.empleados);
		Assert.assertEquals("Error en testSetEmpleados", this.empleados, this.agencia.getEmpleados());
	}
	
	@Test
	public void testSetEstadoContratacionTrue() {
		this.agencia.setEstadoContratacion(true);
		Assert.assertEquals("Error en testSetEstadoContratacion", true, this.agencia.isEstadoContratacion());
	}
	
	@Test
	public void testSetEstadoContratacionFalse() {
		this.agencia.setEstadoContratacion(false);
		Assert.assertEquals("Error en testSetEstadoContratacion", false, this.agencia.isEstadoContratacion());
	}
	
	@Test
	public void testSetLimitesRemuneracionValidos() {
		try {
			this.agencia.setLimitesRemuneracion(1, 999999);
		} catch (LimiteSuperiorRemuneracionInvalidaException e) {
			fail("No deberia lanzar LimiteSuperiorRemuneracionInvalidaException");
		} catch (LimiteInferiorRemuneracionInvalidaException e) {
			fail("No deberia lanzar LimiteInferiorRemuneracionInvalidaException");
		}
	}
	
	@Test
	public void testGetLimiteInferior() {
		try {
			this.agencia.setLimitesRemuneracion(1, 999999);
			Assert.assertEquals("Error en getLimiteInferior", 1, this.agencia.getLimiteInferior());
		} catch (Exception e) {
			fail("No deberia lanzar ninguna excepcion");
		}
	}
	
	@Test
	public void testGetLimiteSuperior() {
		try {
			this.agencia.setLimitesRemuneracion(1, 999999);
			Assert.assertEquals("Error en getLimiteSuperior", 999999, this.agencia.getLimiteSuperior());
		} catch (Exception e) {
			fail("No deberia lanzar ninguna excepcion");
		}
	}
	
	@Test
	public void testSetLimitesRemuneracionExceptionSuperior() {
		try {
			this.agencia.setLimitesRemuneracion(2, 1);
			fail("Deberia lanzar LimiteSuperiorRemuneracionInvalidaException");
		} catch (LimiteSuperiorRemuneracionInvalidaException e) {
			
		} catch (LimiteInferiorRemuneracionInvalidaException e) {
			fail("No deberia lanzar LimiteInferiorRemuneracionInvalidaException");
		}
	}
	
	@Test
	public void testSetLimitesRemuneracionExceptionInferior() {
		try {
			this.agencia.setLimitesRemuneracion(-1, 999999);
			fail("Deberia lanzar LimiteInferiorRemuneracionInvalidaException");
		} catch (LimiteSuperiorRemuneracionInvalidaException e) {
			fail("No deberia lanzar LimiteSuperiorRemuneracionInvalidaException");
		} catch (LimiteInferiorRemuneracionInvalidaException e) {
		}
	}
	
	@Test
	public void testSetPersistenciaNull() {
		this.agencia.setPersistencia(null);
		Assert.assertEquals("Error en setPersistencia()", null, this.agencia.getPersistencia());
	}

	public void testSetPersistencia() {
		IPersistencia persistencia = new PersistenciaXML();
		this.agencia.setPersistencia(persistencia);
		Assert.assertEquals("Error en setPersistencia", persistencia, this.agencia.getPersistencia());
	}
	
	@Test
	public void testGetIterartorEmpleadores() {
		Iterator<Empleador> empleadores = this.agencia.getIterartorEmpleadores();
		Assert.assertFalse("Error en getIterartorEmpleadores()", empleadores.hasNext());
	}
	
	@Test
	public void testGetIterartorEmpleadosPretensos() {
		Iterator<EmpleadoPretenso> empleados = this.agencia.getIteratorEmpleadosPretensos();
		Assert.assertFalse("Error en getIteratorEmpleadosPretensos()", empleados.hasNext());
	}
}
