package tp_grupo2.TestAgencia;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import excepciones.ImposibleCrearEmpleadoException;
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

	public void testregistroEmpleador2bis() {
		String nombreUsuario=null;
		String pass=null;
		String nombreReal=null;
 		String telefono=null;
		String tipoPersona=null;
		String rubro=null;
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

	public void testregistroEmpleador3bis() {
		String nombreUsuario= null;
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
	public void testregistroEmpleador4() {
		String nombreUsuario= "Pepegamer";
		String pass="";
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

public void testregistroEmpleador4bis() {
		String nombreUsuario= "Pepegamer";
		String pass=null;
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

	public void testregistroEmpleador5() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="";
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

	public void testregistroEmpleador5bis() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal=null;
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

	public void testregistroEmpleador6() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono="";
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

	public void testregistroEmpleador6bis() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono=null;
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

	public void testregistroEmpleador7() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono="2234434312";
		String tipoPersona="";
		String rubro="Informatica";
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	public void testregistroEmpleador7bis() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono="2234434312";
		String tipoPersona=null;
		String rubro="Informatica";
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	public void testregistroEmpleador8() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono="2234434312";
		String tipoPersona="FISICA";
		String rubro="";
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	public void testregistroEmpleador8bis() {
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe Gomes";
 		String telefono="2234434312";
		String tipoPersona="FISICA";
		String rubro=null;
		try {
			this.agencia.registroEmpleador(nombreUsuario, pass, nombreReal, telefono, tipoPersona, rubro);
			fail("No deberia crear el Empleador");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadorException e){
		}
	}

	public void testregistroEmpleado1(){
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

	public void testregistroEmpleado2(){
		String nombreUsuario= "";
		String pass="";
		String nombreReal="";
		String apellido="";
		String telefono="";
		int edad=-1;
		
		try {
			this.agencia.registroEmpleado(nombreUsuario,pass,nombreReal,apellido,telefono,edad);
			fail("No creo la cuenta, pero deberia haberlo hecho");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadoException e){
		}
	}

	public void testregistroEmpleado2bis(){
		String nombreUsuario= null;
		String pass=null;
		String nombreReal=null;
		String apellido=null;
		String telefono=null;
		int edad=-1;
		
		try {
			this.agencia.registroEmpleado(nombreUsuario,pass,nombreReal,apellido,telefono,edad);
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadoException e){
			fail("No creo la cuenta, pero deberia haberlo hecho");
		}
	}
	
	public void testregistroEmpleado3(){
		String nombreUsuario= "";
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

	public void testregistroEmpleado3bis(){
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

	public void testregistroEmpleado4(){
		String nombreUsuario= "Pepegamer";
		String pass="";
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

	public void testregistroEmpleado4bis(){
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
	
	public void testregistroEmpleado5(){
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="";
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

	public void testregistroEmpleado5bis(){
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

	public void testregistroEmpleado6(){
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe";
		String apellido="";
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

	public void testregistroEmpleado6bis(){
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

	public void testregistroEmpleado7(){
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe";
		String apellido="gomes";
		String telefono="";
		int edad=21;
		
		try {
			this.agencia.registroEmpleado(nombreUsuario,pass,nombreReal,apellido,telefono,edad);
			fail("No creo la cuenta, pero deberia haberlo hecho");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadoException e){
		}
	}

	public void testregistroEmpleado7bis(){
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

	public void testregistroEmpleado8(){
		String nombreUsuario= "Pepegamer";
		String pass="contrasenia";
		String nombreReal="Pepe";
		String apellido="gomes";
		String telefono="2234434312";
		int edad=-1;
		
		try {
			this.agencia.registroEmpleado(nombreUsuario,pass,nombreReal,apellido,telefono,edad);
			fail("No creo la cuenta, pero deberia haberlo hecho");
		} catch (NewRegisterException e) {
			fail("Ya existe un empleador con ese nombre de usuario");
		} catch (ImposibleCrearEmpleadoException e){
		}
	}
}
