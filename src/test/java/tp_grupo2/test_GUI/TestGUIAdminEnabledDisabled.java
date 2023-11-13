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
import util.Mensajes;

public class TestGUIAdminEnabledDisabled {
	Robot robot;
	Controlador controlador;
	
	
	public TestGUIAdminEnabledDisabled()
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
		this.controlador = new Controlador();
		
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		
        TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("admin", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("admin", robot);
        
        JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
        TestUtils.clickComponent(botonLogin, robot);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		JTextField cajaTexto_limite_Superior = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTO_SUPERIOR);
        JTextField cajaTexto_limite_Inferior = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTO_INFERIOR);
        TestUtils.clickComponent(cajaTexto_limite_Superior, robot);
        TestUtils.tipeaTexto("1200", robot);
        TestUtils.clickComponent(cajaTexto_limite_Inferior, robot);
        TestUtils.tipeaTexto("3000", robot);
        

        JButton botonModificar_Valores= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.MODIFICAR_VALORES);
        Assert.assertFalse("El boton deberia estar deshabilitado",botonModificar_Valores.isEnabled());
        
        
	}
		
	@Test
	public void test2() {
		JTextField cajaTexto_limite_Superior = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTO_SUPERIOR);
        JTextField cajaTexto_limite_Inferior = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTO_INFERIOR);
        TestUtils.clickComponent(cajaTexto_limite_Superior, robot);
        TestUtils.tipeaTexto("-1234", robot);
        TestUtils.clickComponent(cajaTexto_limite_Inferior, robot);
        TestUtils.tipeaTexto("-5467", robot);
        

        JButton botonModificar_Valores= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.MODIFICAR_VALORES);
        Assert.assertFalse("El boton deberia estar deshabilitado",botonModificar_Valores.isEnabled());
        
        
	}
	@Test
	public void test3() {
		JTextField cajaTexto_limite_Superior = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTO_SUPERIOR);
        JTextField cajaTexto_limite_Inferior = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTO_INFERIOR);
        TestUtils.clickComponent(cajaTexto_limite_Superior, robot);
        TestUtils.tipeaTexto("3000", robot);
        TestUtils.clickComponent(cajaTexto_limite_Inferior, robot);
        TestUtils.tipeaTexto("1200", robot);
        

        JButton botonModificar_Valores= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.MODIFICAR_VALORES);
        Assert.assertTrue("El boton deberia estar habilitado",botonModificar_Valores.isEnabled());

	}

}
