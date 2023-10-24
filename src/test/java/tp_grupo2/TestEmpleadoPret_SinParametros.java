package tp_grupo2;

import static org.junit.Assert.*;
import junit.framework.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modeloDatos.EmpleadoPretenso;
import modeloDatos.Ticket;
import modeloDatos.Usuario;

public class TestEmpleadoPret_SinParametros {
	EmpleadoPretenso empleadopretenso;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.empleadopretenso = new EmpleadoPretenso();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
}
