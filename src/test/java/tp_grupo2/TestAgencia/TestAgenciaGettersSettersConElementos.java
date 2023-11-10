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

public class TestAgenciaGettersSettersConElementos {
	Agencia agencia;
	ArrayList<Contratacion> contrataciones;
	HashMap<String, EmpleadoPretenso> empleados;
	HashMap<String, Empleador> empleadores;
	HashMap<Cliente, Double> comisionesUsuarios;
	ArrayList<Contratacion> coincidencias;
	IPersistencia persistencia;
	Empleador empleador;
	EmpleadoPretenso empleado;
	Contratacion contratacion;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.empleador = new Empleador("juancito", "qwerty123", "Juan Cito", "+54 9 223 666-1234", util.Constantes.SALUD, util.Constantes.JURIDICA);
		this.empleado  = new EmpleadoPretenso("PedroRodriguez1", "boca2023", "Pedro Rodriguez", "+54 9 223 594-3482","Rodriguez", 36);
		
		this.agencia = Agencia.getInstance();
		this.empleados = new HashMap<String,EmpleadoPretenso>();
		this.empleadores = new HashMap<String,Empleador>();
		this.contrataciones = new ArrayList<Contratacion>();
		this.comisionesUsuarios = new HashMap<Cliente,Double>();
		this.coincidencias = new ArrayList<Contratacion>();
		this.persistencia = new PersistenciaXML();
		
		this.empleados.put("+54 9 223 594-3482", empleado);
		this.empleadores.put("+54 9 223 666-1234", empleador);
		this.contratacion = new Contratacion(empleador, empleado);
		this.contrataciones.add(contratacion);
		this.comisionesUsuarios.put(this.empleado, 0.01);	
		this.coincidencias.add(contratacion);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSetContrataciones() {
		this.agencia.setContrataciones(this.contrataciones);
		Assert.assertEquals("Error en testSetContrataciones", this.contrataciones, this.agencia.getContrataciones());
	}
	
	@Test
	public void testSetCoincidencias() {
		this.agencia.setCoincidencias(this.coincidencias);
		Assert.assertEquals("Error en setContrataciones", this.coincidencias, this.agencia.getCoincidencias());
	}
	
	@Test
	public void testGetContratacionEmpleador() {
		this.agencia.setContrataciones(this.contrataciones);
		this.agencia.setCoincidencias(this.coincidencias); //como no se especifica en que lista se busca se setean las 2 con la contratacion
		EmpleadoPretenso empleado = (EmpleadoPretenso) this.agencia.getContratacionEmpleador(this.empleador);
		Assert.assertEquals("Error en getContratacionEmpleador()", this.empleado, empleado);
	}
	
	@Test
	public void testGetContratacionEmpleadoPretenso() {
		this.agencia.setContrataciones(this.contrataciones);
		this.agencia.setCoincidencias(this.coincidencias); //como no se especifica en que lista se busca se setean las 2 con la contratacion
		Empleador empleador = (Empleador) this.agencia.getContratacionEmpleadoPretenso(this.empleado);
		Assert.assertEquals("Error en getContratacionEmpleadoPretenso()", this.empleador, empleador);
		
	}
	
	@Test
	public void testSetComisionesUsuarios() {
		this.agencia.setComisionesUsuarios(this.comisionesUsuarios);
		Assert.assertEquals("Error en testSetComisionesUsuarios", this.comisionesUsuarios, this.agencia.getComisionesUsuarios());
	}
	
	@Test
	public void testGetComisionUsuario() {
		this.agencia.setComisionesUsuarios(this.comisionesUsuarios);
		Assert.assertEquals("Error en testGetComisionUsuario", 0.01,this.agencia.getComisionUsuario(this.empleado));
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
	public void testGetIterartorEmpleadores() {
		this.agencia.setEmpleadores(empleadores);;
		Iterator<Empleador> empleadores = this.agencia.getIterartorEmpleadores();
		Assert.assertTrue("Error en getIterartorEmpleadores()", empleadores.hasNext());
	}
	
	@Test
	public void testGetIterartorEmpleadosPretensos() {
		this.agencia.setEmpleados(empleados);
		Iterator<EmpleadoPretenso> empleados = this.agencia.getIteratorEmpleadosPretensos();
		Assert.assertTrue("Error en getIteratorEmpleadosPretensos()", empleados.hasNext());
	}
	
}
