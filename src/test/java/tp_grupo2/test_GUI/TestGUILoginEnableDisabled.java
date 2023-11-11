package tp_grupo2.test_GUI;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Robot;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controlador.Controlador;
import util.Constantes;


public class TestGUILoginEnableDisabled {
	Robot robot;
	Controlador controlador;
	

	public TestGUILoginEnableDisabled()
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
	public void testVacio() {
		JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
		Assert.assertFalse("El boton de registro deberia estar deshablitado", botonLogin.isEnabled());
	}
	@Test
	public void testUnCampoLleno1() {
		JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("SALCHICHA", robot);
        
        Assert.assertFalse("El boton de registro deberia estar deshablitado", botonLogin.isEnabled());	
	}
	@Test
	public void testUnCampoLleno2() {
		JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		
		TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("WASD", robot);
        
        Assert.assertFalse("El boton de registro deberia estar deshablitado", botonLogin.isEnabled());
	}
	
	@Test
	public void testCamposLlenos() {
		JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		
		TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("WASD", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("SALCHICHA", robot);
        
        Assert.assertTrue("El boton de registro deberia estar habilitado", botonLogin.isEnabled());
	}
	
	
}
