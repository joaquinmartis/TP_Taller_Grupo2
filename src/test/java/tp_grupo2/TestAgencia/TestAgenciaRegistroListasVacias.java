package tp_grupo2.TestAgencia;

import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import excepciones.ContraException;
import excepciones.ImposibleCrearEmpleadoException;
import excepciones.ImposibleCrearEmpleadorException;
import excepciones.NewRegisterException;
import excepciones.NombreUsuarioException;
import modeloDatos.Cliente;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloNegocio.Agencia;

public class TestAgenciaRegistroListasVacias {
	Agencia agencia;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.agencia = Agencia.getInstance();
		this.agencia.setEmpleadores(new HashMap<String, Empleador>());
		this.agencia.setEmpleados(new HashMap<String,EmpleadoPretenso>());
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testLoginListasVacias() {
		try {
			this.agencia.login("usuario", "contrasena");
			fail("Deberia lanzar NombreUsuarioException");
		} catch (ContraException e) {
			fail("Deberia lanzar NombreUsuarioException");
		} catch (NombreUsuarioException e) {
			
		}
	}

	@Test
	public void testRegistroEmpleadorCorrecto() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono="2234434312";
		String tipoPersona = util.Constantes.FISICA;
		String rubro = util.Constantes.SALUD;
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
		} catch (NewRegisterException e) {
			fail("No deberia lanzar la excepción");
		} catch (ImposibleCrearEmpleadorException e){
			fail("No se pudo crear el Empleador");
		}
	}
	
	@Test
	public void testRegistroEmpleadorNombreNulo() {
		String nombreUsuario= null;
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono="2234434312";
		String tipoPersona = util.Constantes.FISICA;
		String rubro = util.Constantes.SALUD;
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("No se deberia lanzar la excepcion");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	@Test
	public void testRegistroEmpleadorContrasenaNula() {
		String nombreUsuario= "Pepegamer";
		String pass=null;
		String nombreReal="Pepe Gomes";
 		String telefono="2234434312";
		String tipoPersona = util.Constantes.FISICA;
		String rubro = util.Constantes.SALUD;
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("No se deberia lanzar la excepcion");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	@Test
	public void testRegistroEmpleadorNombreRealNulo() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal=null;
 		String telefono="2234434312";
		String tipoPersona = util.Constantes.FISICA;
		String rubro = util.Constantes.SALUD;
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}
	
	@Test
	public void testRegistroEmpleadorTelefonoNulo() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono=null;
		String tipoPersona = util.Constantes.FISICA;
		String rubro = util.Constantes.SALUD;
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	@Test
	public void testRegistroEmpleadorTipoPersonaErroneo() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono="2234434312";
		String tipoPersona="NORMAL";
		String rubro = util.Constantes.SALUD;
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	@Test
	public void testRegistroEmpleadorTipoPersonaNull() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono="2234434312";
		String tipoPersona=null;
		String rubro = util.Constantes.SALUD;
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	@Test
	public void testRegistroEmpleadorRubroErroneo() {
		String nombreUsuario = "Pepegamer";
		String pass = "contrasenia";
		String nombreReal = "Pepe Gomes";
 		String telefono = "2234434312";
		String tipoPersona = util.Constantes.FISICA;
		String rubro = "INFORMATICA";
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador, debido a que rubro no es SALUD, COMERCIO LOCAL ni COMERCIO INTERNACIONAL");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	@Test
	public void testRegistroEmpleadorRubroNull() {
		String nombreUsuario = "Pepegamer";
		String pass = "contrasenia";
		String nombreReal = "Pepe Gomes";
 		String telefono = "2234434312";
		String tipoPersona = util.Constantes.FISICA;
		String rubro = null;
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	@Test
	public void testRegistroEmpleadoCorrecto(){
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe";
		String apellido="gomes";
		String telefono="2234434312";
		int edad=21;
		
		try {
			this.agencia.registroEmpleado(nombreUsuario,pass,nombreReal,apellido,telefono,edad);
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadoException e){
			fail("No creo la cuenta, pero deberia haberlo hecho");
		}
	}

	@Test
	public void testRegistroEmpleadoNombreDeUsuarioNulo(){
		String nombreUsuario= null;
		String pass="contrasenia";
		String nombreReal="Pepe";
		String apellido="gomes";
		String telefono="2234434312";
		int edad=21;
		
		try {
			this.agencia.registroEmpleado(nombreUsuario,pass,nombreReal,apellido,telefono,edad);
			fail("No lanza excepcion");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadoException e){
		}
	}

	@Test
	public void testRegistroEmpleadoContrasenaNula(){
		String nombreUsuario= "Pepegamer";
		String pass=null;
		String nombreReal="Pepe";
		String apellido="gomes";
		String telefono="2234434312";
		int edad=21;
		
		try {
			this.agencia.registroEmpleado(nombreUsuario,pass,nombreReal,apellido,telefono,edad);
			fail("No creo la cuenta, pero deberia haberlo hecho");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadoException e){
		}
	}

	@Test
	public void testRegistroEmpleadoNombreRealNulo(){
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal=null;
		String apellido="gomes";
		String telefono="2234434312";
		int edad=21;
		
		try {
			this.agencia.registroEmpleado(nombreUsuario,pass,nombreReal,apellido,telefono,edad);
			fail("No creo la cuenta, pero deberia haberlo hecho");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadoException e){
		}
	}

	@Test
	public void testRegistroEmpleadoApellidoNulo(){
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe";
		String apellido=null;
		String telefono="2234434312";
		int edad=21;
		
		try {
			this.agencia.registroEmpleado(nombreUsuario,pass,nombreReal,apellido,telefono,edad);
			fail("No creo la cuenta, pero deberia haberlo hecho");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadoException e){
		}
	}
	
	@Test
	public void testRegistroEmpleadoTelefonoNulo(){
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe";
		String apellido="gomes";
		String telefono=null;
		int edad=21;
		
		try {
			this.agencia.registroEmpleado(nombreUsuario,pass,nombreReal,apellido,telefono,edad);
			fail("No creo la cuenta, pero deberia haberlo hecho");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadoException e){
		}
	}
}
