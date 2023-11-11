package tp_grupo2.test_GUI;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Robot;

import javax.swing.JButton;
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
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REGISTRAR);
		TestUtils.clickComponent(botonLogin, robot);
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		//JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test4() {
		JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REGISTRAR);
		TestUtils.clickComponent(botonLogin, robot);
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		//JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("nombre", robot);
        
		JButton botonRegistrar = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		Assert.assertFalse("El boton de registro deberia estar deshabilitado", botonRegistrar.isEnabled());
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		//fail("Not yet implemented");
	}
	
	
	

}
