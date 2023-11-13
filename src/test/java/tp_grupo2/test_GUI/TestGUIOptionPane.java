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
import util.Mensajes;

public class TestGUIOptionPane {

	Robot robot;
	Controlador controlador;
	FalsoOptionPane falsoOptionPane;
	Agencia agencia;
	public TestGUIOptionPane()
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
		TestUtils.setDelay(20);
		this.falsoOptionPane= new FalsoOptionPane();
		this.controlador.setMyOptionPane(falsoOptionPane);
		this.agencia = agencia.getInstance();
		HashMap<String, Empleador> empleadores= new HashMap<String, Empleador>();
		HashMap<String,EmpleadoPretenso> empleados=new HashMap<String,EmpleadoPretenso>();
		this.agencia.setEmpleadores(empleadores);
		this.agencia.setEmpleados(empleados);
		agencia.registroEmpleado("Nicolas", "nicolas", "nicby", "Smith" , "243232422", 20);
		agencia.registroEmpleado("JoaquinEmpleado", "joaquin", "Joaquuinxd", "Martinez" , "2232422", 21);
		agencia.registroEmpleador("JoaquinEmpleador", "joaquinempleador", "Joaquinxd" , "22332422",Constantes.FISICA, Constantes.SALUD);
		
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	

	@Test
	public void test1() {
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		
        TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("SALCHICHA", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("WASD", robot);
        
        JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
        TestUtils.clickComponent(botonLogin, robot);
        assertEquals("El mensaje es incorrecto",falsoOptionPane.getMensaje(),Mensajes.USUARIO_DESCONOCIDO.getValor());
	}
	
	@Test
	public void test2() {
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		
        TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("JoaquinEmpleado", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("joaqui", robot);
        
        JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
        TestUtils.clickComponent(botonLogin, robot);
        assertEquals("El mensaje es incorrecto",falsoOptionPane.getMensaje(),Mensajes.PASS_ERRONEO.getValor());
	}
	
	@Test
	public void test3() {
		JButton botonRegistrar1 = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REGISTRAR);
		TestUtils.clickComponent(botonRegistrar1, robot);
		
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
        TestUtils.tipeaTexto("contrasena1", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("NombreReal", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2233422711", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Perez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("12", robot);
      
		JButton botonRegistrar2 = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		TestUtils.clickComponent(botonRegistrar2, robot);
		
        assertEquals("El mensaje es incorrecto",falsoOptionPane.getMensaje(),Mensajes.PASS_NO_COINCIDE.getValor());
	}
	
	@Test
	public void test4() {
		JButton botonRegistrar1 = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REGISTRAR);
		TestUtils.clickComponent(botonRegistrar1, robot);
		
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleado = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADO);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("JoaquinEmpleado", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("joaquin", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("joaquin", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("Joaquuinxd", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2232422", robot);
        TestUtils.clickComponent(radioButton_Empleado, robot);
        TestUtils.clickComponent(cajaTexto_Apellido, robot);
        TestUtils.tipeaTexto("Martinez", robot);
        TestUtils.clickComponent(cajaTexto_edad, robot);
        TestUtils.tipeaTexto("21", robot);
 
		JButton botonRegistrar2 = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		TestUtils.clickComponent(botonRegistrar2, robot);
		
        assertEquals("El mensaje es incorrecto",falsoOptionPane.getMensaje(),Mensajes.USUARIO_REPETIDO.getValor());
	}
	
	@Test
	public void test5() {
		JButton botonRegistrar1 = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REGISTRAR);
		TestUtils.clickComponent(botonRegistrar1, robot);
		
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_USSER_NAME);
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_PASSWORD);
		JTextField cajaTexto_RepetirPassword = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_CONFIRM_PASSWORD);
		JTextField cajaTexto_Nombre_Real = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_REAL_NAME);
		JTextField cajaTexto_Telefono = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_TELEFONO);
		JRadioButton radioButton_Empleador = (JRadioButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.EMPLEADOR);
		JTextField cajaTexto_Apellido = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_APELLIDO);
		JTextField cajaTexto_edad = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_EDAD);
		
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("JoaquinEmpleado", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("joaquin", robot);
        TestUtils.clickComponent(cajaTexto_RepetirPassword, robot);
        TestUtils.tipeaTexto("joaquin", robot);
        TestUtils.clickComponent(cajaTexto_Nombre_Real, robot);
        TestUtils.tipeaTexto("Joaquuinxd", robot);
        TestUtils.clickComponent(cajaTexto_Telefono, robot);
        TestUtils.tipeaTexto("2232422", robot);
        TestUtils.clickComponent(radioButton_Empleador, robot);
 
		JButton botonRegistrar2 = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.REG_BUTTON_REGISTRAR);
		TestUtils.clickComponent(botonRegistrar2, robot);
		
        assertEquals("El mensaje es incorrecto",falsoOptionPane.getMensaje(),Mensajes.USUARIO_REPETIDO.getValor());
	}
	@Test
	public void test6() {
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		
        TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("admin", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("admin", robot);
        
        JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
        TestUtils.clickComponent(botonLogin, robot);
        
        
        JButton botonGatillarRonda= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.GATILLAR);
        TestUtils.clickComponent(botonGatillarRonda, robot);
        
        assertEquals("El mensaje es incorrecto",falsoOptionPane.getMensaje(),Mensajes.AGENCIA_EN_CONTRATACION.getValor());
        TestUtils.clickComponent(botonGatillarRonda, robot);
        assertEquals("El mensaje es incorrecto",falsoOptionPane.getMensaje(),Mensajes.AGENCIA_EN_BUSQUEDA.getValor());
	}

	@Test
	public void test7() {
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		
        TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("admin", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("admin", robot);
        
        JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
        TestUtils.clickComponent(botonLogin, robot);
        
        JButton botonGatillarRonda= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.GATILLAR);
        TestUtils.clickComponent(botonGatillarRonda, robot);
        
        JButton botonCerrarSesion= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.CERRARSESION);
        TestUtils.clickComponent(botonCerrarSesion, robot);
        
        cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		
        TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.borraJTextField(cajaTexto_Nombre_Usuario,robot);
        TestUtils.tipeaTexto("JoaquinEmpleado", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.borraJTextField(cajaTexto_Password,robot);
        TestUtils.tipeaTexto("joaquin", robot);
        
        botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
        TestUtils.clickComponent(botonLogin, robot);
        
        JButton botonNuevoTicket= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NUEVOTICKET);
        TestUtils.clickComponent(botonNuevoTicket, robot);
        
        JTextField cajaTexto_Remuneracion_Pretendida = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTFIELD_REMUNERACION);
        TestUtils.clickComponent(cajaTexto_Remuneracion_Pretendida, robot);
        TestUtils.tipeaTexto("12345", robot);
        
        assertEquals("El mensaje es incorrecto",falsoOptionPane.getMensaje(),Mensajes.ERROR_AGENCIA_EN_CONTRATACION.getValor());
	}
	
	@Test
	public void test8() {
		JTextField cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		JTextField cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		
        TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.tipeaTexto("admin", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.tipeaTexto("admin", robot);
        
        JButton botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
        TestUtils.clickComponent(botonLogin, robot);
        
        JButton botonGatillarRonda= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.GATILLAR);
        TestUtils.clickComponent(botonGatillarRonda, robot);
        
        JButton botonCerrarSesion= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.CERRARSESION);
        TestUtils.clickComponent(botonCerrarSesion, robot);
        
        cajaTexto_Password = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.PASSWORD);
		cajaTexto_Nombre_Usuario = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NOMBRE_USUARIO);
		
		TestUtils.clickComponent(cajaTexto_Nombre_Usuario, robot);
        TestUtils.borraJTextField(cajaTexto_Nombre_Usuario,robot);
        TestUtils.tipeaTexto("JoaquinEmpleador", robot);
        TestUtils.clickComponent(cajaTexto_Password, robot);
        TestUtils.borraJTextField(cajaTexto_Password,robot);
        TestUtils.tipeaTexto("joaquinempleador", robot);
        
        botonLogin = (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.LOGIN);
        TestUtils.clickComponent(botonLogin, robot);
        
        JButton botonNuevoTicket= (JButton) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.NUEVOTICKET);
        TestUtils.clickComponent(botonNuevoTicket, robot);
        
        JTextField cajaTexto_Remuneracion_Pretendida = (JTextField) TestUtils.getComponentForName((Component)controlador.getVista() ,Constantes.TEXTFIELD_REMUNERACION);
        TestUtils.clickComponent(cajaTexto_Remuneracion_Pretendida, robot);
        TestUtils.tipeaTexto("12345", robot);
        
        assertEquals("El mensaje es incorrecto",falsoOptionPane.getMensaje(),Mensajes.ERROR_AGENCIA_EN_CONTRATACION.getValor());
	}
	
	
	
	

}
