package tp_grupo2.TestAgencia;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import excepciones.ImposibleCrearEmpleadorException;
import excepciones.NewRegisterException;
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloNegocio.Agencia;

public class TestAgencia {
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
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test/**
	Se encarga de realizar el inicio de sesion de un usuario en la aplicacion, ya sean empleados, empleadores o administradores Si el inicio de sesion es exitoso, el usuario quedara logeado en la aplicacion y el atributo tipo de usuario sera seteado: 0 para Empleado, 1 para Empleador, 2 para Administrador

Parameters:
    nombreUsuario - String: nombre de usuario de quien se quiere loguear
    pass - String: contrasena del usuario que se quiere loguear
Returns:
    Se retorna un objeto Usuario con el objeto usuario
Throws:
    ContraException - si la contrasena no es correcta se lanza una excepcion del tipo ContraException
    NombreUsuarioException - si no se encontro un empleado, un empleador o un administrador con el nombreUsuario proporcionado, se lanza una excepcion NombreUsuarioException Pre: nombre de usuario y contrasena distintos de null 
	*/
	public void testregistroEmpleador1() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono="2234434312";
		String tipoPersona="FISICA";
		String rubro="Informatica";
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);	
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
			fail("No se pudo crear el Empleador");
		}
	}

	public void testregistroEmpleador2() {
		String nombreUsuario="";
		String pass="";
		String nombreReal="";
 		String telefono="";
		String tipoPersona="";
		String rubro="";
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	public void testregistroEmpleador3() {
		String nombreUsuario= "";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono="2234434312";
		String tipoPersona="FISICA";
		String rubro="Informatica";
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

}
