package tp_grupo2.test_GUI;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Robot;
import java.util.HashMap;

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
import modeloDatos.EmpleadoPretenso;
import modeloDatos.Empleador;
import modeloNegocio.Agencia;
import util.Constantes;

public class TestGUIEmpleadoEnabledDisabled {

	Robot robot;
	Controlador controlador;
	Agencia agencia;

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
		this.controlador = new Controlador();
		TestUtils.setDelay(20);
		this.agencia = agencia.getInstance();
		HashMap<String, Empleador> empleadores= new HashMap<String, Empleador>();
		HashMap<String,EmpleadoPretenso> empleados=new HashMap<String,EmpleadoPretenso>();
		this.agencia.setEmpleadores(empleadores);
		this.agencia.setEmpleados(empleados);
		agencia.registroEmpleado("Empleado", "empleado", "Empleado", "Perez" , "2233422711", 22);
		
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		

		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("Empleado", robot);
		TestUtils.clickComponent(cajaTexto_Password, robot);
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
		Assert.assertFalse("El campo de remuneracion deberia estar deshablitado", cajaTexto_Remuneracion_Pretentidida.isEnabled());
		JButton botonNuevo_Ticket = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NUEVOTICKET);
		TestUtils.clickComponent(botonNuevo_Ticket, robot);
		Assert.assertTrue("El campo de remuneracion deberia estar habilitado", cajaTexto_Remuneracion_Pretentidida.isEnabled());
		Assert.assertTrue("El RadioButton deberia estar hablitado", radioButton_Jornada.isEnabled());
		Assert.assertTrue("El RadioButton deberia estar hablitado", radioButton_Experiencia.isEnabled());
		Assert.assertTrue("El RadioButton deberia estar hablitado", radioButton_Estudios.isEnabled());
		Assert.assertTrue("El RadioButton deberia estar hablitado", radioButton_Tipo_Puesto.isEnabled());
		Assert.assertTrue("El RadioButton deberia estar hablitado", radioButton_Locacion.isEnabled());
	}

	

	@Test
	public void test2() {
		JTextField cajaTexto_Remuneracion_Pretentidida= (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTFIELD_REMUNERACION);
		
		JButton botonNuevo_Ticket = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NUEVOTICKET);
		TestUtils.clickComponent(botonNuevo_Ticket, robot);
		
		TestUtils.clickComponent(cajaTexto_Remuneracion_Pretentidida, robot);
		TestUtils.tipeaTexto("12000", robot);
		
		JButton botonAceptar= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.CONFIRMARNUEVOTICKET);
		Assert.assertTrue("El boton deberia estar hablitado", botonAceptar.isEnabled());
	}
	
	@Test
	public void test3() {
		JTextField cajaTexto_Remuneracion_Pretentidida= (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTFIELD_REMUNERACION);
		
		JButton botonNuevo_Ticket = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NUEVOTICKET);
		TestUtils.clickComponent(botonNuevo_Ticket, robot);
		
		TestUtils.clickComponent(cajaTexto_Remuneracion_Pretentidida, robot);
		TestUtils.tipeaTexto("0", robot);
		
		JButton botonAceptar= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.CONFIRMARNUEVOTICKET);
		Assert.assertFalse("El boton deberia estar deshablitado", botonAceptar.isEnabled());
	}
	
	@Test
	public void test4() {
		JTextField cajaTexto_Remuneracion_Pretentidida= (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTFIELD_REMUNERACION);
		
		JButton botonNuevo_Ticket = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NUEVOTICKET);
		TestUtils.clickComponent(botonNuevo_Ticket, robot);
		
		TestUtils.clickComponent(cajaTexto_Remuneracion_Pretentidida, robot);
		TestUtils.tipeaTexto("-12000", robot);
		
		JButton botonAceptar= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.CONFIRMARNUEVOTICKET);
		Assert.assertFalse("El boton deberia estar deshablitado", botonAceptar.isEnabled());
	}
	
	@Test
	public void test5() { 
		JButton botonEliminarTicket= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.ELIMINAR_TICKET);
		Assert.assertFalse("El boton deberia estar deshablitado", botonEliminarTicket.isEnabled());
		
		JTextField cajaTexto_Remuneracion_Pretentidida= (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTFIELD_REMUNERACION);
		
		JButton botonNuevo_Ticket = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NUEVOTICKET);
		TestUtils.clickComponent(botonNuevo_Ticket, robot);
		
		TestUtils.clickComponent(cajaTexto_Remuneracion_Pretentidida, robot);
		TestUtils.tipeaTexto("12000", robot);
		
		JButton botonAceptar= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.CONFIRMARNUEVOTICKET);
		TestUtils.clickComponent(botonAceptar, robot);
		
		Assert.assertTrue("El boton deberia estar hablitado", botonEliminarTicket.isEnabled());
	}
}
