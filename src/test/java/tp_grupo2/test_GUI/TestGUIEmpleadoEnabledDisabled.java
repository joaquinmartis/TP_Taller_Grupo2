package tp_grupo2.test_GUI;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Robot;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controlador.Controlador;
import util.Constantes;

public class TestGUIEmpleadoEnabledDisabled {

	Robot robot;
	Controlador controlador;
	

	public TestGUIEmpleadoEnabledDisabled()
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
		
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
	
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("Empleado", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("empleado", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("empleado", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("Empleado", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("22", robot);
		
        JButton botonRegistrar2= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
        TestUtils.clickComponent(botonRegistrar2, robot);
        
        JButton botonCerrar_Sesion= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.CERRARSESION);
		TestUtils.clickComponent(botonCerrar_Sesion, robot);
		
		JTextField cajaTexto_Nombre_Usuario2 = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		JTextField cajaTexto_Password2 = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario2, robot);
        TestUtils.tipeaTexto("Empleado", robot);
		TestUtils.clickComponent(cajaTexto_Password2, robot);
        TestUtils.tipeaTexto("empleado", robot);
        
		JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
		TestUtils.clickComponent(botonLogin, robot);
		
	}

	@After
	public void tearDown() throws Exception {
		JButton botonCerrar_Sesion= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.CERRARSESION);
		TestUtils.clickComponent(botonCerrar_Sesion, robot);
	}

	@Test
	public void test1() {
		JTextField cajaTexto_Remuneracion_Pretentidida= (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTFIELD_REMUNERACION);
		JRadioButton radioButton_Jornada = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.JORNADA_COMPLETA);
		JRadioButton radioButton_Experiencia= (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EXP_NADA);
		JRadioButton radioButton_Estudios = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.SECUNDARIOS);
		JRadioButton radioButton_Tipo_Puesto = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.MANAGMENT);
		JRadioButton radioButton_Locacion = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.HOME_OFFICE);
		
		Assert.assertFalse("El campo de remuneracion deberia estar deshablitado", cajaTexto_Remuneracion_Pretentidida.isEnabled());
		Assert.assertFalse("El RadioButton deberia estar deshablitado", radioButton_Jornada.isEnabled());
		Assert.assertFalse("El RadioButton deberia estar deshablitado", radioButton_Experiencia.isEnabled());
		Assert.assertFalse("El RadioButton deberia estar deshablitado", radioButton_Estudios.isEnabled());
		Assert.assertFalse("El RadioButton deberia estar deshablitado", radioButton_Tipo_Puesto.isEnabled());
		Assert.assertFalse("El RadioButton deberia estar deshablitado", radioButton_Locacion.isEnabled());
		//Assert.assertFalse("El campo de remuneracion deberia estar deshablitado", cajaTexto_Remuneracion_Pretentidida.isEnabled());
		JButton botonNuevo_Ticket = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NUEVOTICKET);
		TestUtils.clickComponent(botonNuevo_Ticket, robot);
		Assert.assertTrue("El campo de remuneracion deberia estar habilitado", cajaTexto_Remuneracion_Pretentidida.isEnabled());
		Assert.assertTrue("El RadioButton deberia estar hablitado", radioButton_Jornada.isEnabled());
		Assert.assertTrue("El RadioButton deberia estar hablitado", radioButton_Experiencia.isEnabled());
		Assert.assertTrue("El RadioButton deberia estar hablitado", radioButton_Estudios.isEnabled());
		Assert.assertTrue("El RadioButton deberia estar hablitado", radioButton_Tipo_Puesto.isEnabled());
		Assert.assertTrue("El RadioButton deberia estar hablitado", radioButton_Locacion.isEnabled());
	}

}
