package tp_grupo2.test_GUI;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Robot;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controlador.Controlador;
import util.Constantes;

public class TestGUIRegistrarEnabledDisabled {
	Robot robot;
	Controlador controlador;
	

	public TestGUIRegistrarEnabledDisabled()
    {
        try
        {
            robot = new Robot();
        } catch (AWTException e)
        {
        }
    }
	
	
	@Before
	public void setUp() throws Exception {
		controlador = new Controlador();
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REGISTRAR);
		TestUtils.clickComponent(botonRegistrar, robot);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		//JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	
	@Test
	public void test2() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test3() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test4() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);

		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test5() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);

		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test6Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);

		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test7Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test8Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
	
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertTrue("El boton de registro deberia estar habilitado", botonRegistrar.isEnabled());
	}
	@Test
	public void test9Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		//TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        //TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	@Test
	public void test10Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        //TestUtils.clickComponent(cajaTexto_Password, robot);
        //TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	@Test
	public void test11Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        //TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        //TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	@Test
	public void test12Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        //TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        //TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	@Test
	public void test13Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
       // TestUtils.clickComponent(cajaTexto_Telefono, robot);
        //TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	@Test
	public void test14Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        //TestUtils.clickComponent(cajaTexto_Apellido, robot);
        //TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	

	@Test
	public void test16Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("zapato", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test17Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("0", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test18Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("-12", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test19Empleado() { //Este metodo testea que el telefono pueda ser con letras
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("zapatofono", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertTrue("El boton de registro deberia estar habilitado", botonRegistrar.isEnabled());
	}
	
	
	@Test
	public void test6Empleador() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleador = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADOR);
		JRadioButton radioButton_RubroSalud = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_RADIO_SALUD);
		JRadioButton radioButton_TipoPersonaFisico = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_RADIO_FISICA);
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleador, robot);
        TestUtils.clickComponent(radioButton_RubroSalud, robot);
        TestUtils.clickComponent(radioButton_TipoPersonaFisico, robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertTrue("El boton de registro deberia estar habilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test7Empleador() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleador = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADOR);
		JRadioButton radioButton_RubroSalud = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_RADIO_SALUD);
		JRadioButton radioButton_TipoPersonaJuridica = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_RADIO_JURIDICA);
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleador, robot);
        TestUtils.clickComponent(radioButton_RubroSalud, robot);
        TestUtils.clickComponent(radioButton_TipoPersonaJuridica, robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertTrue("El boton de registro deberia estar habilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test8Empleador() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleador = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADOR);
		JRadioButton radioButton_RubroComercion_Internacional = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_RADIO_COMERCIO_INTERNACIONAL);
		JRadioButton radioButton_TipoPersonaJuridica = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_RADIO_JURIDICA);
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleador, robot);
        TestUtils.clickComponent(radioButton_RubroComercion_Internacional, robot);
        TestUtils.clickComponent(radioButton_TipoPersonaJuridica, robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertTrue("El boton de registro deberia estar habilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test9Empleador() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleador = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADOR);
		JRadioButton radioButton_RubroComercion_Local= (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_RADIO_COMERCIO_LOCAL);
		JRadioButton radioButton_TipoPersonaJuridica = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_RADIO_JURIDICA);
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleador, robot);
        TestUtils.clickComponent(radioButton_RubroComercion_Local, robot);
        TestUtils.clickComponent(radioButton_TipoPersonaJuridica, robot);
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertTrue("El boton de registro deberia estar habilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test20() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
        TestUtils.borraJTextField(cajaTexto_Nombre_Usuario,robot);
        
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test21() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
        TestUtils.borraJTextField(cajaTexto_Password,robot);
        
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	@Test
	public void test22() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
        TestUtils.borraJTextField(cajaTexto_RepetirPassword,robot);
        
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	@Test
	public void test23() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
        TestUtils.borraJTextField(cajaTexto_Nombre_Real,robot);
        
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	@Test
	public void test24() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
        TestUtils.borraJTextField(cajaTexto_Telefono,robot);
        
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	@Test
	public void test25Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
        
        
        TestUtils.borraJTextField(cajaTexto_Apellido,robot);
        
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test26Empleado() {
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("contrasena", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
       
        
        TestUtils.borraJTextField(cajaTexto_edad,robot);
        
        
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	
	
}
